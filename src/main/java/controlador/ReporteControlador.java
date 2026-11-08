package controlador;

public class ReporteControlador {
    
    private static final String ROL_DIRECTORA = "Directora de Administración";

    public boolean validarAccesoResultados(String tipoUsuario){
        return tipoUsuario != null && tipoUsuario.trim().equalsIgnoreCase(ROL_DIRECTORA);
    }

    public boolean validarConsultaResultados(String idReporte, String tipoUsuario){
        return validarAccesoResultados(tipoUsuario) && idReporte != null && !idReporte.isBlank();
    }

    public boolean validarDatosGrafica(double[] datos){
        if (datos == null || datos.length == 0) {
            return false;
        }
        for (double dato : datos) {
            if (Double.isNaN(dato) || Double.isInfinite(dato) || dato < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean validarComparacion(double resultadoEvaluacion, double resultadoAutoevaluacion){
        return Double.isFinite(resultadoEvaluacion) && Double.isFinite(resultadoAutoevaluacion) && resultadoEvaluacion >= 0 && resultadoAutoevaluacion >= 0;
    }

    public boolean validarResultadoHistorico(String idReporte, String tipoUsuario){
        return validarConsultaResultados(idReporte, tipoUsuario);
    }
}

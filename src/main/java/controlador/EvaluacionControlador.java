package controlador;

public class EvaluacionControlador {
    public boolean validarAsignacion(
        String codigoEvaluador,
        String codigoEvaluado,
        boolean asignacionValida){

        return codigoEvaluador != null 
            && !codigoEvaluador.isBlank()
            && codigoEvaluado != null 
            && !codigoEvaluado.isBlank()
            && !codigoEvaluado.equals(codigoEvaluador)
            && asignacionValida;
        }

    public boolean validarAutoEvaluacion(
        String codigoUsuario,
        String codigoEvaluado){
        return codigoUsuario != null 
            && !codigoUsuario.isBlank()
            && codigoUsuario.equals(codigoEvaluado);
        }

    public boolean validarAntiguedad(int mesesAntiguedad){
        return mesesAntiguedad >= 6;
    }

    public boolean validarEvaluacionUnica(boolean evaluacionExistente){
        return !evaluacionExistente;
    }

    public boolean validarModificacion(boolean evaluacionEnviada){
        return !evaluacionEnviada;
    }

    public boolean validarRespuesta(String respuesta){
        return respuesta != null && !respuesta.isBlank();
    }

    public boolean validarRespuestas(String[] respuestas){
        if (respuestas == null || respuestas.length == 0) {
            return false;
        }
        for (String respuesta : respuestas) {
            if (!validarRespuesta(respuesta)) {
                return false;
            }
        }
        return true;
    }

    public boolean validarEnvio(String[] respuestas, boolean evaluacionEnviada){
        return !evaluacionEnviada && validarRespuestas(respuestas);
    }
}

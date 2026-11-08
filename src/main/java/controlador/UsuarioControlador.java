package controlador;

public class UsuarioControlador {

    private boolean validarIdUsuario(String idUsuario){
        if (idUsuario == null || !idUsuario.matches("\\d+")) {
            return false;
        }try{
            return Integer.parseInt(idUsuario) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validarRFC(String rfc) {
        return rfc != null && rfc.matches("[a-zA-Z0-9]+")
        && (rfc.length() == 9 || rfc.length() == 10);
    }

    public boolean validarCodigoEmpleado(String codigoEmpleado) {
        return codigoEmpleado != null && codigoEmpleado.matches("\\d+");
    }

    public boolean validarCredenciales(String usuario, String contrasena) {
        return usuario != null && contrasena != null && !usuario.isBlank() && !contrasena.isBlank();
    }

    public boolean validarDatosRegistro(
        String nombre,
        String codigoEmpleado,
        String rfc,
        String cargo,
        String puesto,
        String areaAdscripcion,
        String nombreUsuario,
        String contrasena){

    return nombre != null && !nombre.isBlank() 
        && validarCodigoEmpleado(codigoEmpleado)
        && validarRFC(rfc)
        && cargo != null && !cargo.isBlank()
        && puesto != null && !puesto.isBlank()
        && areaAdscripcion != null && !areaAdscripcion.isBlank()
        && validarCredenciales(nombreUsuario, contrasena);
        }

    private static final String ROL_DIRECTORA = "Directora de Administración";
    public boolean validarAdministrarUsuarios(String tipoUsuario){
        return tipoUsuario != null && tipoUsuario.trim().equalsIgnoreCase(ROL_DIRECTORA);
    }

    public boolean validarConsultaResultados(String tipoUsuario){
        return validarAdministrarUsuarios(tipoUsuario);
    }

    public boolean validarModificarUsuario(String tipoUsuario, String idUsuario){
        return validarAdministrarUsuarios(tipoUsuario) && validarIdUsuario(idUsuario);
    }

    public boolean validarEliminarUsuario(String tipoUsuario, String idUsuario){
        return validarAdministrarUsuarios(tipoUsuario) && validarIdUsuario(idUsuario);
    }
}


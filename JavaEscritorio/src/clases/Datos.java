
package clases;

public class Datos {
    public boolean validarUsuario(String usuario, String clave) {
        if (usuario.equals("mao") && clave.equals("123")) {
            return true;        
        }else {
            return false;        
        }
    }
}

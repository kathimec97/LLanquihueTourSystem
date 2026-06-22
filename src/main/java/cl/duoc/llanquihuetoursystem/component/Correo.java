package cl.duoc.llanquihuetoursystem.component;

import cl.duoc.llanquihuetoursystem.util.CorreoInvalidException;

/**
 * Clase componente que registra el correo electronico
 * @author Katherine Avila
 */
public class Correo {

    private String correo;

    /**
     * constructor con el parametro que ha de recibir y control de formato mediante excepcion
     * @param correo
     * @throws CorreoInvalidException
     */
    public Correo(String correo) throws CorreoInvalidException {
        if(correo == null || !correo.contains("@") || (!correo.endsWith(".cl") && !correo.endsWith(".com"))){
           throw new CorreoInvalidException("El correo debe contener @ y terminar en .cl o .com");

        }
        this.correo = correo;
    }

    /**
     * obtiene el correo ingresado
     * @return el correo ingresado
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * modifica el correo registrado
     * @param correo nuevo correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * muestra en consola una representacion en texto de correo
     * @return correo
     */
    @Override
    public String toString() {
        return correo;
    }
}

package cl.duoc.llanquihuetoursystem.model;

import cl.duoc.llanquihuetoursystem.util.TelefonoInvalidException;

/**
 * clase componente que registra el numero de telefono
 * @author Katherine Avila
 */
public class Telefono {
    private String numero;

    /**
     * constructor con el parametro que va a recibir
     *
     * @param numero de telefono
     * @throws TelefonoInvalidException excepcion que verifica el formato numerico
     */
    public Telefono(String numero) throws TelefonoInvalidException {

        if (numero == null || numero.length()!= 9){
            throw  new TelefonoInvalidException("El telefono debe contener exactamente 9 digitos ( sin puntos ni guion)");
        }
        this.numero= numero;
    }

    /**
     * obtiene el numero de telefono
     * @return el numero de telefono
     */
    public String getNumero() {
        return numero;
    }

    /**
     * modifica el numero de telefono
     * @param numero numero de telefono modificado
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * muestra en la consola una representacion en texto de "numero"
     * @return el objeto numero en formato de texto
     */
    @Override
    public String toString() {
        return numero;
    }
}

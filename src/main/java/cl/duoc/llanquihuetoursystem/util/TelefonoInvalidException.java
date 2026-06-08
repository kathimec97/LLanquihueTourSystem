package cl.duoc.llanquihuetoursystem.util;

/**
 * excepcion personalizada que permite validar el formato del numero de telefono
 */
public class TelefonoInvalidException extends Exception {
    public TelefonoInvalidException(String message) {
        super(message);
    }
}

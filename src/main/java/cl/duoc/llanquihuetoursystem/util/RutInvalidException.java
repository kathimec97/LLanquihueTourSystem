package cl.duoc.llanquihuetoursystem.util;

/**
 * excepcion personalizada que permite validar el formato del Rut
 */
public class RutInvalidException extends Exception {
    public RutInvalidException(String message) {
        super(message);
    }
}

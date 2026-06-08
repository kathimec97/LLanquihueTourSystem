package cl.duoc.llanquihuetoursystem.model;

import cl.duoc.llanquihuetoursystem.util.RutInvalidException;

/**
 * clase componente que registra el rut
 * @author Katherine Avila
 */
public class Rut {
    private String numero;

    /**
     * constructor que recibe el RUT y valida su formato
     */

    public Rut(String numero) throws RutInvalidException{

        if(!numero.matches("[0-9]+-[0-9kK]")) {
            throw new RutInvalidException("Formato de Rut no valido (sin puntos, con guion)");
        }

        this.numero = numero;
    }

    /**
     * retorna el numero de rut
     */
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}




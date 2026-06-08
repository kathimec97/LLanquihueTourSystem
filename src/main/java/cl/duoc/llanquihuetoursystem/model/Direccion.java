package cl.duoc.llanquihuetoursystem.model;

/**
 * clase componente que registra direcciones
 * @author Katherine Avila
 */
public class Direccion {


    private String calle;
    private int numero;
    private String comuna;


    /**
     * constructor de la clase con los parametros que va a ser definidos
     * @param calle
     * @param numero
     * @param comuna
     */
    public Direccion(String calle, int numero, String comuna) {
        this.calle = calle;

        if(numero <= 0) {
            throw new IllegalArgumentException("El numero de la direccion debe ser mayor a 0");
        }
        this.numero = numero;
        this.comuna = comuna;

    }

    /**
     * Obtiene el nombre de la calle
     * @return nombre de la calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     *modifica el nombre de la calle
     * @param calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * obtiene el numero de la direccion
     * @return el numero especifico de la direccion
     */
    public int getNumero() {
        return numero;
    }

    /**
     * modifica el numero de la direccion
     * @param numero especifico de la direccion
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * obtiene la comuna de la direccion
     * @return
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * modifica la comuna de la direccion
     * @param comuna
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * imprime en consola una representacion de los datos de la direccion
     * @return calle, numero, comuna.
     */
    public String toString() {
        return calle + ", " + numero + ", " + comuna;
    }
}
package cl.duoc.llanquihuetoursystem.model;

import cl.duoc.llanquihuetoursystem.util.CorreoInvalidException;
import cl.duoc.llanquihuetoursystem.util.RutInvalidException;
import cl.duoc.llanquihuetoursystem.util.TelefonoInvalidException;

/**
 * la clase 'Empresa' representa a los ingresos de personas juridicas
 * especificamente proveedores/operadores de servicios
 * <p>
 * esta clase extiende mediante herencia a la clase contacto
 *
 * @author Katherine Avila
 */
public class Empresa extends Contacto {
    private String razonSocial;
    private String rolComercial; // es proveedor o operador local
    private String servicio; //transporte, alojamiento....
    private int capacidadMax; //asientos, habitaciones...

    /**
     * constructor con los parametros que recibirá al crear un nuevo objeto empresa
     *
     * @param id
     * @param numeroRut
     * @param razonSocial
     * @param rolComercial
     * @param servicio
     * @param capacidadMax
     * @param correo
     * @param numeroTelefono
     * @param calle
     * @param numeroCasa
     * @param comuna
     * @throws RutInvalidException
     * @throws CorreoInvalidException
     * @throws TelefonoInvalidException
     */
    public Empresa(String id, String numeroRut, String razonSocial, String rolComercial,
                   String servicio, String correo, String numeroTelefono, String calle, int numeroCasa, String comuna, int capacidadMax)
            throws RutInvalidException, CorreoInvalidException, TelefonoInvalidException {
//valida que el id de la empresa tenga el formato correcto (Ej: 'EMP01')
        if (id == null || !id.trim().matches("^EMP\\d+$")) {
            throw new IllegalArgumentException("Error: El ID debe la Empresa debe comenzar con EMP (Ej: EMP01");
        }
        super(id.trim(), numeroRut, correo, numeroTelefono, calle, numeroCasa, comuna);

        this.razonSocial = razonSocial;
        this.rolComercial = rolComercial;
        this.servicio = servicio;
        setCapacidadMax(capacidadMax);
    }

    /**
     * obtiene la razon social (nombre) de la empresa
     *
     * @return
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Modifica la razon social de la empresa
     *
     * @param razonSocial
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * obtiene el rol que desempeña la empresa ( es un operador local o un proveedor)
     *
     * @return el tipo de rol que desempeña
     */
    public String getRolComercial() {
        return rolComercial;
    }

    /**
     * modifica el rol registrado
     *
     * @param rolComercial modificado
     */
    public void setRolComercial(String rolComercial) {
        this.rolComercial = rolComercial;
    }

    /**
     * obtiene el Servicio prestado por la empresa (transporte o alojamiento...)
     *
     * @return el tipo de servicio que entrega
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * modifica el servicio prestado por la empresa
     *
     * @param servicio modificado
     */
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    /**
     * obtiene la capacidad maxima de habitaciones o asientos que tienen disponibles
     *
     * @return capacidad de habitaciones o asientos
     */
    public int getCapacidadMax() {
        return capacidadMax;
    }

    /**
     * modifica la capacidad maxima de habitaciones o asientos que tienen disponibles
     *
     * @param capacidadMax modificada
     */
    public void setCapacidadMax(int capacidadMax) {
        if (capacidadMax <= 0) {
            throw new IllegalArgumentException("La capacidad Maxima no puede ser negativa");
        }
        this.capacidadMax = capacidadMax;
    }

    /**
     * representacion en formato texto de los datos de la empresa
     *
     * @return cadena de texto con los datos de la empresa
     */
    @Override
    public String toString() {
        return super.toString() + "\n " +
                " Razon Social: " + razonSocial + "\n " +
                " Rol Comercial: " + rolComercial + "\n " +
                " Servicio: " + servicio + "\n " +
                " Capacidad Maxima: " + capacidadMax;

    }
}

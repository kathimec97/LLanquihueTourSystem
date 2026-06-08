package cl.duoc.llanquihuetoursystem.model;

import cl.duoc.llanquihuetoursystem.util.CorreoInvalidException;
import cl.duoc.llanquihuetoursystem.util.RutInvalidException;
import cl.duoc.llanquihuetoursystem.util.TelefonoInvalidException;

/**
 * el proposito de esta clase es agrupar las caracteristicas exclusivas de las
 * personas naturales, especificamente de los clientes de Llanquihue Tour.
 * Adicionalmente extiende los atributos de contacto mediante herencia
 * @author Katherine Avila
 */
public class Cliente extends Contacto {
    private String nombre;
    private String apellido;
    private String restriccionesAlimenticias;
    private String fechaRegistro;


    /**
     * constructor con los parametros que recibira el objeto cliente
     * @param id
     * @param numeroRut
     * @param nombre
     * @param apellido
     * @param correo
     * @param numeroTelefono
     * @param calle
     * @param numeroCasa
     * @param comuna
     * @param restriccionesAlimenticias
     * @param fechaRegistro
     * @throws RutInvalidException
     * @throws CorreoInvalidException
     * @throws TelefonoInvalidException
     */
    public Cliente(int id, String numeroRut, String nombre, String apellido, String correo, String numeroTelefono, String calle, int numeroCasa, String comuna, String restriccionesAlimenticias, String fechaRegistro)
            throws RutInvalidException, CorreoInvalidException, TelefonoInvalidException {

        super(id, numeroRut, correo, numeroTelefono, calle, numeroCasa, comuna);

        this.nombre = nombre;
        this.apellido = apellido;
        this.restriccionesAlimenticias = restriccionesAlimenticias;
        this.fechaRegistro = fechaRegistro;


    }

    /**
     * obtiene el nombre del cliente
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * modifica el nombre registrado del cliente
     * @param nombre nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * obtiene el apellido del cliente
     * @return el apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * modifica el nombre registrado del cliente
     * @param apellido nuevo del cliente
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene las restricciones de alimentos que especifica el cliente
     * @return
     */
    public String getRestriccionesAlimenticias() {
        return restriccionesAlimenticias;
    }

    /**
     * modifica las restricciones de alimentos ya registradas
     * @param restriccionesAlimenticias modificadas
     */
    public void setRestriccionesAlimenticias(String restriccionesAlimenticias) {
        this.restriccionesAlimenticias = restriccionesAlimenticias;
    }

    /**
     * obtiene la fecha de registro del cliente
     * @return la fecha de registro del cliente
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * modifica la fecha de registro
     * @param fechaRegistro nueva del cliente
     */
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * muestra en consola una representacion en texto de los datos del cliente
     * @return una cadena de texto con los datos del cliente
     */
    @Override
    public String toString() {

        return    super.toString() + "\n" +
                "  Nombre: " + nombre + "\n" +
                "  Apellido: " + apellido + "\n" +
                "  Restricciones Alimenticias: " +  restriccionesAlimenticias + "\n" +
                "  FechaRegistro: " + fechaRegistro + "\n";

    }
}

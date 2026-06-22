package cl.duoc.llanquihuetoursystem.model;

import cl.duoc.llanquihuetoursystem.util.CorreoInvalidException;
import cl.duoc.llanquihuetoursystem.util.RutInvalidException;
import cl.duoc.llanquihuetoursystem.util.TelefonoInvalidException;

/**
 * Clase 'Empleado' almacena los datos de los empleados de LLanquihue Tour
 * adicionalmente extiende los atributos de la clase 'contacto' mediante herencia
 * @author Katherine Avila
 */
public class Empleado extends Contacto {
    private String nombre;
    private String apellido;
    private String cargo;
    private int sueldo;
    private boolean licenciaConduccion;

    /**
     * Constructor con los parametros a recibir al crear el objeto Empleado
     * Manejo del campo de sueldo, en caso de que por error se registre cero,
     * mediante una excepcion
     * @param nombre
     * @param apellido
     * @param cargo
     * @param sueldo
     * @param licenciaConduccion
     * @param id
     * @param numeroRut
     * @param correo
     * @param numeroTelefono
     * @param calle
     * @param numeroCasa
     * @param comuna
     * @throws RutInvalidException
     * @throws CorreoInvalidException
     * @throws TelefonoInvalidException
     */
    public Empleado(String id, String numeroRut, String nombre, String apellido, String correo, String numeroTelefono, String calle, int numeroCasa, String comuna, String cargo, int sueldo, boolean licenciaConduccion) throws RutInvalidException, CorreoInvalidException, TelefonoInvalidException
    {//Verifica qe el ID de Empleado tenga el formato correcto (Ej: 'E01')
        if(id == null || !id.trim().matches("^E\\d+$")){
            throw new IllegalArgumentException("Error: el ID del Empleado debe comenzar con E seguido de números(Ej: E01)");
        }
        super(id.trim(), numeroRut, correo, numeroTelefono, calle, numeroCasa, comuna);
        this.nombre= nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        setSueldo(sueldo);
        this.licenciaConduccion = licenciaConduccion;

    }

    /**
     * Obtiene el nombre del Empleado
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del Empleado
     * @param nombre modificado del Empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del Empleado
     * @return el apellido del Empleado
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Modifica el apellido del Empleado
     * @param apellido modificado del Empleado
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el Cargo del Empleado
     * @return cargo del empleado
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Modifica el cargo del empleado
     * @param cargo modificado del Empleado
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtiene el sueldo del empleado
     * @return sueldo del empleado
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * modifica el sueldo del empleado
     * @param sueldo del empleado
     */
    public void setSueldo(int sueldo) {
        if(sueldo <= 0){
            throw new IllegalArgumentException("el campo sueldo debe contener numeros positivos");
        }
        this.sueldo = sueldo;
    }

    /**
     * Consulta estado de la licencia de conducir del empleado
     * @return true: si tiene licencia/ false: si no tiene licencia
     */
    public boolean isLicenciaConduccion() {
        return licenciaConduccion;
    }

    /**
     * modifica estado de la licencia de conducir del empleado
     * @param licenciaConduccion al dia: true/ no esta al dia: False
     */
    public void setLicenciaConduccion(boolean licenciaConduccion) {
        this.licenciaConduccion = licenciaConduccion;
    }


    /**
     * Representacion en formato texto de los datos del empleado en el sistema
     * @return cadena de texto con los datos del empleado
     */
    @Override
    public String toString() {
        return  super.toString() + "\n" +
                " Nombre: " + nombre + "\n" +
                " Apellido: " + apellido + "\n" +
                " Cargo: " + cargo + "\n" +
                " Sueldo: " + sueldo + "\n" +
                " ¿Posee licencia de Conducir?: " + (this.licenciaConduccion ? "sí" : "No");

    }
}

package cl.duoc.llanquihuetoursystem.model;

import cl.duoc.llanquihuetoursystem.component.Correo;
import cl.duoc.llanquihuetoursystem.component.Direccion;
import cl.duoc.llanquihuetoursystem.component.Rut;
import cl.duoc.llanquihuetoursystem.component.Telefono;
import cl.duoc.llanquihuetoursystem.util.CorreoInvalidException;
import cl.duoc.llanquihuetoursystem.util.RutInvalidException;
import cl.duoc.llanquihuetoursystem.util.TelefonoInvalidException;

/**
 *La clase base 'Contacto' representa a cualquier nuevo ingreso al sistema LLanquihue Tour
 *
 *Se utiliza la clase componente 'rut' para asegurar el formato correcto tanto
 *para personas naturales(cliente/empleados) como empresas(Proveedores/Operadores) aplicando excepciones personalizadas.
 *
 * Se utiliza la clase componente 'Telefono' para asegurar el formato correcto
 * bajo la normativa chilena aplicando excepciones personalizadas.
 *
 * La clase componente 'Direccion' encapsula de forma estructurada la calle, numero y comuna.
 *
 * @author Katherine Avila
 */
public class Contacto {
    private final String id;//final para asegurar que no se pueda cambiar
    private Rut rut;
    private Correo correo;
    private Telefono telefono;
    private Direccion direccion;

    /**
     * Constructor de Contacto
     * Implementacion de las clases componentes mediante "new" dentro del bloque.
     *
     * @param id
     * @param numeroRut
     * @param correo
     * @param numeroTelefono
     * @param calle
     * @param numeroCasa
     * @param comuna
     * @throws RutInvalidException
     * @throws TelefonoInvalidException
     */
    public Contacto(String id, String numeroRut,String correo, String numeroTelefono, String calle, int numeroCasa, String comuna) throws RutInvalidException, TelefonoInvalidException, CorreoInvalidException {
        //verifica que el ID no esté vacío ni que tenga espacios. Además válida el formato general: letras mayúsculas y números
        if(id == null|| id.trim().isEmpty()){
            throw new IllegalArgumentException("Error: el ID no puede estar vacío.");
        }
        if(!id.trim().matches("^[A-Z]+\\d+$")) {
            throw new IllegalArgumentException("Error: el ID debe tener letras mayusculas seguidas de números. ");
        }

// Inicializacion de los componentes
        this.id = id.trim();
        this.rut = new Rut(numeroRut);
        this.correo = new Correo(correo);
        this.telefono = new Telefono(numeroTelefono);
        this.direccion = new Direccion(calle, numeroCasa, comuna);

    }

    /**
     * obtiene un digito identificador correspondiente a un nuevo registro
     * @return el digito asignado al registro
     */
    public String getId() {
        return id;
    }


    /**
     * obtiene el numero de rut del nuevo contacto
     * @return el numero de rut del nuevo contacto
     */
    public Rut getRut() {
        return rut;
    }

    /**
     * modifica el numero de rut del nuevo contacto
     * @param rut modificado
     */
    public void setRut(Rut rut) {
        this.rut = rut;
    }

    /**
     * obtiene el correo del nuevo contacto
     * @return el correo del nuevo contacto
     */
    public Correo getCorreo() {
        return correo;
    }

    /**
     * modifica el correo electronico del nuevo contacto
     * @param correo  modificado
     */
    public void setCorreo(Correo correo) {
        this.correo = correo;
    }

    /**
     * obtiene el numero de telefono del nuevo contacto
     * @return el numero de telefono del nuevo contacto
     */
    public Telefono getTelefono() {
        return telefono;
    }

    /**
     * modifica el numero de telefono del contacto
     * @param telefono modificado
     */
    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    /**
     * obtiene la direccion del nuevo contacto
     * @return la direccion del nuevo contacto
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * modifica la direccion del nuevo contacto
     * @param direccion modificada
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * muestra en consola una representacion textual de los datos del contacto
     * @return una representacion en formato texto de los datos del contacto
     */
    @Override
    public String toString() {
        return
                " ID: " + id + "\n" +
                " Rut: " + rut +"\n" +
                " Correo: " + correo +"\n" +
                " Telefono: " + telefono +"\n" +
                " Direccion: " + direccion;
    }
}

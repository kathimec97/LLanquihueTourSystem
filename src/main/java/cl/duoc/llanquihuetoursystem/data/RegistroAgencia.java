package cl.duoc.llanquihuetoursystem.data;

import cl.duoc.llanquihuetoursystem.component.Rut;
import cl.duoc.llanquihuetoursystem.model.Cliente;
import cl.duoc.llanquihuetoursystem.model.Empleado;
import cl.duoc.llanquihuetoursystem.model.Empresa;
import cl.duoc.llanquihuetoursystem.util.CorreoInvalidException;
import cl.duoc.llanquihuetoursystem.util.RutInvalidException;
import cl.duoc.llanquihuetoursystem.util.TelefonoInvalidException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de administrar los datos de los archivos.txt por medio de listas
 * incluye métodos para cargar los datos de cada archivo en la  colección correspondiente
 * Método para mostrar los datos en consola
 * Método para filtrar por rut en cada lista
 * Método para filtrar los tipos de empresas, por medio del rol del comercio
 * @Author Katherine Avila
 */
public class RegistroAgencia {

    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private List<Cliente> clienteList = new ArrayList<>();
    private List<Empleado> empleadosList = new ArrayList<>();
    private List<Empresa> empresasList = new ArrayList<>();

    public RegistroAgencia() throws RutInvalidException, CorreoInvalidException, TelefonoInvalidException {
        this.clienteList = new ArrayList<>();
        this.empleadosList = new ArrayList<>();
        this.empresasList = new ArrayList<>();
    }

    /**
     *
     * Métodos cargarClientes()
     * cargarEmpleados()
     * cargarEmpresas()
     * Para la lectura de los archivos
     * cliente.txt
     * empleado.txt
     * empresa.txt
     * y agregar los datos a las colecciones correspondientes
     */
    //Cargar clientes
    public void cargarClientes() {

        DateTimeFormatter formatoArchivo = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/cliente.txt"))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;

                String[] datos = linea.split(",");
                for (int i = 0; i < datos.length; i++) {
                    datos[i] = datos[i].trim();
                }

                String fecha = datos[10];

                LocalDate fechaRegistro = LocalDate.parse(fecha, formatoArchivo);


                Cliente cliente = null;
                cliente = new Cliente(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], Integer.parseInt(datos[7]), datos[8], datos[9], fechaRegistro);

                clienteList.add(cliente);
            }
            System.out.println("Clientes cargados exitosamente. Total: " + clienteList.size());
        } catch (IOException | RutInvalidException | CorreoInvalidException | DateTimeException |
                 TelefonoInvalidException e) {
            System.out.println("Error al cargar clientes : " + e.getMessage());
        }

    }

    //Cargar empleados
    public void cargarEmpleados() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/empleado.txt"))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;

                String[] datos = linea.split(",");

                for (int i = 0; i < datos.length; i++) {
                    datos[i] = datos[i].trim();
                }
                Empleado empleado = null;

                empleado = new Empleado(datos[0], datos[1], datos[2], datos[3],
                        datos[4], datos[5], datos[6],
                        Integer.parseInt(datos[7]), datos[8], datos[9], Integer.parseInt(datos[10]), datos[11].equalsIgnoreCase("si"));

                empleadosList.add(empleado);
            }
            System.out.println("Empleados cargados exitosamente. Total: " + empleadosList.size());
        } catch (IOException | RutInvalidException | CorreoInvalidException | TelefonoInvalidException e) {
            System.out.println("Error al cargar empleados : " + e.getMessage());
        }
    }

    //cargar Empresas
    public void cargarEmpresas() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/empresa.txt"))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;

                String[] datos = linea.split(",");
                for (int i = 0; i < datos.length; i++) {
                    datos[i] = datos[i].trim();
                }
                Empresa empresa = null;

                empresa = new Empresa(datos[0], datos[1], datos[2], datos[3],
                        datos[4], datos[5], datos[6],
                        datos[7], Integer.parseInt(datos[8]), datos[9], Integer.parseInt(datos[10]));

                empresasList.add(empresa);
            }
            System.out.println("Empresas cargadas exitosamente. Total: " + empresasList.size());
        } catch (IOException | RutInvalidException | CorreoInvalidException | TelefonoInvalidException e) {
            System.out.println("Error al cargar empresas : " + e.getMessage());
        }

    }

    //Método que permite cargar todos los datos
    public void cargarListas() {
        cargarClientes();
        cargarEmpleados();
        cargarEmpresas();

    }

    /**
     * Método para Mostrar en consola los datos de la lista Clientes
     */
    public void mostrarClientes() {
        if (clienteList == null || clienteList.isEmpty()){
            System.out.println(("No hay clientes cargados en el sistema."));
            return;
        }
        for (Cliente c: clienteList) {
            System.out.println(c);
        }
    }
    /**
     * Método para Mostrar en consola los datos de la lista Empleados
     */
    public void mostrarEmpleados() {
        if (empleadosList == null || empleadosList.isEmpty()){
            System.out.println(("No hay empleados cargados en el sistema."));
            return;
        }
        for (Empleado e: empleadosList) {
            System.out.println(e);
        }
    }

    /**
     * Método para Mostrar en consola los datos de la lista de Empresa
     */
    public void mostrarEmpresas() {
        if (empresasList == null || empresasList.isEmpty()){
            System.out.println(("No hay empresas cargados en el sistema."));
            return;
        }
        for (Empresa emp: empresasList) {
            System.out.println(emp);
        }
    }



    /**
     * Método para realizar búsqueda por rut tanto para Empleados como para Empresas y clientes
     *
     * @param rutBuscado
     * @return datos de Clientes, Empresas, Empleados
     */
    //Método de búsqueda por Rut
    //Buscar en la lista de clientes
    public Object buscarRut(Rut rutBuscado) throws RutInvalidException {
       String rutFormateado = rutBuscado.getNumero();

            for (Cliente c : clienteList) {
                if (c.getRut().getNumero().trim().equals(rutFormateado)) {
                    System.out.println("Registro Encontrado Exitosamente");
                    System.out.println(c);
                    return c;
                }
            }
            //Buscar en la lista de empleados
            for (Empleado e : empleadosList) {
                if (e.getRut().getNumero().trim().equals(rutFormateado)) {
                    System.out.println("Registro Encontrado Exitosamente");
                    System.out.println(e);
                    return e;
                }
            }

            //Buscar en la lista de empresas
            for (Empresa em : empresasList) {
                if (em.getRut().getNumero().trim().equals(rutFormateado)) {
                    System.out.println("Registro Encontrado Exitosamente");
                    System.out.println(em);
                    return em;
                }
            }

        System.out.println("El rut ingresado no coincide con nigun registro");
        return null;
    }

    /**
     * Método para filtrar a las Empresas por su Rol comercial (Proveedores/Operadores Locales)
     *
     * @param rolBusqueda
     */
    //método de búsqueda: empresas por rol comercial
    public void rolEmpresa(String rolBusqueda) {
        System.out.println("\n--- Lista de Empresas con rol: " + rolBusqueda + "---");
        boolean encontro = false;
        for (Empresa emp : empresasList) {
            if (emp.getRolComercial().trim().equalsIgnoreCase(rolBusqueda.trim())) {
                System.out.println(emp);
                encontro = true;
            }
        }
        if (!encontro) {
            System.out.println("No se encontraron empresas asociadas al rol: " + rolBusqueda);
        }

    }




    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public List<Empleado> getEmpleadosList() {
        return empleadosList;
    }

    public List<Empresa> getEmpresasList() {
        return empresasList;
    }
}


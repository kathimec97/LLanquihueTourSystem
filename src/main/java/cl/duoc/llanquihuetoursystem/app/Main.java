package cl.duoc.llanquihuetoursystem.app;

import cl.duoc.llanquihuetoursystem.component.Rut;
import cl.duoc.llanquihuetoursystem.datamanager.RegistroAgencia;
import cl.duoc.llanquihuetoursystem.model.Cliente;
import cl.duoc.llanquihuetoursystem.model.Empleado;
import cl.duoc.llanquihuetoursystem.model.Empresa;
import cl.duoc.llanquihuetoursystem.util.CorreoInvalidException;
import cl.duoc.llanquihuetoursystem.util.RutInvalidException;
import cl.duoc.llanquihuetoursystem.util.TelefonoInvalidException;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class Main {
    public Main() throws RutInvalidException, CorreoInvalidException, TelefonoInvalidException {
    }

    public static void main(String[] args) throws RutInvalidException, CorreoInvalidException, TelefonoInvalidException {


        System.out.println("=== INICIANDO PRUEBAS DE REGISTRO LLANQUIHUE TOUR ===\n");
        RegistroAgencia agencia = null;

        // 1. Probar el Constructor y capturar excepciones iniciales
        try {
            agencia = new RegistroAgencia();
            System.out.println("[OK] Instancia de RegistroAgencia creada con éxito.\n");
        } catch (Exception e) {
            System.out.println("[ERROR] No se pudo inicializar la agencia: " + e.getMessage());
            return;
        }

        // 2. Probar la carga de listas (Validaciones de archivos)

        System.out.println("--- Cargando datos desde archivos ---");
        agencia.cargarListas();
        System.out.println();

        // 3. Probar los métodos de visualización
        System.out.println("--- Mostrando Clientes Cargados ---");
        agencia.mostrarClientes();
        System.out.println();

        System.out.println("--- Mostrando Empleados Cargados ---");
        agencia.mostrarEmpleados();
        System.out.println();

        System.out.println("--- Mostrando Empresas Cargadas ---");
        agencia.mostrarEmpresas();
        System.out.println();


        // 4. Probar el método de búsqueda por RUT (buscarRut)
        System.out.println("--- Probando Búsqueda por RUT ---");
        try {

            Rut rutClienteValido = new Rut("15876543-3");
            Rut rutInexistente = new Rut("99999999-9");

            System.out.println("Buscando RUT existente (Cliente):");
            agencia.buscarRut(rutClienteValido);
            System.out.println();

            System.out.println("Buscando RUT que no está en el sistema:");
            agencia.buscarRut(rutInexistente);
            System.out.println();

        } catch (Exception e) {
            System.out.println("[ERROR] Error al instanciar o buscar el RUT: " + e.getMessage());
        }


        // 5. Probar el filtro de Empresas por Rol Comercial
        System.out.println("--- Probando Filtro de Empresas por Rol ---");

        // Prueba con un rol que existe
        agencia.rolEmpresa("Proveedor");

        // Prueba con minúsculas/mayúsculas
        agencia.rolEmpresa("operador local");

        // Prueba con un rol que NO existe
        agencia.rolEmpresa("Transporte");

        //prueba de ID

        try {
            Empleado empleadoTest = new Empleado("E123", "55678987-3", "camilo", "estrada", "camilo@estradagmail.com", "934928079", "lanalhue", 1280, "chillan", "secretario", 650000, false);

            agencia.getEmpleadosList().add(empleadoTest);
            System.out.println("Empleado agregado exitosamente");
        } catch (Exception e ) {
            System.out.println("No se pudo agregar al empleado: " + e.getMessage());
        }

        agencia.mostrarEmpleados();

    }


        }




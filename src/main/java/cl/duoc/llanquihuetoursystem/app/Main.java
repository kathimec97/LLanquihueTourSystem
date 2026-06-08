package cl.duoc.llanquihuetoursystem.app;

import cl.duoc.llanquihuetoursystem.model.Cliente;
import cl.duoc.llanquihuetoursystem.model.Empleado;
import cl.duoc.llanquihuetoursystem.model.Empresa;
import cl.duoc.llanquihuetoursystem.util.CorreoInvalidException;
import cl.duoc.llanquihuetoursystem.util.RutInvalidException;
import cl.duoc.llanquihuetoursystem.util.TelefonoInvalidException;

public class Main {
    public static void main(String[] args) {


try{
    System.out.println("---Registro de Nuevo Cliente---");
Cliente nuevoCliente = new Cliente(101, "18456789-k", "Ana", "Silva", "ana.silva@gmail.com", "987654321","San Pedro", 210, "Puerto Varas", "Intolerante al gluten y lactosa", "08/06/2026" );
    System.out.println(nuevoCliente);

    System.out.println("---Registro de Empleados---");
    Empleado nuevoEmpleado = new Empleado("Carlos", "Molina", "Guia de Turismo de alta Montaña",850000,true, 202, "15333444-5", "carlos.guia@llanquihue.cl", "911112222","Av. Vicente Perez Rosales",450, "Llanquihue");
    System.out.println(nuevoEmpleado);

    System.out.println("---Registro de Empresa---");
    Empresa nuevaEmpresa = new Empresa(303, "76123456-7", "Navegacion Lacustre Frutillar S.A", "Operador Local", "Paseos guiados en lancha y catamaran por el lago llanquihue", 45, "contacto@navfrutillar.com","933334444", "Costanera Bernardo Philippi", 12, "Frutillar");
    System.out.println(nuevaEmpresa);




} catch (RutInvalidException | TelefonoInvalidException | CorreoInvalidException | IllegalArgumentException e) {
    System.out.println("Error en los siguientes datos: " + e.getMessage());;
}
    }
    }

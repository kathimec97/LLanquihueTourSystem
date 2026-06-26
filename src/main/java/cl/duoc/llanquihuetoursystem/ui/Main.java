package cl.duoc.llanquihuetoursystem.ui;

import cl.duoc.llanquihuetoursystem.component.Rut;
import cl.duoc.llanquihuetoursystem.data.GestorServicios;
import cl.duoc.llanquihuetoursystem.data.RegistroAgencia;
import cl.duoc.llanquihuetoursystem.model.Empleado;
import cl.duoc.llanquihuetoursystem.util.CorreoInvalidException;
import cl.duoc.llanquihuetoursystem.util.RutInvalidException;
import cl.duoc.llanquihuetoursystem.util.TelefonoInvalidException;

public class Main {
    public Main() throws RutInvalidException, CorreoInvalidException, TelefonoInvalidException {
    }

    public static void main(String[] args) throws RutInvalidException, CorreoInvalidException, TelefonoInvalidException {



        GestorServicios gestor = new GestorServicios();
        System.out.println("=== Lista de servicios turísticos===");
        gestor.mostrarServicios();

    }


        }




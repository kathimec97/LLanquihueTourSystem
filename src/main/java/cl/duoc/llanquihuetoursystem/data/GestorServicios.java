package cl.duoc.llanquihuetoursystem.data;

import cl.duoc.llanquihuetoursystem.model.ExcursionCultural;
import cl.duoc.llanquihuetoursystem.model.PaseoLacustre;
import cl.duoc.llanquihuetoursystem.model.RutaGastronomica;
import cl.duoc.llanquihuetoursystem.model.ServicioTuristico;

/**
 * Clase encargada de la gestion y generación de datos para los
 * diferentes servicios turísticos de la agencia
 * @Author Katherine Avila
 */
public class GestorServicios {

    //Metodo que permite mostrar los nuevos objetos en consola
    public void mostrarServicios() {
        //Ruta Gastonomica
        ServicioTuristico ruta1 = new RutaGastronomica("Sabores del Lago", 3.5, 4);
        ServicioTuristico ruta2 = new RutaGastronomica("Ruta de la cerveza Artesanal y Quesos", 5.0, 6);

        //Paseos Lacustres
        ServicioTuristico paseo1 = new PaseoLacustre("Navegacion atardecer en LLanquihue", 2.0, "Catamarán");
        ServicioTuristico paseo2 = new PaseoLacustre("Aventura express Isla de los pajaron", 1.5, "Lancha Motorizada");

        //Excursiones culturales

        ServicioTuristico excursion1 = new ExcursionCultural("Vestigios de la colonización Alemana", 4.0, "Teatro del Lago y Casonas de Frutillar");
        ServicioTuristico excursion2 = new ExcursionCultural("Ruta de las Iglesias Patrimoniales", 6.5, "Iglesia del Sagrado Corazon de Puerto Varas");

        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}

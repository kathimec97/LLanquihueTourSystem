package cl.duoc.llanquihuetoursystem.model;

/**
 * superclase que representa los diferentes servicios turísticos ofrecidos por la agencia
 * @author Katherine Avila
 */
public class ServicioTuristico {
    private String nombre;
    private double duracionHoras;

    public ServicioTuristico(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre + "\n" +
                "Duración: " + duracionHoras;
    }
}

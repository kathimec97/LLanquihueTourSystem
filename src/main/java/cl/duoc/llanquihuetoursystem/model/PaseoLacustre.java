package cl.duoc.llanquihuetoursystem.model;

/**
 * Clase que representa los diferentes Paseos Lacustres ofrecidos por la agencia
 * @author Katherine Avila
 */
public class PaseoLacustre extends ServicioTuristico{
    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return "Paseo lacustre: " + "\n"
                + super.toString() + "\n" +
                "Tipo de embarcación: " + tipoEmbarcacion;
    }
}

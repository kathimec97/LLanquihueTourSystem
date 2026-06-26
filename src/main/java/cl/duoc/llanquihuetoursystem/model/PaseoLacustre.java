package cl.duoc.llanquihuetoursystem.model;

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
        return "Paseo lacustre: " + "\n" +
                "Tipo de embarcación='" + tipoEmbarcacion;
    }
}

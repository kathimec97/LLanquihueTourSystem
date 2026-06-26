package cl.duoc.llanquihuetoursystem.model;

/**
 * Clase que representa las diferentes excursiones culturales ofrecidas por la agencia
 * @author Katherine Avila
 */
public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return "Excursión Cultural:" + "\n"+
                super.toString() + "\n" +
                "Lugar Histórico: " + lugarHistorico;
    }
}

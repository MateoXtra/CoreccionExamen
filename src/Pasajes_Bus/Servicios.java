package Pasajes_Bus;

public class Servicios extends Pasajeros {
    String tiposervicio;

    public Servicios() {
    }

    public Servicios(String ruta, String servicio, double pasajetotal, String nombre, int numasientos, String tiposervicio) {
        super(ruta, servicio, pasajetotal, nombre, numasientos);
        this.tiposervicio = tiposervicio;
    }

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public void mostrarServicio() {
        System.out.println("Tipo de Servicio: " + tiposervicio);
    }
}

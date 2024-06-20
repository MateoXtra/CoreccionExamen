package Pasajes_Bus;

public class Servicio_normal extends Servicios {
    double costo;

    public Servicio_normal() {
    }

    public Servicio_normal(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    @Override
    public void mostrarServicio() {
        System.out.println("Tipo de Servicio: " + tiposervicio);
        super.mostrarServicio();

    }

}

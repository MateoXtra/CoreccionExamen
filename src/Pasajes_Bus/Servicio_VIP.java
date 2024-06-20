package Pasajes_Bus;

public class Servicio_VIP extends Servicios{
    double costo;

    public Servicio_VIP() {
    }

    public Servicio_VIP(double costo) {
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


package Pasajes_Bus;

public class Ticket {
    String ruta;
    String servicio;
    double pasajetotal;

    public Ticket() {
    }
    public Ticket(String ruta, String servicio, double pasajetotal) {
        this.ruta = ruta;
        this.servicio = servicio;
        this.pasajetotal = pasajetotal;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getPasajetotal() {
        return pasajetotal;
    }

    public void setPasajetotal(double pasajetotal) {
        this.pasajetotal = pasajetotal;
    }

    public void mostrarInformacion(){
        System.out.println("Ruta: " + ruta);
        System.out.println("Servicio: " + servicio);
        System.out.println("Pasaje total.: $" + pasajetotal);
    }
}

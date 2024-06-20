package Pasajes_Bus;

public class Pasajeros extends Ticket {
    String nombre;
    int numasientos;

    public Pasajeros() {
    }

    public Pasajeros(String ruta, String servicio, double pasajetotal, String nombre, int numasientos) {
        super(ruta, servicio, pasajetotal);
        this.nombre = nombre;
        this.numasientos = numasientos;
    }

    public void mostrarDatos(){
        System.out.println("Ruta: " + ruta);
        System.out.println("Tipo de Servicio: " + servicio);
        System.out.println("Pasaje total: $" + pasajetotal);
    }
}

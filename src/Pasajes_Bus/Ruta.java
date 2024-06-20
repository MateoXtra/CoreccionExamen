package Pasajes_Bus;

public class Ruta extends Ticket{
    String nombreRuta;
    double pasajeRuta1 = 20;
    double pasajeRuta2 = 17.50  ;
    double pasajeRuta3 = 15;
    double pasajeRuta4 = 17.50;

    public Ruta() {
    }

    public Ruta(String nombreRuta, double pasajeRuta1, double pasajeRuta2, double pasajeRuta4, double pasajeRuta3) {
        this.nombreRuta = nombreRuta;
        this.pasajeRuta1 = pasajeRuta1;
        this.pasajeRuta2 = pasajeRuta2;
        this.pasajeRuta4 = pasajeRuta4;
        this.pasajeRuta3 = pasajeRuta3;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public double getPasajeRuta1() {
        return pasajeRuta1;
    }

    public void setPasajeRuta1(double pasajeRuta1) {
        this.pasajeRuta1 = pasajeRuta1;
    }

    public double getPasajeRuta2() {
        return pasajeRuta2;
    }

    public void setPasajeRuta2(double pasajeRuta2) {
        this.pasajeRuta2 = pasajeRuta2;
    }

    public double getPasajeRuta3() {
        return pasajeRuta3;
    }

    public void setPasajeRuta3(double pasajeRuta3) {
        this.pasajeRuta3 = pasajeRuta3;
    }

    public double getPasajeRuta4() {
        return pasajeRuta4;
    }

    public void setPasajeRuta4(double pasajeRuta4) {
        this.pasajeRuta4 = pasajeRuta4;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre del Ruta: "+nombreRuta);
        super.mostrarInformacion();
    }
}

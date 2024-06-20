import Pasajes_Bus.Pasajeros;
import Pasajes_Bus.Ruta;
import Pasajes_Bus.Ticket;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();
        Ticket ticket4 = new Ticket();
        Ticket ticket5 = new Ticket();

        ticket1.setRuta("Quito-Guayaquil ($20).");
        ticket2.setRuta("Quito-Tulcan ($17,50)");
        ticket3.setRuta("Quito-Puyo ($15)");
        ticket4.setRuta("Quito-Riobamba ($17,50)");
        ticket5.setRuta("Quito-Guayaquil ($20)");
        ticket1.setServicio("Normal");
        ticket2.setServicio("Normal");
        ticket3.setServicio("VIP");
        ticket4.setServicio("VIP");
        ticket5.setServicio("Normal");

        ticket1.setPasajetotal(20);
        ticket2.setPasajetotal(17.50);
        ticket3.setPasajetotal((15 * 0.3)+15);
        ticket4.setPasajetotal((17.50 * 0.3)+17.50);
        ticket5.setPasajetotal(20);

        ticket1.mostrarInformacion();
        ticket2.mostrarInformacion();
        ticket3.mostrarInformacion();
        ticket4.mostrarInformacion();
        ticket5.mostrarInformacion();

        Ticket ticket6 = new Ticket("Quito-Guayaquil","Normal",20);
        Ticket ticket7 = new Ticket("Quito-Tulcan ","VIP",(17.5*0.3)+17.5);
        Ticket ticket8 = new Ticket("Quito-Puyo","Normal",15);
        Ticket ticket9 = new Ticket("Quito-Riobamba","VIP",(17.5*0.3)+17.5);
        Ticket ticket10 = new Ticket("Quito-Guayaquil","Normal",20);

        ticket6.mostrarInformacion();
        ticket7.mostrarInformacion();
        ticket8.mostrarInformacion();
        ticket9.mostrarInformacion();
        ticket10.mostrarInformacion();





    }
}
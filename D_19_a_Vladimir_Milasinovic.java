package DomaciOOP2;

public class Main {
    public static void main(String[] args) {
//Zadatak 2.
//Napraviti klasu Radnik koja ima ime, poziciju i platu.
// U glavnoj klasi napraviti dva radnika, proveriti cija je plata veca, istampati informacije radnika cija je plata veca, uz 20% vecu platu.
        Radnik jedan = new Radnik();

        jedan.ime = "Pera";
        jedan.pozicija = "Moler";
        jedan.plata = 21000;

        Radnik dva = new Radnik();

        dva.ime = "Zika";
        dva.pozicija = "Keramicar";
        dva.plata = 20000;

        if (jedan.plata> dva.plata){
            System.out.println("Plata radnika jedan je veca, i dobija jos 20% na platu, sto je " + (jedan.plata * 1.2) + " dinara");
        } else if (dva.plata> jedan.plata) {
            System.out.println("Plata radnika dva je veca, i dobija jos 20% na platu, sto je " + (dva.plata * 1.2) + " dinara");
        }else if (jedan.plata== dva.plata){
            System.out.println("Plate oba radnika su iste");
        }

    }
}

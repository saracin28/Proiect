package main.proiect1;

public class Locatie {

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VARIABILE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public String Denumireloc;
    public int Capacitate;
    public boolean Activa;
    public String Adresa;

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Locatie(String Denumireloc, int Capacitate, boolean Activa, String Adresa) {
        this.Adresa = Adresa;

        if(setDenumireloc(Denumireloc)==true){
            this.Denumireloc=Denumireloc;
        }
        if(setCapacitate(Capacitate)==true){
            this.Capacitate=Capacitate;
        }
        if(setActiva(Activa)==true){
            this.Activa=Activa;
        }

    }
    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public boolean setDenumireloc(String Denumireloc) {
        if (Denumireloc.length() <= 5) {
            System.out.println("Denumire locatie: " + Denumireloc);
            return true;
        } else {
            System.out.println("Locatie inexistenta");
            return false;
        }
    }

    public boolean setCapacitate(int Capacitate) {
        if (Capacitate >= 50 && Capacitate <= 300) {
            System.out.println("Locuri suficiente");
            return true;
        } else {
            System.out.println("Insuficiente locuri");
            return false;
        }
    }

    public boolean setActiva(boolean Activa) {
        if (Activa == true) {
            System.out.println("Sala este disponibila");
            return true;
        } else {
            System.out.println("Sala este indisponibila");
            return false;
        }
    }


    @Override
    public String toString() {

        return "["
                + Denumireloc +
                "]";
    }
}
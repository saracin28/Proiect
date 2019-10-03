package main.proiect1;

import java.util.List;

/* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VARIABILE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

public class Materie {
    public String denumire;
    public String prescurtare;
    public String detalii;
    public List<Profesor> profesori;

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Materie(String Denumire, String Prescurtare, String Detalii, List<Profesor> Profesori) {

        this.denumire = Denumire;
        System.out.println("Denumire materie: "+denumire);
        if(showprescurtare(Prescurtare)==true){
        this.prescurtare = Prescurtare;}

        this.profesori = Profesori;
        if(showdetalii(Detalii)==true) {
            this.detalii = Detalii;
        }


    }

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    //Afisare nume materie


    //Verificare prescurtare
    public boolean showprescurtare(String Prescurtare) {
        if (!(Prescurtare.length() <= 5)) {
            System.out.println("Prescurtarea invalida");
            return false;
        }
        else{
            System.out.println("Prescurtarea: " + "\t" + Prescurtare);
            return true;
        }
    }

    public boolean showdetalii(String Detalii) {
        if (Detalii.length() <= 100) {
            System.out.println("Detalii: " + Detalii);
            return true;
        } else {
            System.out.println("Limita de caractere atinsa");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Materie["
                + denumire +
                ']';
    }
}
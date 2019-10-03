package main.proiect1;

public class Orar {

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VARIABILE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    private Grupa grupa;
    private Profesor profesor;
    private Locatie locatie;
    private String data;
    private String ora_Inceput;
    private String ora_Sfarsit;
    private String detalii;
    private Materie materie;


    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Orar(Grupa grupa, Profesor profesor, Locatie locatie, String data, String ora_Inceput, String ora_Sfarsit,
                String detalii, Materie materie) {
        this.grupa = grupa;
        this.profesor = profesor;
        this.locatie = locatie;
        this.data = data;
        this.ora_Inceput = ora_Inceput;
        this.ora_Sfarsit = ora_Sfarsit;
        this.detalii = detalii;
        this.materie = materie;
        arataOrar();

    }
    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METODE  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }

    public Materie getMaterie() {
        return materie;
    }

    public void setMaterie(Materie materie) {
        this.materie = materie;
    }

    public void arataOrar() {
        System.out.println("Grupa: " + grupa);
        System.out.println("Profesor: " + profesor);
        System.out.println("Locatia: " + locatie);
        System.out.println("Data: " + data);
        System.out.println("Ora la care incepe: " + ora_Inceput);
        System.out.println("Ora la care se termina: " + ora_Sfarsit);
        System.out.println("Detali: " + detalii);
        System.out.println("Materia: " + materie);


    }

}
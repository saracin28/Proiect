package main.proiect1;

import java.util.List;
public class Grupa {

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VARIABILE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    private int IdGrupa;
    private int an;
    private List<Student> studenti;
    private List<Mesaj> mesajGrupa;

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Grupa(int idGrupa, int an, List<Student> studenti, List<Mesaj> mesajGrupa) {

        if (verificaGrupa(idGrupa) == true) {
            IdGrupa = idGrupa;
        }

        if (verificaAn(an) == true) {
            this.an = an;
        }

        this.studenti = studenti;
        System.out.println("Studenti: " + studenti);

        this.mesajGrupa = mesajGrupa;
        System.out.println("Mesaje: " + mesajGrupa);
    }


    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public boolean verificaGrupa(int idGrupa) {
        if (idGrupa > 0 && idGrupa <= 10) {
            System.out.println("Grupa:" + idGrupa);
            return true;
        } else {
            System.out.println("Grupa nu e corecta");
            return false;
        }
    }

    public boolean verificaAn(int an) {
        if (an > 0 && an <= 6) {
            System.out.println("An: " + an);
            return true;
        } else {
            System.out.println("An incorect");
            return false;
        }
    }

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> GET/SET >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    public int getIdGrupa() {
        return IdGrupa;
    }

    public void setIdGrupa(int idGrupa) {
        IdGrupa = idGrupa;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public List<Mesaj> getMesajGrupa() {
        return mesajGrupa;
    }

    public void setMesajGrupa(List<Mesaj> mesajGrupa) {
        this.mesajGrupa = mesajGrupa;
    }

    @Override
    public String toString() {
        return "[" +
                "ID Grupa:" + IdGrupa +
                ']';
    }
}

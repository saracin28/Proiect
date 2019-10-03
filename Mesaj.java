package main.proiect1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Mesaj {

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VARIABILE  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    private Student student;
    private Date time;
    private String text;
    private int grupa;

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Mesaj(Student student, String text, int grupa) {
        this.student = student;
        this.text = text;
        this.grupa = grupa;
        showMesaj();
    }

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METODE  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public void showMesaj() {
        System.out.println("Studentul care a trimis mesajul: " + student);
        System.out.println("Data: " + LocalDate.now() + "\t" + LocalTime.now());
        System.out.println("Text: " + text);
        if(grupa>=1&&grupa<=10){
            System.out.println("Grupa: " + grupa);
        }else System.out.println("Grupa nu exista");
    }

    @Override
    public String toString() {
        return "Mesaj[" +
                text  +
                ']';
    }
}
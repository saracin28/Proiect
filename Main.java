package main.proiect1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>DECLARARE STUDENTI SI LISTA DE STUDENTI>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Student st1 = new Student("Ionescu", "Maria", "ionescumaria@yahoo.com",
                "08.12.2000", "0770453678", 3);

        Student st2 = new Student("Popescu", "Raul", "popraul@gmail.com",
                "23.07.1998", "0778657432", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>DECLARARE PROFESORIE SI LISTA DE PROFESORI temporara>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Profesor tempprof1 = new Profesor("Popa", "Vasile");
        Profesor tempprof2 = new Profesor("Mitica", "Emanuel");
        List<Profesor> listTempProf = new ArrayList<>();
        listTempProf.add(tempprof1);
        listTempProf.add(tempprof2);

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>MATERII SI LISTA DE MATERII>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        Materie materie1 = new Materie("Chimie", "CH", "Chime organica si anorganica", listTempProf);
        Materie materie2 = new Materie("Fizica", "FZ", "Fizica atomica", listTempProf);
        List<Materie> listMaterii = new ArrayList<>();
        listMaterii.add(materie1);
        listMaterii.add(materie2);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Profesor si lista de profesori>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Profesor profesor1 = new Profesor("Matei", "Andrei", "mateiA@yahoo.com",
                "0770597685", 1978, true, "profesor");
        Profesor profesor2 = new Profesor("Constantin", "Andreea", "constandrea@gmail.com",
                "0777064545", 1990, false, "laborant");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Locatie>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Locatie locatie = new Locatie("B105", 346, true, "Str Parvan");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Mesaj+ lista mesaje>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Mesaj mesaj = new Mesaj(st1, "Mesaj1", 4);
        List<Mesaj> listmesaj = new ArrayList<>();
        listmesaj.add(mesaj);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Grupa>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        Grupa grupa = new Grupa(4, 6, studentList, listmesaj);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Orar>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Orar orar = new Orar(grupa, profesor1, locatie, "15.10.2019", "08:00", "14:00", "Chimie organica", materie1);
    }
}
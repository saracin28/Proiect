package main.proiect1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    private String nume;
    private String prenume;
    private String email;
    private String dataNastere;
    private String telefon;
    private int Grupa;


    public Student(String nume, String prenume, String email, String dataNastere, String telefon, int grupa) {

        this.nume = nume;
        this.prenume = prenume;
        System.out.println("______________________________________");
        System.out.println("Student nr :  " + " \t" + this.nume + "\t" + this.prenume);
        System.out.println("----------------------------------------");

        this.email = email;
        List<String> emailList = new ArrayList<String>();

        if ((!emailList.contains(email)) && (containEmailSign(email))) {
            emailList.add(email);
            System.out.println("Email: " + email);
        } else {

            System.out.println("Studentul nu a putut fi inregistrat. Adresa de email duplicat sau nu contine @");
        }

        this.dataNastere = dataNastere;
        System.out.println("Data nastere: " + dataNastere);

        //verifica tel
        if ((checkphone(telefon) == true) && (checkPhoneLength(telefon) == true)) {
            this.telefon = telefon;
            System.out.println("Telefon: " + this.telefon);
        } else {
            System.out.println("Studentul nu a putut fi inregistrat. Telefon invalid");
        }

        //verifica grupa
        if (checkGrupa(grupa) == true) {
            Grupa = grupa;
            System.out.println("Grupa : " + Grupa);
        } else {
            System.out.println("Studentul nu a putut fi inregistrat. Grupa invalida");
        }
    }

    public boolean ceckEmailList() {
        List<String> emailList = new ArrayList<>();
        emailList.add(email);
        if (emailList.contains(email)) {
        }
        return false;
    }

    public boolean checkPhoneLength(String tel) {
        return (tel.length() == 10);
    }


    public boolean checkGrupa(int gr) {
        return ((gr < 10) && (gr > 0));
    }

    public boolean checkphone(String phonenumber) {
        Pattern p = Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$");
        Matcher m = p.matcher(phonenumber);
        boolean flag = m.find() && m.group().equals(phonenumber);
        if (flag) {
        }
        return true;
    }

    public boolean containEmailSign(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }



    @Override
    public String toString() {
        return nume + " " + prenume;
    }
}

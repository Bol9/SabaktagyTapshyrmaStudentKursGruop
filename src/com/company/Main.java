package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Student student = new Student("Kalys","bekmenbetov@gmail.com", LocalDate.of(1996,4,21));
        Student student1 = new Student("Maksat","e-mail@gmail.com",LocalDate.of(2001,12,23));
        Student student2 = new Student("Janar","e-mail@gmail.com",LocalDate.of(1998,3,14));


        Student jsStudent = new Student("Askat","e-m@gmail.com",LocalDate.of(1995,6,19));
        Student jsStudent1 = new Student("Baku","e-m@gmail.com",LocalDate.of(2009,4,21));

        Gruppa java = new Gruppa("Java-5",LocalDate.of(2022,1,8),new Student[]{student,student1,student2});
        Gruppa js = new Gruppa("JS-5",LocalDate.of(2022,1,5),new Student[]{jsStudent,jsStudent1});


        Kurs kurs =new Kurs("Peacsoft", 5, "Esenov", new Gruppa[]{java,js});





        System.out.println(kurs);








    }
}

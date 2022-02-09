package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Gruppa {
    public Student[] studentter;
    public String nameOfGrup;
    public LocalDate date;

    public Gruppa() {
    }

    public Gruppa(String nameOfGrup, LocalDate date,Student[] studentter) {
        this.studentter = studentter;
        this.nameOfGrup = nameOfGrup;
        this.date = date;
    }

    public Student[] getStudentter() {
        return studentter;
    }

    public void setMassiv(Student[] studentter) {
        this.studentter = studentter;
    }

    public String getNameOfGrup() {
        return nameOfGrup;
    }

    public void setNameOfGrup(String nameOfGrup) {
        this.nameOfGrup = nameOfGrup;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return "Name of Group: "+ nameOfGrup+" "+  "Start date: "+ date+"  "+
                "Students in this group: "+Arrays.toString(studentter);
    }
}

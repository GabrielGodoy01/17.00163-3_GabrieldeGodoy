package com.company;

public class Main {

    public static void main(String[] args) {
	    Ninja ninja = new Ninja("Naruto","Uzumaki");
	    ninja.train();
	    Ninja academicStudent = new AcademicStudent("Sasuke","Uchiha");
	    mostrarTreino(academicStudent);
	    Chunnin chunnin = new Chunnin("Iruka","Umino","Treinar XYZ");
	    mostrarTreino(chunnin);
	    chunnin.goToMission();
	    Jounin jounin = new Jounin("Kakashi", "Hatake", "Train Sasuke!");
	    mostrarTreino(jounin);
    }

    static void mostrarTreino(Ninja ninja){
    	ninja.train();
	}
}

package exercicios.exercicio3.entities;

public class Student {

	public String name;
	public double n1;
	public double n2;
	public double n3;

	public double finalGrade() {
		return n1 + n2 + n3;
	}

	public String toString() {
		if (finalGrade() >= 60.00) {
			return "FINAL GRADE: " + finalGrade() + "PASS";
		} else {
			return "FINAL GRADE: " + finalGrade() + "FAILED" + "MISSING " + (60.00 - finalGrade());
		}
	}

}

package atividade01.ex03;

import javax.swing.JOptionPane;

public class Student {
	
	private int ra;
	private String name;
	private String currentClass;
	private String semester;
	
	public Student() {
	}

	public Student(int ra, String name, String currentClass, String semester) {
		this.ra = ra;
		this.name = name;
		this.currentClass = currentClass;
		this.semester = semester;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Aluno: "+ ra + ", " + name + ", " + currentClass + ", " + semester;
	}
	
	public void addStudent() {
		int ra = Integer.parseInt(JOptionPane.showInputDialog("Número do RA: "));
		String name = JOptionPane.showInputDialog("Nome do Aluno: ");
		String currentClass = JOptionPane.showInputDialog("Turma: ");
		String semester = JOptionPane.showInputDialog("Semestre: ");
		this.setRa(ra);
		this.setName(name);
		this.setCurrentClass(currentClass);
		this.setSemester(semester);
	}
	
	
}

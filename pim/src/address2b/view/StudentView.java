package address2b.view;

import java.util.ArrayList;

import address2b.model.Student;

public class StudentView {
	private int sizeOfStar = 50;
	
	private void printHeader() {
		for(int i = 0; i <= sizeOfStar; i++)
			System.out.print('*');
		System.out.print("\n");
	}
	private void printFooter() {
		for(int i = 0; i <= sizeOfStar; i++)
			System.out.print('*');
		System.out.print("\n");
	}
	public void printException(String string) {
		// TODO Auto-generated method stub
		printHeader();
		System.out.print(string + "\n");
		printFooter();
		
	}
	public void printStudentList(ArrayList<Student> studentList) {
		printHeader();
		for(Student student : studentList)
			System.out.print(student.getHakbun() + "|" + student.getName() + 
					" | " + student.getEmail() + " | " + student.getDept() + "\n");
		printFooter();
	}
	public void printStudent(Student found) {
		// TODO Auto-generated method stub
		printHeader();
		System.out.print(found.getHakbun() + "|" + found.getName() + 
				" | " + found.getEmail() + " | " + found.getDept() + "\n");
		printFooter();
	}
	public void printRegister(Student student) {
		// TODO Auto-generated method stub
		printHeader();
		System.out.print(student.getName() + "님 등록 성공! 환영합니다. " +  "\n");
		printFooter();
	}

}

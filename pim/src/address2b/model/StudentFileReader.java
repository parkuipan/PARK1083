package address2b.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentFileReader {
	
	private Scanner sc = null;
	
	public StudentFileReader(File f) throws FileNotFoundException {
		sc = new Scanner(f);
	}
	public ArrayList<Student> readStudentList() {
		ArrayList<Student> retStudentList = new ArrayList<Student>();
		while(sc.hasNext()) {
			Student student = new Student();
			String[] strArr = sc.nextLine().split("\t");
			student.setName(strArr[0]);
			student.setHakbun(strArr[1]);
			student.setEmail(strArr[2]);
			student.setDept(strArr[3]);
			retStudentList.add(student);
		}
		return retStudentList;
	}
}

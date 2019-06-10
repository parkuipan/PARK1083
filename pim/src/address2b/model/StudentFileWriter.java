package address2b.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentFileWriter {
	FileWriter fw = null;
	
	public StudentFileWriter(File f) throws IOException {
		fw = new FileWriter(f);
	}
	public void saveStudentList(ArrayList<Student> studentList) {
		for(Student student : studentList) {
			try {
				fw.write(student.getName() + "\t");
				fw.write(student.getHakbun() + "\t");
				fw.write(student.getEmail() + "\t");
				fw.write(student.getDept() + "\n");
				fw.flush(); // ���Ͽ� ���⸦ ����
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

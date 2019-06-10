package address2b.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentDAO implements DAO {
	// CRUD : Create Read Update Delete
	// DB record : insert, select, update, delete
	
	//List list = new ArrayList(); // ArrayList : 모든 Object 를 상속받은 객체를 처리할 수 있음
	ArrayList<Student> list = new ArrayList<Student>(); // Student 객체만 처리할 수 있음
	
	File fName = new File("pim.txt");
	
	public ArrayList<Student> readList() { // student 집합 객체을 읽어 들임
		return list;		
	}
	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}

	public boolean create(Student o) {
		boolean ok = false;
		// list = new LinkedList(); // 다형성
		list.add(o);
		return ok;
	}
	
	public Student read(Student student) {
		// TODO Auto-generated method stub
		Student findStudent = null;
		for(Student s : list)
			if(s.getHakbun().equals(student.getHakbun())) {
				findStudent = s;
			}
		return findStudent;
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		try {
			StudentFileReader sfr = new StudentFileReader(fName);
			list = sfr.readStudentList();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		try {
			StudentFileWriter sfw = new StudentFileWriter(fName);
			sfw.saveStudentList(list); // 메모리에 있는 student의 ArrayList를 파일에 저장
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	

}

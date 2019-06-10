package address2b.controller;

import java.util.ArrayList;
import java.util.Scanner;

import address2b.model.Student;
import address2b.model.StudentDAO;
import address2b.view.StudentView;

public class StudentController implements Controller {
	StudentDAO studentDAO = new StudentDAO();
	Student student = null; // ���������� ������ �����ϴ� ��ü�� null(�����ϴ� ��ü ����) ������
	Scanner sc = null;
	@Override
	public void process(String command) {
		// TODO Auto-generated method stub
		switch(command) {
			case "register" : register(); break; 
			case "list" : list(); break; 
			case "update" : System.out.print("���� ��� ����"); break; 
			case "delete" : System.out.print("���� ��� ����"); break; 
			case "listAll" : listAll(); break; 
			case "open" : open(); break; 
			case "save" : save(); break; 
		}
	}
	
	StudentView studentView = new StudentView(); // �ν��Ͻ� ����, ��� �ʵ�
	private void open() {
		studentDAO.open();
	}
	private void save() {
		studentDAO.save();
	}
	
	private void listAll() {
		// Controller�� ���� : ��û�� �޾� (�⺻���� ó�� ��) DAO���� �����ϰ�, 
		//					 DAO�� ó���� ������ �޾Ƽ�(�߰����� ó�� ��) �信�� ����
		studentView.printStudentList(studentDAO.readList()); // VIEW���� ����
		/*
		ArrayList<Student> studentList = studentDAO.readList();
		for(Student s : studentList)
			System.out.print(s.getName() + "|" + s.getHakbun() + "\n");			
		*/
	}
	
	private void list() {
		student = new Student(); // 
		sc = new Scanner(System.in);
		System.out.print("�й� : ");
		student.setHakbun(sc.next());
		Student found = null;
		if((found = studentDAO.read(student)) != null)
			studentView.printStudent(found);
			/*
			System.out.print(found.getHakbun() + "|" + found.getName() + 
					" | " + found.getEmail() + " | " + found.getDept() + "\n");
					*/
		else
			studentView.printException("�Է��� �й��� �л��� �������� �ʽ��ϴ�");
			//System.out.print("�Է��� �й��� �л��� �������� �ʽ��ϴ�\n");
	}
	private void register() {
		student = new Student(); // 
		sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		student.setName(sc.next());
		System.out.print("�й� : ");
		student.setHakbun(sc.next());
		System.out.print("�̸��� : ");
		String email = sc.next();
		student.setEmail(email);
		System.out.print("�а� : ");
		student.setDept(sc.next());
		
		// egyou@induk.ac.kr vs a@a.com : e-mail : @ ��ȣ�� �ְ�, @ ��ȣ �տ� ���ڼ��� 3�� �̻�
		if(isValidEmail(email)) {
			studentDAO.create(student);
			studentView.printRegister(student);
		}
		/*
		else
			System.out.println("�̸��� ������ Ȯ���Ͻʽÿ�");
			*/
	}
	
	private boolean isValidEmail(String email) {
		boolean ok = false;
		int i = email.indexOf('@');
		try {
			if(i < 0) {
				throw new Exception("@�� �־�� �մϴ�.");
			}
			else if(email.substring(0, i).length() < 3) {
				throw new Exception("���̵�� 3�� �̻�.");
			}
			else {
				ok = true;	
			}
		} catch(Exception e) {
			//System.out.println(e.getMessage());
		}
		return ok;
	}
}

package address2b.controller;

import java.util.ArrayList;
import java.util.Scanner;

import address2b.model.Student;
import address2b.model.StudentDAO;
import address2b.view.StudentView;

public class StudentController implements Controller {
	StudentDAO studentDAO = new StudentDAO();
	Student student = null; // 참조변수는 있지만 참고하는 객체가 null(참조하는 객체 없음) 상태임
	Scanner sc = null;
	@Override
	public void process(String command) {
		// TODO Auto-generated method stub
		switch(command) {
			case "register" : register(); break; 
			case "list" : list(); break; 
			case "update" : System.out.print("수정 기능 수행"); break; 
			case "delete" : System.out.print("삭제 기능 수행"); break; 
			case "listAll" : listAll(); break; 
			case "open" : open(); break; 
			case "save" : save(); break; 
		}
	}
	
	StudentView studentView = new StudentView(); // 인스턴스 변수, 멤버 필드
	private void open() {
		studentDAO.open();
	}
	private void save() {
		studentDAO.save();
	}
	
	private void listAll() {
		// Controller의 역할 : 요청을 받아 (기본적인 처리 후) DAO에게 전달하고, 
		//					 DAO가 처리한 내용을 받아서(추가적인 처리 후) 뷰에게 전달
		studentView.printStudentList(studentDAO.readList()); // VIEW에게 전달
		/*
		ArrayList<Student> studentList = studentDAO.readList();
		for(Student s : studentList)
			System.out.print(s.getName() + "|" + s.getHakbun() + "\n");			
		*/
	}
	
	private void list() {
		student = new Student(); // 
		sc = new Scanner(System.in);
		System.out.print("학번 : ");
		student.setHakbun(sc.next());
		Student found = null;
		if((found = studentDAO.read(student)) != null)
			studentView.printStudent(found);
			/*
			System.out.print(found.getHakbun() + "|" + found.getName() + 
					" | " + found.getEmail() + " | " + found.getDept() + "\n");
					*/
		else
			studentView.printException("입력한 학번의 학생은 존재하지 않습니다");
			//System.out.print("입력한 학번의 학생은 존재하지 않습니다\n");
	}
	private void register() {
		student = new Student(); // 
		sc = new Scanner(System.in);
		System.out.print("이름 : ");
		student.setName(sc.next());
		System.out.print("학번 : ");
		student.setHakbun(sc.next());
		System.out.print("이메일 : ");
		String email = sc.next();
		student.setEmail(email);
		System.out.print("학과 : ");
		student.setDept(sc.next());
		
		// egyou@induk.ac.kr vs a@a.com : e-mail : @ 기호가 있고, @ 기호 앞에 글자수는 3자 이상
		if(isValidEmail(email)) {
			studentDAO.create(student);
			studentView.printRegister(student);
		}
		/*
		else
			System.out.println("이메일 형식을 확인하십시요");
			*/
	}
	
	private boolean isValidEmail(String email) {
		boolean ok = false;
		int i = email.indexOf('@');
		try {
			if(i < 0) {
				throw new Exception("@이 있어야 합니다.");
			}
			else if(email.substring(0, i).length() < 3) {
				throw new Exception("아이디는 3자 이상.");
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

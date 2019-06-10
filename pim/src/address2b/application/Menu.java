package address2b.application;

import java.util.ArrayList;
import java.util.Scanner;

import address2b.model.Student;

public class Menu {
	public static void main(String[] args) {
		// ArrayList : 배열과 List 특징을 갖는 집합 객체를 생성하는 클래스
		// 배열 : 인덱스를 통한 빠른 접근
		// List : 크기가 조정되기 쉬움(resizable)
		ArrayList<Student> alStudent = new ArrayList<Student>();	
		
		Student st = null;
		
		st = new Student(); // 학생 레코드와 쌍이 되는 객체
		// 입력받는 코드가 필요함
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String hakbun = sc.next();
		String email = sc.next();
		String dept = sc.next();
		
		st.setName(name);
		st.setHakbun(hakbun);
		st.setEmail(email);
		st.setDept(dept);
		
		alStudent.add(st);
		
		/*
		String line = sc.nextLine();
		String[] fields = line.split(" ");
		
		st.setName(fields[0]);
		st.setHakbun(fields[1]);
		st.setEmail(fields[2]);
		st.setDept(fields[3]);
		
		alStudent.add(st);
		
		st = new Student();
		line = sc.nextLine();
		fields = line.split(" ");
		
		st.setName(fields[0]);
		st.setHakbun(fields[1]);
		st.setEmail(fields[2]);
		st.setDept(fields[3]);
		
		alStudent.add(st);
		*/
		for(Student o : alStudent) // o : 객체 참조 변수
			System.out.printf("%s \t %s \t %s \t %s \n", 
					o.getName(), o.getHakbun(), o.getEmail(), o.getDept());
		/*
		
		String[] menus = {"0.등록", "1.조회", "2.수정", "3.삭제", "4.전체조회", "9.종료"};

		for(String menu : menus)
			System.out.print(menu + " | ");
				
		Scanner sc = new Scanner(System.in); // 자원을 할당 받음
		int mnu = sc.nextInt();
		do {
			switch(mnu) {
			case 0: System.out.println(menus[mnu].substring(2)); break;
			case 1: System.out.println(menus[mnu].substring(2)); break;
			case 2: System.out.println(menus[mnu].substring(2)); break;
			case 3: System.out.println(menus[mnu].substring(2)); break;
			case 4: System.out.println(menus[mnu].substring(2)); break;
			case 9: sc.close(); // 자원의 회수, 메모리 누수(leak) 현상이 발생함 
				System.exit(1); break;
			default: 
			}
			mnu = sc.nextInt();
		} while(true);
		*/
	}
}

package address2b.application;

import java.util.ArrayList;
import java.util.Scanner;

import address2b.model.Student;

public class Menu {
	public static void main(String[] args) {
		// ArrayList : �迭�� List Ư¡�� ���� ���� ��ü�� �����ϴ� Ŭ����
		// �迭 : �ε����� ���� ���� ����
		// List : ũ�Ⱑ �����Ǳ� ����(resizable)
		ArrayList<Student> alStudent = new ArrayList<Student>();	
		
		Student st = null;
		
		st = new Student(); // �л� ���ڵ�� ���� �Ǵ� ��ü
		// �Է¹޴� �ڵ尡 �ʿ���
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
		for(Student o : alStudent) // o : ��ü ���� ����
			System.out.printf("%s \t %s \t %s \t %s \n", 
					o.getName(), o.getHakbun(), o.getEmail(), o.getDept());
		/*
		
		String[] menus = {"0.���", "1.��ȸ", "2.����", "3.����", "4.��ü��ȸ", "9.����"};

		for(String menu : menus)
			System.out.print(menu + " | ");
				
		Scanner sc = new Scanner(System.in); // �ڿ��� �Ҵ� ����
		int mnu = sc.nextInt();
		do {
			switch(mnu) {
			case 0: System.out.println(menus[mnu].substring(2)); break;
			case 1: System.out.println(menus[mnu].substring(2)); break;
			case 2: System.out.println(menus[mnu].substring(2)); break;
			case 3: System.out.println(menus[mnu].substring(2)); break;
			case 4: System.out.println(menus[mnu].substring(2)); break;
			case 9: sc.close(); // �ڿ��� ȸ��, �޸� ����(leak) ������ �߻��� 
				System.exit(1); break;
			default: 
			}
			mnu = sc.nextInt();
		} while(true);
		*/
	}
}

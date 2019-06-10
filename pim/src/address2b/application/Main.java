package address2b.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import address2b.controller.StudentController;

public class Main {
	public static void main(String[] args) {
		// System.out : ǥ�� ���
		// System.in : ǥ�� �Է�, ǥ�� �Է��� ����ϱⰡ �����, 1���ھ� ó���ϴ� ����̶� ���ŷο��� ���� �߻���.
		
		// System.in�� Piping�Ͽ� ó����, BufferedReader�� Scanner�� ���ǵ� ����? �޼ҵ带 ��� ����
		/*
		System.out.println("BufferedReader ��ü�� Ȱ���� �� �� �б� : " );
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String strBR = br.readLine();
			String[] words = strBR.split(" ");
			int result = 0;
			for(String s : words)
				result = result + Integer.parseInt(s); // wrapper class
			System.out.println("�Է��Ͻ� ���ڹ��ڿ��� ���ڷ� ��ȯ�Ͽ� ���� �� : " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		*/
		
		String[] menus = {"0.���", "1.��ȸ", "2.����", "3.����", "4.��ü��ȸ", "5.���Ͽ���", "6.��������", "9.����"};
		for(String m : menus)
			System.out.print(m + " | "); // ���� ��ü - ���ڿ� �迭�� ���������� ����
		System.out.print("\n");		
		StudentController studentCtrl = new StudentController();
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		while (true) { 			
			switch(key) {
				case 0: studentCtrl.process("register");break;
				case 1: studentCtrl.process("list");break;
				case 2: System.out.println("���� ����");break;
				case 3: System.out.println("���� ����");break;
				case 4: studentCtrl.process("listAll");break;
				case 5: studentCtrl.process("open");break;
				case 6: studentCtrl.process("save");break;
				case 9: sc.close(); // �ڿ� ȸ���ϴ� ����
						System.exit(1);break;
				default: System.out.println("��ɿ� �ش��ϴ� ���� �ڵ带 �Է��Ͻÿ�");break;
			}
			for(String m : menus)
				System.out.print(m + " | "); // ���� ��ü - ���ڿ� �迭�� ���������� ����
			System.out.print("\n");
			key = sc.nextInt();
			
		}
		
		/*
		String strSC = sc.nextLine();
		System.out.println(strSC);
		*/
	}
}

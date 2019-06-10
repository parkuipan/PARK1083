package address2b.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import address2b.controller.StudentController;

public class Main {
	public static void main(String[] args) {
		// System.out : 표준 출력
		// System.in : 표준 입력, 표준 입력은 사용하기가 어려움, 1글자씩 처리하는 방식이라 번거로움이 많이 발생함.
		
		// System.in을 Piping하여 처리함, BufferedReader나 Scanner에 정의된 편리한? 메소드를 사용 가능
		/*
		System.out.println("BufferedReader 객체를 활용한 한 줄 읽기 : " );
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String strBR = br.readLine();
			String[] words = strBR.split(" ");
			int result = 0;
			for(String s : words)
				result = result + Integer.parseInt(s); // wrapper class
			System.out.println("입력하신 숫자문자열을 숫자로 변환하여 구한 합 : " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		*/
		
		String[] menus = {"0.등록", "1.조회", "2.수정", "3.삭제", "4.전체조회", "5.파일열기", "6.파일저장", "9.종료"};
		for(String m : menus)
			System.out.print(m + " | "); // 집합 객체 - 문자열 배열을 순차적으로 접근
		System.out.print("\n");		
		StudentController studentCtrl = new StudentController();
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		while (true) { 			
			switch(key) {
				case 0: studentCtrl.process("register");break;
				case 1: studentCtrl.process("list");break;
				case 2: System.out.println("수정 수행");break;
				case 3: System.out.println("삭제 수행");break;
				case 4: studentCtrl.process("listAll");break;
				case 5: studentCtrl.process("open");break;
				case 6: studentCtrl.process("save");break;
				case 9: sc.close(); // 자원 회수하는 문장
						System.exit(1);break;
				default: System.out.println("명령에 해당하는 숫자 코드를 입력하시오");break;
			}
			for(String m : menus)
				System.out.print(m + " | "); // 집합 객체 - 문자열 배열을 순차적으로 접근
			System.out.print("\n");
			key = sc.nextInt();
			
		}
		
		/*
		String strSC = sc.nextLine();
		System.out.println(strSC);
		*/
	}
}

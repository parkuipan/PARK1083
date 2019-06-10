package address2b.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TodayTest {
	// file i/o <== memory 기반 운영 : 프로그램이 종료되면 모든 자료가 사라짐
	public static void main(String[] args) {
		File fName = new File("2b.txt"); // 파일 객체를 생성
		try {
			Scanner sc = new Scanner(fName);
			while(sc.hasNext()) {
				String[] strArr = sc.nextLine().split("\t"); // 한 줄씩 읽고, 각 줄은 탭기호로 구분
				for(String s : strArr)
					System.out.print(s + "\t\t");
				System.out.print("\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		FileReader fr = null; // 파일로 부터 문자단위로 읽어 들이는 기능을 갖는 클래스 
		try {
			int ch;
			fr = new FileReader(fName);	
			do {
				ch =  fr.read();
				System.out.print((char) ch);
			} while(ch != 13);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않습니다.");
		}
		*/
	}
}

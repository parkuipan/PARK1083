package address2b.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TodayTest {
	// file i/o <== memory ��� � : ���α׷��� ����Ǹ� ��� �ڷᰡ �����
	public static void main(String[] args) {
		File fName = new File("2b.txt"); // ���� ��ü�� ����
		try {
			Scanner sc = new Scanner(fName);
			while(sc.hasNext()) {
				String[] strArr = sc.nextLine().split("\t"); // �� �پ� �а�, �� ���� �Ǳ�ȣ�� ����
				for(String s : strArr)
					System.out.print(s + "\t\t");
				System.out.print("\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		FileReader fr = null; // ���Ϸ� ���� ���ڴ����� �о� ���̴� ����� ���� Ŭ���� 
		try {
			int ch;
			fr = new FileReader(fName);	
			do {
				ch =  fr.read();
				System.out.print((char) ch);
			} while(ch != 13);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		*/
	}
}

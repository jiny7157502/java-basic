package 클래스사용하기;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class 파일다루기 {
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");

		try {
			//file.txt와 자바프로그램간 스트림을 만들어라!
			FileWriter file = new FileWriter(s1 + ".txt");
			//스트림을 통해서 데이터를 보내라.
			file.write(s1 + "\n");
			file.write(s2 + "\n");
			file.write(s3 + "\n");
			
			//스트림이 닫힐 때까지
			file.close();
		} catch (Exception e) {
			System.out.println("파일에 저장 중 에러발생함.!!!");
		}

	}
}

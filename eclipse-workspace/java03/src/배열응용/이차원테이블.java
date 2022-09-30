package 배열응용;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		String[] header = {"컴퓨터", "영어", "수학"};
		String[][] contents = {
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"}
		};
		
		contents[0][0] = "999";
		contents[7][1] = "999";
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		//맨 끝에 넣어야함.
		f.setVisible(true);
	
		for (int i = 0; i < contents.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(contents[i][j] + " ");
			}
			System.out.println();
		}
	}

}

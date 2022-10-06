package level3;

import java.util.Scanner;

public class no02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i = 0; i <t;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a+b);
		}
		in.close();
	}
}

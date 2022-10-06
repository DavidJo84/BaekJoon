package level2;

import java.util.Scanner;

public class no03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		in.close();
		
		if(A%4==0&&A%100!=0||A%400==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}

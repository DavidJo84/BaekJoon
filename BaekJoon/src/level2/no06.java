package level2;

import java.util.Scanner;

public class no06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		in.close();
		
		int temp = B+C;
		int hour = temp/60;
		
		if(A+hour>23 && temp>=60) {
			System.out.println((A+hour-24)+" "+(temp%60));
		}else {
			System.out.println((A+hour)+" "+(temp%60));
		}
	}
}

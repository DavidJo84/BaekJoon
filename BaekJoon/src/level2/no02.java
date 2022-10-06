package level2;

import java.util.Scanner;

public class no02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		in.close();
		
		if(A>89) {
			System.out.println("A");
		}else if(A>79) {
			System.out.println("B");
		}else if(A>69) {
			System.out.println("C");
		}else if(A>59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}

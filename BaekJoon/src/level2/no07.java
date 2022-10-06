package level2;

import java.util.Scanner;

public class no07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		in.close();
		
		if(A==B && B==C) {
			System.out.println(10000+(A*1000));
		} else if(A==B||B==C||C==A) {
			if(A==B) {
				System.out.println(1000+(A*100));
			}else if(B==C) {
				System.out.println(1000+(B*100));
			}else {
				System.out.println(1000+(C*100));
			}
		}else {
			if(A>B) {
				int min = B;
				int max = A;
				B = max;
				A = min;
				if(B>C) {
					System.out.println(B*100);
				}else {
					System.out.println(C*100);
				}
			}else {
				if(B>C) {
					System.out.println(B*100);
				}else {
					System.out.println(C*100);
				}
			}
		}
	}
}

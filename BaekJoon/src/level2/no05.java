package level2;

import java.util.Scanner;

public class no05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		in.close();
		
		if(B>=45) {
			System.out.println(A+ " " + (B-45));
		}else if(A!=0 && B<45){
			int temp = 45-B;
			System.out.println((A-1)+" "+(60-temp));
		}else if(A==0 && B<45){
			int temp = 45-B;
			System.out.println(23 +" "+(60-temp));
		}
	}

}

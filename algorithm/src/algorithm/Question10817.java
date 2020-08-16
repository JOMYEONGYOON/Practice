package algorithm;

import java.util.Scanner;

public class Question10817 {
    public static void main(String[] args)  {
    	Scanner scanner = new Scanner(System.in);
    	
    	int A = scanner.nextInt();
    	int B = scanner.nextInt();
    	int C = scanner.nextInt();
    	int Result = 0;
    	if(A>=B && B>=C || A<=B && B<=C) {
    		Result = B;
    	} else if(A<=B && A>=C || A>=B && A<=C) {
    		Result = A;
    	} else if(C>=A && C<=B || C<=A && C>=B) {
    		Result = C;
    	}
    	System.out.println(Result);
    }	

}

package algorithm;

import java.util.Scanner;

public class Question11021 {
    public static void main(String[] args)  {
    		
    	int N;
    	int A;
    	int B;
    	Scanner scanner = new Scanner(System.in);
    	N = scanner.nextInt();
   	
    	
    	for(int i=1; i<=N; i++) {
    	A = scanner.nextInt();
       	B = scanner.nextInt();
    		System.out.println("Case #"+ i +": " + (A+B));
     
    		
    	}
    	
    }
}

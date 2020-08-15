package algorithm;

import java.util.Scanner;

public class Question1110 {
    public static void main(String[] args)  {
    	Scanner scanner = new Scanner(System.in);
    	
    	int Number;
    	int result;
    	Number = scanner.nextInt();
    	result = Number;
    	int count =0;
    	while(true) {
    		
    		int A = Number/10;
    		int B = Number%10;
    		int C = (A+B) % 10;
    		int D = (B*10) + C;
    		Number = D;
    		count++;
    		if(D==result) break;
    	}
    	
    	System.out.println(count);
    	
    	
    }

}

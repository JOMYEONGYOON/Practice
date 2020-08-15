package algorithm;

import java.util.Scanner;

public class Question5543 {
    public static void main(String[] args)  {
    	Scanner scanner = new Scanner(System.in);
    	
    	int burger = 2001;
    	int beverage = 2001;
    	
    	for(int i=0; i<3; i++) {
    		 
    		 int value = scanner.nextInt();
    		 if(value < burger) {
    			 burger = value;
    		 }
    	}
    	for(int j=0; j<2; j++) {
    		
    		int value = scanner.nextInt();
    		if(value < beverage) {
    			beverage = value;
    		}
    		
    	}
    System.out.println((beverage+burger)-50);
    	
    }	

}

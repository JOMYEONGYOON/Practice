package algorithm;

import java.util.Scanner;

public class Question2884 {
public static void main(String[] args) {
	final int H = 24;
	final int M = 60; // 
	int h;
	int m;
	
	Scanner scanner = new Scanner(System.in);
	h = scanner.nextInt();
	m = scanner.nextInt();
		if(	h!=0 && m<45  ) {
		
		h=h-1;
		m=m+15;
			System.out.print(h+" ");
			System.out.print(m);
			
		}
		else if(h==0 && m<45) {
			
			h=H;
			h=h-1;
			m=m+15;
			System.out.print(h+" ");
			System.out.print(m);
			
			
			
		}
		else if(h==0 && m>=45) {
			
			m=m-45;
			System.out.print(h+" ");
			System.out.print(m);
			
		}
		else if(h!=0 && m>=45) {
			
			m=m-45;
			System.out.print(h+" ");
			System.out.print(m);
			
		}
	}
}

package algorithm;
import java.util.Scanner;

public class Question14681 {
public static void main(String[] args) {
	int X;
	int Y;
	
	Scanner scanner = new Scanner(System.in);
	X = scanner.nextInt();
	Y = scanner.nextInt();
	
	if(X>0 && Y>0) {
		
		System.out.println(1);
		
	}
	else if(X<0 && Y>0) {
			
		System.out.println(2);
			
		}
	else if(X<0 && Y<0) {
		
		System.out.println(3);
		
	}
	else if(X>0 && Y<0) {
		
		System.out.println(4);
		
		}
	}
}

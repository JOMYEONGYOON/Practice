package algorithm;
import java.util.Scanner;

public class Question2562 {
 
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int max = 0;
		int max_loc = 0;
		for(int i = 1; i <= 9; i++) {
			int num = scanner.nextInt();
			if(num > max) {
				max = num;
				max_loc = i;
			}
		}
		System.out.println(max);
		System.out.println(max_loc);
	}

}

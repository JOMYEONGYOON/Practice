package algorithm;


import java.util.Scanner;

public class Question8958 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] ox = new String[n];
	
		for(int i=0;i<n;i++) {
			ox[i] = scanner.next();
		}
		scanner.close();
		for(int i=0; i<ox.length; i++) {
			int count =0;
			int sum =0;
			
			for(int j=0; j<ox[i].length(); j++) {
				if(ox[i].charAt(j) == 'O') {
					count++;
				}
				else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}

	}
}

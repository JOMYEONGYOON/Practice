package algorithm;


import java.util.Scanner;

public class Question1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double max = 0;
		double avg = 0;
		double sum = 0;
		int n = scanner.nextInt();
		double avgarr[] = new double[n];
		for(int i =0; i<n; i++) {
			double subject = scanner.nextInt();
			
			avgarr[i] = subject;
			if(subject>max) {
				
				max= subject;
	
			}

		}

		  for(int j=0; j<n; j++) {
			  avg = (avgarr[j]/max)*100;
			  sum = avg+sum; 


		  }
		  
		  double result = sum/n;	 
		 System.out.println(result);

	}
}

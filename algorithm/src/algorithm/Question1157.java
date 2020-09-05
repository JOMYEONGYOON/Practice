package algorithm;

import java.util.Scanner;

public class Question1157 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int [26];
			String str = scanner.next();
		for(int i=0;i<str.length();i++) {
			if('A' <= str.charAt(i) && 'Z' >= str.charAt(i)) {
				arr[str.charAt(i) - 'A']++; 
			}else {
				arr[str.charAt(i) - 'a']++;
			}
		
		}
		int max = -1;
		char ch = '?';
		for(int j=0;j<26;j++) {
			if(max<arr[j]) {
				max = arr[j];
				ch = (char)(j+65);
			} else if(max == arr[j]) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		
		
	}
	
}

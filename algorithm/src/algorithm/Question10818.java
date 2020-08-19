import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question10818 {
 
	public static void main(String[] args) throws IOException {
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine());
		StringTokenizer token = new StringTokenizer(br.readLine()," "); //readline통해 입력받으면 공백도 같이 입력 받는다. 그래서 tokenizer로 구분
			
		int min=1000001;
			int max=-1000001;
				
				while(token.hasMoreTokens()) {
					int A = Integer.parseInt(token.nextToken());
					
					if(A<min) {
						min=A;
					}
					if(A>max) {
						max=A;
					}
					
				}
					
					
					
				
			
			
				System.out.println(min + " " + max);
	
	}
}

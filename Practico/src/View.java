import java.util.Scanner;

public class View {

	private int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
		
	}
	private int gcd(int a, int b){
		
		if(a != 0 && b != 0){
			int temp = 0; // Get a/b
			temp = a/b;
			return gcd(a, a - b * temp);
		}
		else return Math.max(a,b);
	}
}

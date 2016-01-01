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
	public int sum(int n){
		int sum = 0;
		for(int i = 0; i <= n; i++){
			int x = (n/gcd(i,n));
			sum = sum + x;
		
		}
		return sum;
	}
}

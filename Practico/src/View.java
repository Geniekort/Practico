import java.util.Scanner;

public class View {

	public static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
		
	}
	private static int gcd(int a, int b){
		
		for(int i = Math.max(a, b); i > 0; i--){
			if(a % i == 0 && b % i == 0){
				return i;
			}
		}
		return 1;
	}
	
	public static int sum(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			int x = (n/gcd(i,n));
			sum = sum + x;
		
		}
		return sum;
	}
	
	public static void main(String[] args) {
		for(int i = View.getInput(); i > 0; i--){
			System.out.println(View.sum(View.getInput()));
			
		}
		
		
	}
}

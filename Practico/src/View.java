import java.util.Scanner;

public class View {

	private int getInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("sysouts zijn zinloos!");
		return s.nextInt();
		
	}
	private int gcd(int a, int b){
		return (1 + 1);
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

import java.util.Scanner;


public class Exercise1_1_5 {
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		double x = scann.nextDouble();
		double y = scann.nextDouble();
		
		if(x >= 0.0 && x <= 1.0
				&& y >= 0.0 && y <= 1.0){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}

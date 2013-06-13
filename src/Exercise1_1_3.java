import java.util.Scanner;


public class Exercise1_1_3 {
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int[] ints = new int[3];
		for(int i = 0; i < ints.length; i++){
			ints[i] = scann.nextInt();
		}
		
		if(ints.length == 3){
			if(ints[0] == ints[1] && ints[1] == ints[2]){
				System.out.println("equal");
			}else{
				System.out.println("not equal");
			}
		}
	}
}

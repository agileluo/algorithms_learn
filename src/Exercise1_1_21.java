import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercise1_1_21 {
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		String name = scann.next();
		List<String> result = new ArrayList<String>();
		while(!"END".equals(name)){
			int x = scann.nextInt();
			int y = scann.nextInt();
			String divide = (double)x / y + "";
			if(divide.indexOf(".") <= divide.length() - 3){
				divide = divide.substring(0, divide.indexOf(0) + 3);
			}
			result.add(name + " " + x + " " + y + " " + divide);
			name = scann.next();
		}
		for(String s : result){
			System.out.println(s);
		}
	}
}


public class Exercise1_1_11 {
	 public static void main(String[] args) {
		boolean[][] booleans = {{true, false,true,true},{false,false,true}};
		printArrays(booleans);
	 }
	 public static void printArrays(boolean[][] booleans){
		 System.out.print(" ");
		 for(int i = 1; i <= booleans[0].length; i++){
			 System.out.print(" " + i);
		 }
		 System.out.println();
		 int i = 1;
		 for(boolean[] bs : booleans){
			 System.out.print(i++ + " ");
			 for(boolean b : bs){
				 if(b){
					 System.out.print("*");
				 }else{
					 System.out.print(" ");
				 }
				 System.out.print(" ");
			 }
			 System.out.println();
		 }
	 }
}

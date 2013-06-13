
public class Exercise1_1_13 {
	 public static void main(String[] args) {
		 String[][] arrays = {
				 {"4", "3", "2"},
				 {"5", "6", "7"}
		 };
		 printTrac(arrays);
	 }
	 public static void printTrac(String[][] arrays){
		 int line = arrays.length;
		 int rows = arrays[0].length;
		 for(int i = 0; i < rows; i++){
			 for(int j = 0; j < line; j++){
				 System.out.print(arrays[j][i] + " ");
			 }
			 System.out.println();
		 }
	 }
}

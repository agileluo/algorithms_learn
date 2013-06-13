
public class Exercise1_1_14 {
	 public static void main(String[] args) {
		System.out.println(log(1));
	 }
	 public static int log(int N){
		 int result = 0;
		 while(true){
			 int sum = 1;
			 for(int i = 0; i < result; i++){
				 sum *= 2;
			 }
			 if(sum > N){
				 return result - 1;
			 }
			 sum = 1;
			 result++;
		 }
	 }
}


public class Chapter_1_3_1_4 {
	public static void main(String[] args) {
		Bag<Double> numbers = new Bag<Double>();
		while(!StdIn.isEmpty()){
			numbers.add(StdIn.readDouble());
		}
		
		double sum = 0;
		for(Double d : numbers){
			sum += d;
		}
		double mean = sum / numbers.size();
		
		sum = 0;
		for(double d : numbers){
			sum += (d - mean) * (d - mean);
		}
		double std = sum / numbers.size();
		
		StdOut.printf("Mean: %.2f\n", mean);
		StdOut.printf("dev: %.2f\n", std);
	}
}

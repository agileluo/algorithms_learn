import java.util.ArrayList;
import java.util.List;


public class JustTest {
	public static void main(String[] args) {
		List<Double> d = new ArrayList<Double>();
		d.add(3.4);
		d.add(4.23);
		for(double num : d){
			d.remove(d.remove(num));
			System.out.println(num);
		}
	}
}

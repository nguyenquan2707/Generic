import java.util.ArrayList;
import java.util.List;

public class GenericWithComparable {

	// From
	/*public static <T> void copy(List<T> source, List<T> target) {
		if(target.get(0).compareTo(source.get(0)) != 0) {
			
		}
	}*/
	
	//To
	public static <T extends Comparable<T>> void copy(List<T> source, List<T> target) {
		if(target.get(0).compareTo(source.get(0)) != 0) {
			
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> source = new ArrayList<>();
		
		source.add(1);
		source.add(2);
		
		
		List<Integer> target = new ArrayList<>();
		copy(source, target);
		
		System.out.println(target);
		
		
	}
}

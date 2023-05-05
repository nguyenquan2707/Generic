import java.util.ArrayList;
import java.util.List;

class Person {
	
	
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private Integer id;
	private String name;
	
}

public class GenericWithNotComparable {

	public static <T extends Comparable<T>> void copy(List<T> source, List<T> target) {
		if(target.get(0).compareTo(source.get(0)) != 0) {
			
		}
	}
	
	public static void main(String[] args) {
		
		List<Person> source = new ArrayList<>();
		
		source.add(new Person(1, "Nguyen Van A"));
		source.add(new Person(2, "Nguyen Van B"));
		
		
		List<Person> target = new ArrayList<>();
//		copy(source, target); //Because Person don't implement Comparable Interface
		
		System.out.println(target);
		
		
	}
}

import java.util.SortedSet;
import java.util.TreeSet;

public class Question1 {

	public static void main(String[] args) {
		SortedSet<String> sorted = new TreeSet<String>();
		sorted.add("A");
		sorted.add("F");
		sorted.add("A");
		sorted.add("D");
		sorted.add("F");
		sorted.add("C");
		sorted.add("B");

		System.out.println(sorted);
	}

}

/* Exercise in Collections
 1. Given the list below, please find the sorted unique values, using the set interface(‘A’,’F’,’A’,’D’, ‘F’,’C’, ‘B’)
  */  


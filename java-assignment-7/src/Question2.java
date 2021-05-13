import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Question2 {

	public static void main(String[] args) {
		Set<Integer> Set1 = new HashSet<>();
		Set<Integer> Set2 = new HashSet<>();
		Set1.add(3);
		Set1.add(4);
		Set1.add(5);
		Set1.add(7);
		Set1.add(8);
		Set1.add(9);
		System.out.println("Elements of Set1: " + Set1);
		Set2.add(5);
		Set2.add(2);
		Set2.add(4);
		Set2.add(6);
		Set2.add(7);
		Set2.add(11);
		System.out.println("Elements of Set2: " + Set2);

//		 Set1.addAll(Set2);
//		System.out.println("The union of Set1 and Set2: " + Set1);

//		Set1.retainAll(Set2);
//		System.out.println("The intersection of Set1 and Set2: " + Set1);
		
		Set2.removeAll(Set1);
		System.out.println("The only unique elements in set2: "+ Set2);
	}

}


/*
  2.Given Two sets below two sets Set1: [3,4,5,7,8,9] Set2: [5,2,4,6,7,11]
  a.Find the intersection in those sets   b.Find the union in those sets 
  c.Find the only unique elements in set2  */

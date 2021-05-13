
import java.util.ArrayList;
import java.util.List;

public class Question3 {

	public static void main(String[] args) {
		List<Integer> Mylist = new ArrayList<Integer>();
		Mylist.add(1);
		Mylist.add(2);
		Mylist.add(4);
		Mylist.add(4);
		Mylist.add(5);
		Mylist.add(5);

		for (Integer numbers : Mylist) {
			if (numbers % 2 != 0) {

				System.out.println(numbers);

			}
		}

	}
}
		
/*
3. Given the list below a.Try to remove the even elements using normal
 for loop   b.Remove even elements using iterators. List<Integer> myList = new ArrayList<>();
 list.add(1);
 list.add(2);
 list.add(4);
 list.add(4);
 list.add(5);
 list.add(5);List<Integer> myListIterator = new ArrayList<>(myList);
 // a. remove myList using for loop// b. remove myListIterator using Iterator

*/
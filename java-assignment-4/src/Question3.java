
public class Question3 {

	public static void main(String[] args) {
	
		int[] numbers = {4, 6, 7, 9}; 
        int element = 7;
        int index = -1;
         
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == element) {
                index = i;
                break;
            }
        }
         
        System.out.println("Index of "+element+" is : "+index);
	}

	
	}



// Write a Java program to find the index of an array element. [4, 6, 7, 9] x=7
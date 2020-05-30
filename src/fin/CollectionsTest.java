/*
	This program inserts 50 random values between 1 and 100 into a LinkedList, sorts the LinkedList, and caluclates the sum and average of its values.
	Author: Darryl Karney
	Course: CPSC24500
 */

package fin;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class CollectionsTest {

	public static void main(String[] args) {
		Random r = new Random();
		LinkedList<Integer> ll = new LinkedList<>();
		
		//Generate and add random values to LinkedList
		for(int i = 0; i < 50; i++) {
			int randomValue = r.nextInt(100) + 1;
			
			ll.add(randomValue);
		}
		
		System.out.println("LinkedList values before sort: " + ll);
		
		//Sort the elements in the LinkedList
		Collections.sort(ll);
		
		System.out.println("LinkedList values after sort: " + ll);
		
		float sum = 0;
		
		//Calculate the sum of all elements in the LinkedList
		for(Integer e : ll) {
			sum += e;
		}
		
		System.out.println("The sum is: " + sum);
		
		//Calculate the average
		float average = sum / ll.size();
		
		System.out.println("The average is: " + average);
	}

}

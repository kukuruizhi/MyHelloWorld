package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> number1 = new ArrayList<Integer>();
		List<Integer> number2;
		for (int i = 50; i >0; i--) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		System.out.println(numbers);
		List<Integer> winningCOmbination = numbers.subList(0, 6);
		Collections.sort(winningCOmbination);
		System.out.println(winningCOmbination);
		
		Collections.sort(winningCOmbination,Collections.reverseOrder());
		System.out.println(winningCOmbination);
		
		number2 = new ArrayList<Integer>(winningCOmbination);
		System.out.println(number2);
		
		number1.addAll(winningCOmbination);
		System.out.println(number1);
		winningCOmbination.add(0, 35);
		System.out.println(winningCOmbination);
		System.out.println(number1);
	}

}

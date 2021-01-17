import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayEx01 {
	public static void main(String[] args) {

		solution3(new int[] { 1, 3, 5, 7, 9 });
		solution3(new int[] { 1, 2, 3, 1, 4, 2 });

	}

	public static boolean solution1(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					return true;
				}
			}
		}

		return false;
	}

	public static boolean solution2(int[] numbers) {
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == numbers[i + 1]) {
				return true;
			}
		}

		return false;
	}
	
	public static boolean solution3(int[] numbers) {
		Set<Integer> SetNumber = new HashSet<>();
		for(int num : numbers) {
			if(SetNumber.contains(num)) {
				return true;
			}else {
				SetNumber.add(num);
			}
		}
		return false;
	}

}
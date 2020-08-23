//Problem 1
import java.util.*;
public class Sum {
	static int getSum(int... a) {
		int sum=0;
		for(int c: a) {
			sum += c;
		} 
		return sum;
	}

	static int getSum2(ArrayList<Integer> nums) {
		int sum=0;
		for(int c: nums) {
			sum += c;
		} 
		return sum;
	}
}

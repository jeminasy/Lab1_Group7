import java.util.*;
public class Main {
	public static void main(String args[]) {
		
		System.out.println("P R O B L E M  1:");
		//Problem 1 getSum method
		System.out.println(Sum.getSum(2,5,3,3,7,8));
		//Problem 1 getSum2 method
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(4);
		nums.add(8);
		nums.add(8);
		System.out.println(Sum.getSum2(nums));
		System.out.println();
		
		System.out.println("P R O B L E M  2:");
		//Problem 2 
		Date d1 = new Date(10,31,2020);
		Date d2 = new Date(12,12,2012);
		Date d3 = new Date(9,24,2002);
		Date d4 = new Date(9,23,2002);
		
		if (d1.compareTo(d2)==1) {
			System.out.println(d1.toString() + " is later than " + d2.toString()) ;
		}else if (d1.compareTo(d2)==0) {
			System.out.println(d1.toString() + " and " + d2.toString() + " are the same dates");
		}else if (d1.compareTo(d2)==-1) {
			System.out.println(d1.toString() + " is earlier than " + d2.toString());
		}
		System.out.println();
		
		System.out.println("P R O B L E M  3: ");
		//Problem 3
		TreeMap<Date, String> syllabus = new TreeMap();
		syllabus.put(d1,"Java");
		syllabus.put(d2,"Ruby");
		syllabus.put(d3,"C#");
		syllabus.put(d4,"Python");
		
		for (Map.Entry<Date, String> Syllabus: syllabus.entrySet()) {
			if (Syllabus.getKey().month==9 && Syllabus.getKey().year==2002) {
				System.out.println(Syllabus.getKey() + ", " + Syllabus.getValue());
			}
		}
		System.out.println();
		
		System.out.println("P R O B L E M  4:");
		//Using iteration getSquare method
		tableOfSquares.getSquare(5);
		System.out.println();
		//Using recursive getSuare2 method
		tableOfSquares.getSquare2(1,9);
	}
}

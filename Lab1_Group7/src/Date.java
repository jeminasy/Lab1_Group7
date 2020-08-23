//Problem 2
public class Date implements Comparable{
	int month; //Month number in range 1 to 12.
	int day; //Day number in range 1 to 31.
	int year; //Year number
	Date (int m, int d, int y){
		this.month = m;
		this.day = d;
		this.year = y;
	}
	@Override
	public int compareTo(Object o) {
		Date giveDate = (Date) o;
		//Compare the years
		//Returns -1 if Date is less than giveDate
		//Returns 0 if Date and giveDate are equal
		//Returns 1 if Date is greater than giveDate
		if (this.year < giveDate.year) {
			return -1;
		}else if (this.year > giveDate.year) {
			return 1;
		}else if (this.month < giveDate.month) {
			return -1;
		}else if (this.month > giveDate.month) {
			return 1;
		}else if (this.day < giveDate.day) {
			return -1;
		}else if (this.day > giveDate.day) {
			return 1;
		}else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
}

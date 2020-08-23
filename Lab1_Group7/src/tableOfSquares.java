
public class tableOfSquares {
	//iteration
	static void getSquare(int n) {
		for (int i=1; i<=n; i++) {
			System.out.println(i + ", " + i*i);
		}	
	}
	//recursive
	static void getSquare2(int i, int n) {
		if (i <= n) {
			System.out.println(i + ", " + i*i);
			getSquare2(i+1, n);
		}else {
			return;
		}
	}
}

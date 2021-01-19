package study0120;

public class Test01 {
	long sum(int[] a) {
		long sum = 0; 
		for (int i = 0; i < a.length; i++) {
			sum +=a[i];
		}
		return sum;
	}
}

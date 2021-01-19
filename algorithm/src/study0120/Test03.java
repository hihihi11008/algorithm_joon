package study0120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test03 {
	
	public static int arithmetic_sequence(int num) {
		
		int cnt = 0;
		
		if (num<100) {
			return num;
		} else {
			cnt =99;
			if (num ==1000) {
				num = 999;
			}
			
			for (int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i/10)%10;
				int one = i % 10;
				
				if ((hun-ten)==(ten-one)) {
					cnt++;
				}
			}
		}
		return cnt;
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		buffw.write(""+arithmetic_sequence(Integer.parseInt(buffr.readLine())));
		buffw.flush();
		buffw.close();
		
	}
}

package study0227;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumberSum {
	public static void main(String[] args) throws IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		buffr.readLine();
		
		int sum= 0;
		for (byte value : buffr.readLine().getBytes()) {
			sum += (value -'0'); // ¶Ç´Â (a-48)
		}
		buffw.write(sum+"");
		buffw.flush();
		buffw.close();
		
	}
}

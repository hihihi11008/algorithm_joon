package study1227;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Test04_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean[] arr = new boolean[42];

		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < 10; i++) {
			arr[Integer.parseInt(buffr.readLine())%42]=true;
		}
		
		int count = 0;
		for (boolean value : arr) {
			if (value) {
				count++;
			}
		}
		buffw.write(count+"");
		buffw.flush();
		buffw.close();
	}
}

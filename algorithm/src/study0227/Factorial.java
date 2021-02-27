package study0227;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Factorial {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(buffr.readLine());
		
		int sum = 1;
		
		//N이 0이 아닐 때 까지 1씩 감소하면서 sum에 반복적으로 곱해준다. 
		while (N!=0) {
			sum = sum * N;
			N--;
		}
		buffw.write(""+sum);
		buffw.flush();
		buffw.close();
	}
}

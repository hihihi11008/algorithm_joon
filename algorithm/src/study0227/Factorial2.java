package study0227;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Àç±Í
public class Factorial2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(buffr.readLine());
		
		int sum = factorial(N);
		
		buffw.write(""+sum);
		buffw.flush();
		buffw.close();
	}
	
	public static int factorial(int N) {
		if (N <= 1) return 1; //Àç±Í Á¾·á Á¶°Ç
		return N * factorial(N-1);
	}
	
}

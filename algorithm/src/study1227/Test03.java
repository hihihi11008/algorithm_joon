package study1227;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(buffr.readLine());
		int b = Integer.parseInt(buffr.readLine());
		int c = Integer.parseInt(buffr.readLine());
		
		int d = a*b*c;
		int[] arr = new int[10];
		
		while (d!=0) {
			arr[d%10]++;
			d/=10;
		}
		for (int i = 0; i < arr.length; i++) {
			buffw.write(arr[i]+"");
			buffw.newLine();
		}
		buffw.flush();
		buffw.close();
	}
}

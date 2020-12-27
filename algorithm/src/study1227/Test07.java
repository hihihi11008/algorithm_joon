package study1227;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr;
		int tast_case = Integer.parseInt(buffr.readLine());
		StringTokenizer st;
		
		for (int i = 0; i < tast_case; i++) {
			st = new StringTokenizer(buffr.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			
			double sum = 0;
			
			for (int j = 0; j < arr.length; j++) {
				int val = Integer.parseInt(st.nextToken());
				arr[j]=val;
				sum+=val;
			}
			double mean =(sum/n);
			double count = 0 ; 
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[j]>mean) {
					count++;
				}
			}
			String s=String.format("%.3f", ((count/n)*100));
			buffw.write(s+"%");
			buffw.newLine();
		}
		buffw.flush();
		buffw.close();
		
		
	}
}

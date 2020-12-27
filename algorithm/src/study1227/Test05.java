package study1227;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test05 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(buffr.readLine());
		double[] arr = new double[n];
		StringTokenizer st = new StringTokenizer(buffr.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(arr);
		double sum = 0 ;
		
		for (int i = 0; i < arr.length; i++) {
			sum +=((arr[i]/arr[arr.length-1])*100);
		}
		
		buffw.write((sum/arr.length)+"");
		buffw.flush();
		buffw.close();
	}
}

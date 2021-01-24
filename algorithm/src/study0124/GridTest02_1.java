package study0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GridTest02_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N =Integer.parseInt(buffr.readLine());
		StringTokenizer st = new StringTokenizer(buffr.readLine());
		
		int sum = 0; 
		int result = 0;
		
		int[] times = new int[N];
		for (int i = 0; i < N; i++) {
			times[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(times);
		
		for (int i = 0; i < N; i++) {
			sum += times[i];
			result += sum ;
		}
		buffw.write(result+"");
		buffw.flush();
		buffw.close();
	}
}

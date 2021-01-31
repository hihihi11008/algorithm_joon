package study0131;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class GreedyTest03 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer((buffr.readLine()));
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[N];
		
		for (int i = 0; i < N; i++) {
			coin[i]=Integer.parseInt(buffr.readLine());
		}
		
		int count=0;
		
		for (int i = N-1; i >= 0; i--) {
			if (coin[i] <= K) {
				count+=(K/coin[i]);
				K= K % coin[i];
			}
		}
		buffw.write(count+"");
		buffw.flush();
		buffw.close();
	
		
	}
}

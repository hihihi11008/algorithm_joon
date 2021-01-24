package study0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class GridTest02 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N =Integer.parseInt(buffr.readLine());
		StringTokenizer st = new StringTokenizer(buffr.readLine());
		
		int[] array =new int[1001];
		
		while (N-- > 0) {
			array[Integer.parseInt(st.nextToken())]++;
		}
		
		int a = 0; // 이전까지의 대기시간 누적 합 
		int sum =0;// 사람별 대기시간 총합 

		for (int i = 0; i < 1001; i++) {
			while (array[i]-- >0) {
				sum+=(i+a);
				
				a +=i;
			}
		}
		buffw.write(sum+"");
		buffw.flush();
		buffw.close();
	}
	
	
}

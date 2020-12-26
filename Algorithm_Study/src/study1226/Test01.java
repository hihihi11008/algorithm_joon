/*일차원 배열 시작 */
package study1226;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n =Integer.parseInt(buffr.readLine());
		
		StringTokenizer st = new StringTokenizer(buffr.readLine());
		
		int index = 0;
		int[] arr = new int[n];
		
		while (st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		Arrays.sort(arr);
		buffw.write(arr[0]+" "+arr[n-1]);
		buffw.flush();
		buffw.close();
	}
}

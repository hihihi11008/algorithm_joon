package study1227;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(buffr.readLine());
		String[] arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = buffr.readLine();
		}
		
		for (int i = 0; i < arr.length; i++) {
			int cnt=0;
			int sum=0;
			
			//OX
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j)=='O') {
					cnt++;
				}else {
					cnt = 0;
				}
				sum+=cnt;
			}
			buffw.write(sum+"");
			buffw.newLine();
		}
		buffw.flush();
		buffw.close();
	}
}


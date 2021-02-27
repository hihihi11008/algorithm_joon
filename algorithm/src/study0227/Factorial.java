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
		
		//N�� 0�� �ƴ� �� ���� 1�� �����ϸ鼭 sum�� �ݺ������� �����ش�. 
		while (N!=0) {
			sum = sum * N;
			N--;
		}
		buffw.write(""+sum);
		buffw.flush();
		buffw.close();
	}
}

package study0121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*º≥≈¡ πË¥ﬁ 2839*/
public class GreedyTest01 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(buffr.readLine());
		int cnt=0;
		
		while (true) {
			if (N%5==0) {
				buffw.write(N/5+cnt+"");
				break;
			} else if (N<=0) {
				buffw.write(-1+"");
				break;
			}
			N = N-3;
			cnt++;
			
		}
		buffw.flush();
		buffw.close();
	}
}

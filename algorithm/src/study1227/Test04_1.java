package study1227;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Test04_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(buffr.readLine())%42);
		}
		buffw.write(hs.size()+"");
		buffw.flush();
		buffw.close();
	}
}

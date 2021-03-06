package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException{
		int c;
		try {
			InputStream inputStream = 
					new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream("test.txt")));
			
			while ((c = inputStream.read()) != -1) {
				System.out.print((char)c);
			}
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
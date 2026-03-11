package com.fileinputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			BufferedInputStream bfr = new BufferedInputStream(fis);
			byte[]buffer = new byte[1024];
			int byteRead;
			while((byteRead = bfr.read(buffer))!= -1) {
			System.out.println(new String(buffer, 0, byteRead));	
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

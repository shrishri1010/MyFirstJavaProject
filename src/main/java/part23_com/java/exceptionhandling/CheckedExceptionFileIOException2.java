package part23_com.java.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionFileIOException2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fr = null;
		FileInputStream fis = new FileInputStream("F:\\tesfghft.docx");
		
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println(bfr.readLine());
		Thread.sleep(5000);
	}
}

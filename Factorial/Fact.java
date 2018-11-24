package factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fact {
	public static void main(String[] args) throws IOException{
		System.out.println("This program prints the factorial of a given number. \n"
				+ "Factorial of a number n is the product of all positive integers from 1 to n.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter a number: ");
		String ip = br.readLine();
		int no = Integer.parseInt(ip);
		int temp = 1;
		for(int i=1; i<=no; i++){
				temp = temp * i;
		}
		System.out.println(no + "! = " + temp);
	}
}

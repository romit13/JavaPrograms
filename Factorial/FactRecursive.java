package factorial;

import java.io.*;

public class FactRecursive {
	public static void main(String[] args){
		System.out.println("This program implements calculating factorial using recusrion");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ip = null;
		int no = 0;
		try{
			System.out.println("Please enter a number: ");
			ip = br.readLine();
			no = Integer.parseInt(ip);
		}catch(IOException ioe){
			System.out.println("There is an issue with your input!");
		}
		FactRecursive fr = new FactRecursive();
		System.out.println("Factorial = " + fr.fact(no));
	}
	
	int fact(int n){
		int res;
		if(n==1){
			return 1;
		}
		res=fact(n-1) * n;
		return res;
	}
}

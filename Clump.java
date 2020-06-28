import java.util.*;
import java.io.*;

public class Clump{
	public static void main(String[] args){

		System.out.print("\nPlease enter a sequence of strings separated\nby spaces. End the sequence with the sentinel\nvalue \"stop\", followed by a return.\n\n");

		Scanner console = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String x = console.next();

		while(!x.equals("stop")){
			list.add(x);
			x = console.next();
		}
		console.close();
		System.out.println("Your original list: " + list + "\n");


		ArrayList<String> answer = new ArrayList<String>();
		for(int i = 0; i < list.size()-1; i = i + 2){
			String temp = list.get(i) + " " + list.get(i+1) ;
			answer.add(temp);
		}
		if(list.size() % 2 != 0){
			answer.add(list.get(list.size()-1));
		}

		System.out.println("Your clumped list: " + answer);
		

	}
}
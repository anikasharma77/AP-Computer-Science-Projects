import java.util.*;
import java.io.*;

public class bubbleSort{
	public static void main(String[] args) 
{		Scanner console = new Scanner(System.in);
		int[] input = new int[10];

		for(int i = 0; i < 10; i++){
			int x = console.nextInt();
			input[i] = x;
		}

		//int [] input = {9,8,7,6,5,4,3,2,1,0};
		System.out.println("bubbleSort");

		System.out.println(Arrays.toString(input));

		int current = 0; 
		int end = 9;

		for(int j = 9; j > 0; j--){
			alterArray(0, j, input);
		}

		System.out.println();

		//alterArray(current, end, input);

		

	}

	public static void alterArray(int current, int end, int[] input){
		while(current+1 <= end){
			if(input[current] > input[current+1]){ 
				int temp = input[current+1];
				input[current+1] = input[current];
				input[current] = temp; 	
				
			} 
			current++;
		}

		System.out.println(Arrays.toString(input));
	}
}
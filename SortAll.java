import java.util.*;
import java.io.*;

public class SortAll {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] orgInput = new int[10];

		for(int i = 0; i < 10; i++){
			int x = console.nextInt();
			orgInput[i] = x;
		}

		//bubble
		System.out.println("bubbleSort");
		int[] conInput = Arrays.copyOf(orgInput, 10);

		System.out.println(Arrays.toString(conInput));

		int current = 0; 
		int end = 9;

		for(int j = 9; j > 0; j--){
			alterArray(0, j, conInput);
		}

		System.out.println();
		//


		//selectionSort
		System.out.println("selectionSort");
		conInput = Arrays.copyOf(orgInput, 10);
		for (int i = 0; i < conInput.length; i++){
			System.out.println(Arrays.toString(conInput));
			int min = i;
			for (int j = i; j < conInput.length; j++){
				if (conInput[j] < conInput[min])
					min = j;
			}
			int temp = conInput[i];
			conInput[i] = conInput[min];
			conInput[min] = temp;
		}
		System.out.println();
		//
		conInput = Arrays.copyOf(orgInput, 10);
		SortInsertion(conInput);

		//merge
		System.out.println("mergeSort");
		conInput = Arrays.copyOf(orgInput, 10);
        System.out.println(Arrays.toString(conInput));
 
        //MergeSort ob = new MergeSort();
        //ob.sort(conInput, 0, conInput.length-1);

        Arrays.sort(conInput);
 
        System.out.println(Arrays.toString(conInput));

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

	public static void SortInsertion(int[] conInput) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		//Scanner console = new Scanner(System.in);

		for(int i = 0; i  < 10; i++){
			int x = conInput[i];

			list.add(x);
		}

		System.out.println("insertionSort");
		// /System.out.println(list);

		ArrayList<Integer> answer = new ArrayList<Integer>();

		// 9 8 7 6 5 4 3 2 1 0


		//for(int j = 0; j < list.size(); j++){
		while(list.size() != 0){		
			answer.add(list.get(0));

			list.remove(0);

			Collections.sort(answer);

			//System.out.print("answer " + answer);
			


			
			System.out.print("[" + answer.get(0));
			for(int k = 1; k < answer.size(); k++){
				System.out.print(", " + answer.get(k));
			}
			int b = 0;
			
			for(b = 0; b < list.size(); b++){
				System.out.print( ", "+ list.get(b));
			}
			System.out.println("]");

			
			
			
		}
		System.out.println();
	}
}
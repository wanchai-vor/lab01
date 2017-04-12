package rmuti.datastructure;

import java.util.Random;

public class ArrayOperation {

private int arr[] = new int[10];
    
	public ArrayOperation(){                 
		for(int i = 0 ; i<arr.length; i++){
			arr[i] = new Random().nextInt();
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int sumArrays(){
		int sum=0;
		for(int i = 0 ;i<arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
	
	public int maxArrays(){
		int max=0;
		for(int i = 0 ;i<arr.length; i++){
			max =  Math.max(max,arr[i]);
		}
		return max;
	}

}

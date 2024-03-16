package Frequencymatrixtechnique;

import java.util.Arrays;

public class Finduniquenumbers {

	public static void main(String[] args) {
		int ar[]= {5,5,6,90,8,2,5,1,9,3,6,2,};
		Arrays.sort(ar);// 1st step
		
		int size=ar[ar.length-1]+1; // 2nd step
		
		int visited[]=new int[size]; //3rd step
		
		for(int i=0; i<visited.length; i++) { // 4th step (may be optional)
			visited[i]=0;
		}
		
		for(int i=0; i<ar.length; i++) { // 5th step
			visited[ar[i]]+=1; // increasing its value by 1 
		}
		
		System.out.println("Finduniquenumbers");
		for(int i=0; i<visited.length; i++) {// final step
			if( visited[i]==1 ) {
				System.out.println(i);
			}
		}	

	}

}

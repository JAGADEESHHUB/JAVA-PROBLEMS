package Bruteforcetechnuque;

import java.util.Arrays;

public class Remove_dup_num {

	public static void main(String[] args) {
		int ar[]= {400,500,200,500,600,100,100};
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
					ar[j]=0;
				}
			}
		}
		System.out.println(Arrays.toString(ar)+"\n");
		
		System.out.println("remove duplicates");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=0) {
				System.out.print(ar[i]+" ");
			}
		}
		
	}

}

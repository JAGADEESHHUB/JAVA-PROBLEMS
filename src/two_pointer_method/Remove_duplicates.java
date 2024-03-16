package two_pointer_method;

import java.util.Arrays;

public class Remove_duplicates {
	public static void main(String[] args) {
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		
        int temp[]=nums;// creating temp aray
        temp[0]=nums[0];// giving the first value of nums ar to temp ar

        int i=0;// first pointer
        int j=1;// second popinter
        int h=1;// this will control the temp ar inside else part in below
        while(j<nums.length){
            if(nums[i]==nums[j]){
                i++;
                j++;
            }else{
                temp[h]=nums[j];
                h++;
                i++;
                j++;
            }
        }
        for(int k=0; k<nums.length; k++){// giving the val of temp ar to nums ar
            nums[k]=temp[k];
        }
        
        System.out.println("remove duplicates");
        for(int k=0; k<h; k++) {
        	System.out.print(nums[k]+" ");
        	
        }
    }
}
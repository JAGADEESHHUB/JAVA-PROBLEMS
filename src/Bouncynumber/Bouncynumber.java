package Bouncynumber;

public class Bouncynumber {
	public static void main(String[] args) {
		int num=121;
		String dum=Integer.toString(num);
		char temp[]=dum.toCharArray();
		int arr[]=new int[temp.length];
		
		int increasing=0;
		int decreasing=0;
		
		for(int i=0; i<temp.length; i++) {
			arr[i]=Character.getNumericValue(temp[i]);
		}
		
		for(int i=0; i+1<arr.length; i++) {
			if(arr[i]<arr[i+1]) {
				increasing++;	
			}
		}
		
		for(int i=0; i+1<arr.length; i++) {
			if(arr[i]>arr[i+1]) {
				decreasing++;	
			}
		}
		
		if(increasing!=0 && decreasing!=0) {
			System.out.println("bouncy number");
		}else {
			System.out.println("Not a bouncy number");
		}
		
		
		
	}
}


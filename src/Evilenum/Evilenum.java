package Evilenum;
public class Evilenum {
	public static void main(String[] args) {
		
		int a=16;
		
		String bival=Integer.toBinaryString(a);
		char temp[]=bival.toCharArray();
		int ans[]=new int[temp.length];
		
		for(int i=0; i<bival.length(); i++) {
			ans[i]=Character.getNumericValue(temp[i]);
		}
		int h=0;
		for(int i=0; i<ans.length; i++) {
			if(ans[i]==1) {
				h++;
			}
		}
		
		if(h%2==0) {
			System.out.println("evil number");
		}
		else
			System.out.println("Odius number");
		
		
	}
	}


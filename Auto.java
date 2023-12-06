package Assignment1;
import java.util.*;

class Auto { 
	public static void main(String args[])
	{ 
		ArrayList<Integer> l=new ArrayList<>();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x=scn.nextInt();
		for(int i=0;i<=x;i++)
		{ 
			int n=scn.nextInt();
			
			l.add(n);
		}
		int j=3;
		int m=x;
		
		while(j!=0)
		{ 
			
			System.out.println(l);
			int a=0;
			
			if(l.size()==m+1)
			{ 
				System.out.println("Capacity out of bound");
				 a=(x+1)/2;
				 int r=l.size()-1;
				for(int i=0;i<a;i++)
				{ 
					l.remove(r-i);
				
				}
				System.out.println(l);
			}
			x=x*2;
			int q=x-l.size();
			System.out.println(x+" Size increase  "+q);
			for(int i=0;i<q+1;i++)
			{ 
				int n=scn.nextInt();
				
				l.add(n);
			}
			j=j-1;
			m=l.size()-1;
			
		}
		
		
		
		
		
	}

}

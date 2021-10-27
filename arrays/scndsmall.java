package array;

public class scndsmall {

	public static void main(String args[])
	{
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		int a[]= {5,9,7,6,3,1};
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}
			
		}
	System.out.println(smin);
			System.out.print(min);
	}
}

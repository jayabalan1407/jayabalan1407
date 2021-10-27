package array;

public class max {
	public static void main(String args[])
	{
		int max=Integer.MIN_VALUE;
		int b=0;
				int a[]= {5,8,9,7,6,3,1};
		for(int i=0;i<a.length;i++) {
			if(a[i]>=max)
			{
				
				max=a[i];
				 b=i;
			}
		}
		System.out.println("the maximum no is"+max);
		System.out.println("it's position is"+b);
	}
}

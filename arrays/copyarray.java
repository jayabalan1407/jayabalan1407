package array;

public class copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
int b[]=new int[5];
int i=a.length-1;
	for(int j=0;j<b.length;j++) {
			
	b[j]=a[i];
	i--;
	System.out.print(b[j]);
	}
	
 

	

	}

}

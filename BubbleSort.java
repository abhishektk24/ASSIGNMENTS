
public class BubbleSort {

	public static void main(String[] args) {
	
		int [] a= {8,2,4,6,9,7,1,3};
		
		System.out.println("Array before sorted ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Array after sorted ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		for(int el : a)
		{
			System.out.print(el+ " ");			
	    }
}
}

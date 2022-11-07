
class Selection
{
	void selection(int a[]) {
		for(int i=0;i<a.length-1;i++)
		{
			int min = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
				  min = j;	
				}
			}
		if(min!= i) 
		{
			int temp =a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	  }
	}
		void printArray(int a[])
		{				
			for (int i=0;i<a.length;i++) 
			{			
				System.out.print(a[i]+ " ");
			}		
		}
}
public class SelectionSort {

	public static void main(String[] args) {
	
		int[] a = {7,4,10,8,3,1};		
		System.out.println("Array before sorting ");				
		for (int i=0;i<a.length;i++)
		{
		System.out.print(a[i] + " ");
		}	
		Selection ss = new Selection();
		ss.selection(a);	
		System.out.println();
		System.out.println("Array after sorting");	
		ss.printArray(a);		
	}

}

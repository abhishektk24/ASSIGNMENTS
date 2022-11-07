
public class DuplicateEementsOfAnArray {

	public static void main(String[] args) {
		
		int [] a = {1,1,2,3,4,5,2,7,9,8,7,5,8};
		System.out.println("Duplicate elements of the array are : ");
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}		
	}
}

package launch2;

public class question1 {

	public static void main(String[] args) {
		
		int n=10;
		for(int i=0;i<n;i++)
		{
		
		for (int j = 0;j<n;j++)
		{
			if(i==0  && j<=3*(n-1)/4 || i==n-1 && j<=3*(n-1)/4 || j==3*(n-1)/8)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
			
		
		for (int j = 0;j<n;j++)
		{
			if(j==0 || j==(n-1) || i==j )
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
		for (int j = 0;j<n;j++)
		{
			if(i==0 && j>=(n-1)/4 || i==(n-1)/2 && j>=(n-1)/4 || i==n-1 && j>=(n-1)/4 || j==(n-1)/4)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
				
		for (int j = 0;j<n;j++)
		{
			if(j==(n-1)/4 && i<n-1 || j==n-1 && i<n-1 || i==n-1 && j>(n-1)/4 && j<n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
		for (int j = 0;j<n;j++)
		{
			if(j==(n-1)/4 || i==0 && j>(n-1)/4 && j<(n-1) || i==(n-1)/2 && j<(n-1) && j>(n-1)/4 || j==n-1 && i>0 && i<(n-1)/2 ||
					i-j==(n-1)/4 && i>=(n-1)/4 && j>=(n-1)/4)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
		for (int j = 0;j<n;j++)
		{
			if(i==0 && j>(n-1)/8 && j<7*(n-1)/8 || j==(n-1)/8 && i>0 && i<(n-1)||j==7*(n-1)/8 && i>0 && i<(n-1) ||
					i==n-1 && j>(n-1)/8 && j<7*(n-1)/8)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
		for (int j = 0;j<n;j++)
		{
			if(j==0 || j==(n-1) || i==j )
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
				System.out.println();
	      }
	}

}


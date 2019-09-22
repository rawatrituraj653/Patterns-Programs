class Pattern12 
{
	public static void main(String[] args) 
	{
	int n,c,r,s;
	java.util.Scanner scan=new java.util.Scanner(System.in);
	
		System.out.println("enter number of rows");
		 n=scan.nextInt();	
		/*for(r=1;r<=n;r++){
			for(c=1;c<=n;c++)
			if(c<=r) System.out.print("* ");
			else System.out.print("  ");
			for(c=1;c<=n;c++)	
			if(c<=n-r)System.out.print("  ");
			else System.out.print("* ");
			System.out.println();
			} */
		for(r=1;r<=n;r++){
			for(c=1;c<=2*n;c++)
				if(c<=r||c>2*n-r)System.out.print("* ");
			else System.out.print("  ");
			System.out.println();
		}	
	}
}

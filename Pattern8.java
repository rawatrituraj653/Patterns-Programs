class Pattern8
{
	public static void main(String[] args) 
	{
		int n,c,r;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter no of Rows");
		 n= scan.nextInt();
		for(r=1;r<=n;r++){
			for(c=1;c<=n;c++){
				if(c<=n-r)System.out.print(1);
				else System.out.print(r);

			}
			System.out.println();

		}

	}
}
 

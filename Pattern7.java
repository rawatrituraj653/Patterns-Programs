class Pattern7 
{
	public static void main(String[] args) 
	{
		int n,c,r,a=1,b;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter no of Rows");
		 n= scan.nextInt();
		for(r=1;r<=n;r++){
			b=a+r-1;
			for(c=1;c<=r;c++,a++){
				if(r%2!=0)
				System.out.print("   "+a);
				else System.out.print("   "+b--);
			}
			System.out.println();

		}

	}
}

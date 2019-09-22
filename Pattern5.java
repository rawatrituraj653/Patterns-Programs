class  Pattern5
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int c,n,r;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter rows No");
		n=scan.nextInt();
		for(r=1;r<=n;r++){
			for(c=1;c<=r;c++){
				if((c+r)%2!=0)				
					System.out.print("   #");
				else
				System.out.print("   $");
			}
		System.out.println();
			
		}
	}
}
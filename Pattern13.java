class Pattern13 
{
	public static void main(String[] args) 
	{
	int n,c,r;
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("enter n number");
	
	 2sn=scan.nextInt();
	for(r=1;r<=n;r++){
		for(c=1;c<=r;c++){
			System.out.print("* ");
						}
		System.out.println();

	}
	for(r=1;r<=n;r++){
		for(c=1;c<=n-r;c++){
			System.out.print("* ");
						}
		System.out.println();

	}
	}
}

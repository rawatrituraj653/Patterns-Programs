class Pattern4 
{
	public static void main(String[] args) 
	{	
		int c,n,r,ch=65,a=1;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter rows No");
		n=scan.nextInt();
		for(r=1;r<=n;r++){
			for(c=1;c<=r;c++){
				if(r%2==0)				
					System.out.print("   "+(char)ch++);
				else
				System.out.print("   "+ a++);
			if(ch>90)ch=65;
			}
			System.out.println("\n");
		}
		
	}
}

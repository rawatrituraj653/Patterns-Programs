class  Pattern3
{
	public static void main(String[] args) 
	{
		int c,n,r,ch=65;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter rows No");
		n=scan.nextInt();
		for(r=1;r<=n;r++){
			for(c=1;c<=r;c++){
				if(c==1||c==r||r==n)
				System.out.print("   *");
				else
				System.out.print("   "+(char)ch++);
			if(ch>90)ch=65;
			}
			System.out.println();
		}
	}
}

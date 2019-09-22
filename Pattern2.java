class Pattern2{
	public static void main(String[] args){
		int c,n,r,a=1;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter rows No");
		n=scan.nextInt();
	/*	for(r=1;r<=n;r++){
			for(c=65;c<=64+r;c++){
				//System.out.print("*");	
				System.out.print(c);	
				System.out.print("   "+(char)c);	
			}
			System.out.println();
		}*/
		for(r=1;r<=n;r++){
			for(c=1;c<=r;c++){
				
				System.out.print("  "+a++);	
			}
			System.out.println();
		
		}

	}
}

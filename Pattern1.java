class Pattern1{
	public static void main(String[] args){
		int c,n,r;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter rows No");
		n=scan.nextInt();
		for(r=1;r<=n;r++){
			for(c=1;c<=r;c++){
				//System.out.print("*");	
				//System.out.print(c);	
				System.out.print(r);	
			}
			System.out.println();
		}
	}
}

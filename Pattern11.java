// printitng paramid
class Pattern11 
{
	public static void main(String[] args) 
	{
	int n,c,r ,s;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter value for rows");
		 n=scan.nextInt();
		/*for(r=1;r<=n;r++){
			for(c=1;c<=n;c++){
			if(c<=n-r)System.out.print(" ");
			else System.out.print("* ");
			}
			System.out.println();
		}

		for(r=1;r<=n;r++){
		  for(s=1;s<=n-r;s++)System.out.print("  ");
		  for(c=1;c<=2*r-1;c++){
		System.out.print(" *");
			}
		System.out.println();
		}*/
		for(r=1;r<=n;r++){
		  for(c=n;c>=1;c--){
		if(c<=n-r)System.out.print("* ");
			else System.out.print(" ");
		  }
		 System.out.print("\n");
		}

	}
}
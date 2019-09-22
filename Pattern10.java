import java.util.Scanner;
class Pattern10 {
	public static void main(String[] args){
		int n,c,r,s;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of rows ");
		 n= scan.nextInt();
		for(r=1;r<=n;r++){
			for (s=r;s<=n-1;s++){
			System.out.print("  ");
			}
			for(c=1;c<=r;c++){
			System.out.print(" *");
			}
			System.out.println();
			
		}

	}
	/*or same for that
			for(r=1;r<=n;r++){
			for(c=1;c<=n;c++){
			if(c<=n-r)System.out.print("   ");
			else System.out.print("  *");
			}*/
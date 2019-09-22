import java.util.Scanner;
class Pattern9 {
	public static void main(String[] args){
		int n,c,r,s;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of rows ");
		 n= scan.nextInt();
		for(r=1;r<=n;r++){
			for (s=1;s<=r;s++){
			
			System.out.print("   ");
			}
			
			for(c=r;c<=n;c++){
			System.out.print(c+"  ");
			}
			System.out.println();
			
		}

	}
}

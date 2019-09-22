import java.util.Scanner;
class Pattern6 {
	public static void main(String[] args){
		int n,c,r;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of rows ");
		 n= scan.nextInt();
		for(r=1;r<=n;r++){
			for(c=1;c<=n-r+1;c++){
			System.out.print(c);
			}
			System.out.println();
			
		}

	}
}

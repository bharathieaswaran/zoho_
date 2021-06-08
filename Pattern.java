
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String str=s.next();
			int n=str.length();
			String str2=str.substring(n/2,n)+str.substring(0,n/2);
			for(int i=0;i<=n-1;i++)
			{
				for(int j=n-1-1;j>=i;j--)
				{
					System.out.print(" ");
					
				}
				for(int k=0;k<=i;k++)
				{
					System.out.print(str2.charAt(k));
				}
				System.out.println();
				}
		
		}

}
	

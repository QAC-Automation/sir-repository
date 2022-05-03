package Practicejava;

public class P4 {

	public static void main(String[] args) {
//		int i,j;
//		for(i=0;i<6;i++)
//		{
//		for(i=6-i;j>=0;j--)
//		{	
//		System.out.println(" ");
//	}
//for(j=1;j<=i;j++)
//{
//System.out.println(""+j);
//}
//System.out.println();
//	}
//}
//}
		int i,j;
		for(i=0;i<6;i++)
		{
			for(j=6-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
System.out.println();
	}

}
}

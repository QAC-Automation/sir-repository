package BasicProgram;

public class CheckPrimeNo {

	public static void main(String[] args) {
	
		 int a=20;
		boolean prime=true;
		for(int i=2;i<a;i++)
		{
		if(a%i==0)
		{
		prime=false;
		break;

		}
		}
		System.out.println(prime);
		}
		}
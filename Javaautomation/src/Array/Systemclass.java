package Array;

public class Systemclass {

	public static void main(String[] args) {

System.out.println("home directry"+System.getProperty("user.home"));


System.out.println("current directry"+System.getProperty("user.dir"));


System.setProperty("user.country","IND");

System.out.println(""+ System.getProperty("user.country"));

System.out.println(""+System.currentTimeMillis());
	}

}

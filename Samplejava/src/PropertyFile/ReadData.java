package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ReadData {

	public static void main(String[] args) throws IOException {
		String CurrentWorkingDir=System.getProperty("user.dir");
	//	System.out.println(CurrentWorkingDir);
		String FilePath=CurrentWorkingDir+ "\\testData\\Data.properties";
	//	System.out.println(FilePath);
		//get file location----->create an instance of FileInputStream class 
		//pass the file location to its constructor
//		FileInputStream f1=new FileInputStream("D:\\Newworkspace\\Samplejava\\testData\\Data.properties");
		         //oR
		//FileInputStream f2=new FileInputStream(FilePath);
		         //for relative path "." indicates current working dir
		FileInputStream f3=new FileInputStream(".\\testData\\Data.properties");
		
		//create an instance of properties class
		Properties pro=new Properties();
		//load properties file using properties class
		pro.load(f3);
		
		//read data from property file
		System.out.println(pro.get("ApplicationURl"));
		System.out.println(pro.get("username"));
		System.out.println(pro.get("password"));
		System.out.println(pro.get("pincode"));
		System.out.println(pro.get("mobnumber"));
		
		
	}

}

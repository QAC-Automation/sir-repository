package Practicejava;


	

class StringReverse{

 public static void main (String [] args){

   String s3="Gurudatta";
   String temp=" ";

for (int i=s3.length()-1;i>=0;i--){
     temp=temp+s3.charAt(i);

System.out.println(" "+temp);
}
}
}



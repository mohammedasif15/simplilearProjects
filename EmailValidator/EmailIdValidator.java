import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailIdValidator {
	
public static void main(String[] args) {
	ArrayList<String> v=new ArrayList<>();
	v.add("abc@gamil.com");
	v.add("bcd@yahoo.com");
	v.add("fgh@outlook.com");
	v.add("nifg@cloud.com");
	v.add("lmt@gmail.com");
	v.add("noe@hotmail.com");
	Scanner s=new Scanner(System.in);
	System.out.println("enter the email u want to search");
	String sc=s.next();
	 Pattern pattern = Pattern.compile(sc); 
	
	for(String e:v) {
		
		  Matcher matcher = pattern.matcher(e);    
		System.out.println(e +" : "+ matcher.matches()+"\n");  
	
}
}
}
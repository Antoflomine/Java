import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	
		int sum=0;
		
		for(int i=0;i<str.length();i++){
		    if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')){
		        System.out.print(str.charAt(i));
		    } 
		    else{
		       sum=sum+(Integer.parseInt(String.valueOf(str.charAt(i))));
		       
		     
		       
		    }
		}

System.out.print(sum);



	}
}

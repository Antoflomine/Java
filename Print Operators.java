import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int y=sc.nextInt();
		for(int i=0;i<n;i++){
		    if(arr[i]==x/y){
		        System.out.print("/");
		    }
		    else if(arr[i]==x*y){
		        System.out.print("*");
		        
		    }
		    else if(arr[i]==x+y){
		        System.out.print("+");
		    }
		    else if(arr[i]==x-y){
		        System.out.print("-");
		    }
		    else{
		        System.out.print("#");
		    }
		}

	}
}

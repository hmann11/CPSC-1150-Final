import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any positive number:");
		int num = input.nextInt();
		if (num<0)System.out.println("Error: Please enter positive number");
		else {int count =0;
			String result="";
			while(num>0){
			if(count==0){result= num%10+"10^"+count;
			}else{
			result= num%10+"10^"+count+" + "+result;
			num=num/10;
			count++;	
		}
	
	}
}
}
}
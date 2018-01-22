import java.util.Scanner;
public class Shit{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int limit = 100, num1=input.nextInt(), num2=input.nextInt();
        input.close();
        int limit2= num1+num2;
        if(limit <= limit2){
            if (limit == limit2)
        System.out.println("lemon");
    else System.out.println("lime");}
    else System.out.println("grape");
    }
}
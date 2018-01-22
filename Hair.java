import java.util.Scanner;
public class Hair{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height in cm:");
        int height= input.nextInt();
        System.out.print("Please enter your hair color as blonde or dark:");
        String color= input.next();
        input.close();
        if (color.equals("blonde")){
            if (height >=190)
            System.out.println("You are a tall blonde.");
            else System.out.println("You are a short blonde.");}
            else if(height>=190)
            System.out.println("Your are tall and dark haired.");
        else System.out.println("Your are short and dark haired.");}
    }
        
       

import java.util.Scanner;
public class Math{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a/b);
        System.out.println(a%b);
        input.close();
    }
}
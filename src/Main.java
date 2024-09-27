import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age to determine if you are eligible: ");
        int age=0;
        age=in.nextInt();
        if (age>=21){
            System.out.println("You get a wrist band, You are welcome!!");
        } else {
            System.out.println(("You dont get a wrist band, You are not eligible!!"));
        }
    }
}
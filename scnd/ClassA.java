package scnd;
import java.util.Scanner;

public class ClassA {
    int x;

    public ClassA() {
        System.out.println("hello");
    }

    public void frstmethod() {
        Scanner scanner = new Scanner(System.in);
        this.x = scanner.nextInt();
    }

    public void scndmethod() {
        System.out.print(this.x+12);
    }

    public void checker() {
        if(this.x % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}

package btu;

import java.util.Scanner;

public class ClassC {
    public  int a ;
    public  int b ;
    public  int c ;

    public void firstmethod() {
        Scanner scanner = new Scanner(System.in);
        this.a = scanner.nextInt();
        this.b = scanner.nextInt();
        this.c = scanner.nextInt();
    }

    public int lastnumber() {
        int var = a %10;
        return var;
    }

    public int firstnumber() {
        int frstnum = Integer.parseInt(Integer.toString(b).substring(0, 1));
        return frstnum;
    }

    public void sumofdigits() {
        int sum = 0;
        while (c != 0)
        {
            sum = sum + c % 10;
            c = c/10;
        }
        System.out.print(sum);
    }

    public int mult() {
        int mult = lastnumber() * firstnumber();
        return mult;
    }

    public void sum() {
        System.out.print(lastnumber() * mult());
    }
}
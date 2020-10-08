package scnd;

import java.util.Scanner;

class ClassB extends ClassA {
    public int y;

    public void method1() {
        Scanner scanner = new Scanner(System.in);
        this.y = scanner.nextInt();
    }

    public  void sum() {
        System.out.print(this.x + this.y);
    }
}

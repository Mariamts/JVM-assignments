package third;


import java.util.Scanner;

public class third {
    public int a;
    public int b;
    public int[] arr = new int[40];
    public int[] summArr = new int[5];



    public void frstmethod() {
        Scanner scanner = new Scanner(System.in);
        this.a = scanner.nextInt();
        this.b = scanner.nextInt();
    }

    public void RandomVal(){
        if (this.b > this.a){
            System.out.println("Interval is from" + this.a + "to" +this.b);
            for(int i=0;i<this.arr.length;i++){
                int randomNum = (int) (Math.random() * (this.b - this.a +1 )) + this.a;
                arr[i] = randomNum;
            }
        }
        else {
            System.out.println("Interval is from" + this.b + "to" +this.a);
            for(int i=0;i<this.arr.length;i++){
                int randomNum = (int) (Math.random() * (this.a - this.b +1 )) + this.a;
                arr[i] = randomNum;
            }
        }
        for (int number: arr
        ) {
            System.out.println("number is: "+number);
        }
    }

    public void OddAndEven() {
        int even = 0;
        int odd= 0;
        int evencounter = 0;
        int oddcounter = 0;
        for(int e : arr ) {
            if(e % 2== 0) {
                even++;
                evencounter += e;
            } else {
                odd++;
                oddcounter += e;
            }
        }
        System.out.print("number of odd is" + odd +"sum of odd" + oddcounter);
        System.out.println();
        System.out.print("number of even is" + even + "sum of even" + evencounter);
        this.getnumbers(evencounter, oddcounter);
    }

    public void getnumbers(int even, int odd ) {
        if(even > odd ) {
            for(int i=0;i<this.summArr.length;i++){
                int randomNum = (int) (Math.random() * (odd - even +1 )) + even;
                summArr[i] = randomNum;
            }
        } else {
            for(int i=0;i<this.summArr.length;i++){
                int randomNum = (int) (Math.random() * (even - odd +1 )) + odd;
                summArr[i] = randomNum;
            }
        }

        for (int number: summArr
        ) {
            System.out.println("number is: "+number);
        }
    }

}



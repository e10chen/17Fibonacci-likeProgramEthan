package sample;
public class MyFibonacci implements Fibonacci {
        int amountofNums = 0;
        int num1 = 3;
        int num2 = 8;

        MyFibonacci(int amount, int num1, int num2) {
            this.amountofNums = amount;
        }

        public void run() {
            System.out.println(this.num1);
            System.out.println(this.num2);
            int prev1 = this.num1;
            int prev2 = this.num2;

            for(int i = 0; i < this.amountofNums; ++i) {
                int newNum = prev1 + prev2;
                System.out.println(newNum);
                prev1 = prev2;
                prev2 = newNum;
            }

        }
    }


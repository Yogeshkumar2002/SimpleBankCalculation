import java.io.*;
import java.lang.System;
import java.util.Scanner;

//Level 1
interface Bank {
    void deposit();
    void withdraw();
    void account();
    void loan();
}

//Level 2
abstract class Dev1 implements Bank {
    int deposit;
    public void deposit()
    {
        System.out.print("Your Deposit Amount : ");
        Scanner scan = new Scanner(System.in);
        deposit = scan.nextInt();
    }
}
 abstract class Dev2 extends Dev1 {
    int withDraw;
    public void withdraw()
    {
        System.out.print("Your Withdraw Amount : ");
        Scanner scan = new Scanner(System.in);
        withDraw = scan.nextInt();
    }
}

//Level 3
class Dev3 extends Dev2 {
    int account;
    public void loan() {}
    public void account() {
        account = deposit - withDraw;
        System.out.print("Your Balance Amount  : ");
        System.out.println(account);
    }

}

//Level 4
class GFG {
    public static void main(String[] args) {
        Dev3 d = new Dev3();
        d.loan();
        d.deposit();
        d.withdraw();
        d.account();
    }
}
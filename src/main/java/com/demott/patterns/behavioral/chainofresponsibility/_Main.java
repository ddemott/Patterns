package com.demott.patterns.behavioral.chainofresponsibility;

import java.util.Scanner;

public class _Main {

    private DispenseChain oneHundredDollarDispenser;

    public _Main() {

        this.oneHundredDollarDispenser = new BillDispenser(100);
        DispenseChain fiftyDollarDispenser = new BillDispenser(50);
        DispenseChain twentyDollarDispenser = new BillDispenser(20);
        DispenseChain tenDollarDispenser = new BillDispenser(10);
        DispenseChain fiveDollarDispenser = new BillDispenser(5);
        DispenseChain oneDollarDispenser = new BillDispenser(1);

        oneHundredDollarDispenser.setNextChain(fiftyDollarDispenser);
        fiftyDollarDispenser.setNextChain(twentyDollarDispenser);
        twentyDollarDispenser.setNextChain(tenDollarDispenser);
        tenDollarDispenser.setNextChain(fiveDollarDispenser);
        fiveDollarDispenser.setNextChain(oneDollarDispenser);
    }

    public static void main(String[] args) {
        _Main atmDispenser = new _Main();
        Scanner input = null;
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount == 0) {
                break;
            }
            atmDispenser.oneHundredDollarDispenser.dispense(new Currency(amount));
        }
        System.out.println("Please remember to take your ATM card. ~BEEP~");
        input.close();
    }

}
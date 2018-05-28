package com.demott.patterns.behavioral.chainofresponsibility;

public class BillDispenser implements DispenseChain {

    private DispenseChain chain;
    private int billSize;

    public BillDispenser(int billSize) {
        this.billSize = billSize;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= billSize) {
            int numberOfBills = cur.getAmount() / billSize;
            int remainder = cur.getAmount() % billSize;
            System.out.println("Dispensing " + numberOfBills + " $" + billSize + " bill(s)");
            if (remainder != 0)
                this.chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(cur);
        }
    }

}
package com.assignment2.q3;

public class Money {

    int money;
    int paisa;

    public Money() {
        this.money = 0;
        this.paisa = 0;
    }

    public Money(int money, int paisa) throws ArithmeticException {

        if (paisa >= 100 || paisa < 0)
            throw new ArithmeticException("ERR! Paisa Can't be " + paisa + ", It should be less then 100 & More then 0.");
        this.money = money;
        this.paisa = paisa;
    }

    public static Money addMoney(Money m1, Money m2) {
        Money tmp = new Money();
        tmp.money = m1.money + m2.money;
        tmp.paisa = m1.paisa + m2.paisa;

        if (tmp.paisa >= 100) {
            tmp.money++;
            tmp.paisa %= 100;
        }
        return tmp;
    }

    public static void main(String[] args) {
        try {
            Money m1 = new Money(0, 50);
            Money m2 = new Money(1, 70);
            Money m3 = Money.addMoney(m1, m2);

            m1.show();
            m2.show();
            m3.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void show() {
        System.out.println("Rs. " + money + "." + paisa);
    }
}

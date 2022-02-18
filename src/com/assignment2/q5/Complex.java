package com.assignment2.q5;

public class Complex {
    int real, imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        real = imaginary = 0;
    }


    public static Complex addComplexNumber(Complex c1, Complex c2) {
        Complex tmp = new Complex();
        tmp.imaginary = c1.imaginary + c2.imaginary;
        tmp.real = c1.real + c2.real;
        return tmp;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(5, 8);
        Complex c2 = new Complex(7, 9);

        Complex c3 = Complex.addComplexNumber(c1, c2);

        c1.showComplex();
        c2.showComplex();
        c3.showComplex();
    }

    public void showComplex() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}
package com.assignment2.q4;

public class Matrix {
    int[][] array;
    int size;

    public Matrix(int size) {
        this.size = size;
    }

    void input(int[][] array) {
        this.array = array;
    }

    public void add(Matrix obj) {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.array[i][j] = this.array[i][j] + obj.array[i][j];
            }
        }
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                System.out.print(this.array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(3);
        Matrix m2 = new Matrix(3);
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        m1.input(array1);
        m2.input(array2);
        m1.add(m2);
        m1.display();
    }
}

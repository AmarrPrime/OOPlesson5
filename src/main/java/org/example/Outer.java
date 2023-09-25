package org.example;
public class Outer {
    public Outer() {
    }

    static class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerValueMethod() {
            System.out.println(innerValue);
// System.out.println(outerValue);
// innerValueMethod();
// outerValueMethod();
        }
    }

    int outerValue;

    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public void outerValueMethod() {
        System.out.println(outerValue);
// System.out.println(innerValue);
// outerValueMethod();
// innerValueMethod();
    }

    public static void main(String[] args) {
        Inner inner = new Inner(10);
        class Cell{
            int x;

            public Cell(int x) {
                this.x = x;
            }

            @Override
            public String toString() {
                return "Cell{" +
                        "x=" + x +
                        '}';
            }
        }
        Cell cell = new Cell(4);
    }


}
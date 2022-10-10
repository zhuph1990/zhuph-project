package com.zph.javase.oop.innerclass;


public class Outer {

    private String name = "messi";

    class Inner {
        private String name = "suarez";

        public void show() {
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outer.this.name);
        }
    }

    public static void main(String[] args) {
        Inner inner = new Outer().new Inner();
        inner.show();
    }
}

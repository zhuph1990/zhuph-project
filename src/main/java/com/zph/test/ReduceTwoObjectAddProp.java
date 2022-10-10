package com.zph.test;

import java.util.ArrayList;
import java.util.List;

class A {
    public static void main(String[] args) {

        List<A> list = new ArrayList<A>();
        list.add(new A(1, 2));
        list.add(new A(100, 200));

        A a = list.stream()
                .reduce(
                        (x , y) -> new A( (x.getPrincipal() + y.getPrincipal()), (x.getFee() + y.getFee()) ) )
                .orElse( new A(0, 0) );
        System.out.println(a);
    }


    int principal = 0;
    int fee = 0;

    public A(int principal, int fee) {
        super();
        this.principal = principal;
        this.fee = fee;
    }
    public A() {
        super();
        // TODO Auto-generated constructor stub
    }
    public int getPrincipal() {
        return principal;
    }
    public void setPrincipal(int principal) {
        this.principal = principal;
    }
    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }
    @Override
    public String toString() {
        return "A [principal=" + principal + ", fee=" + fee + "]";
    }

}

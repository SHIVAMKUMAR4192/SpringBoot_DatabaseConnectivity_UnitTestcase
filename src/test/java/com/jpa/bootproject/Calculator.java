package com.jpa.bootproject;

public class Calculator {
    public int doSum(int a,int b,int c){
        return a+b+c;
    }
    public int doProduct(int a, int b) {
        return a * b;

    }

    //compare
    public Boolean compareTwoNums(int a,int b)
    {
        return a==b;
    }
}

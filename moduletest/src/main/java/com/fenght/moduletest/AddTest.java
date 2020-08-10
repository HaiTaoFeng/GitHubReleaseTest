package com.fenght.moduletest;

public class AddTest {
    public static int addition(int... a){
        int totle = 0;
        for (int b:a) {
            totle += b;
        }
        return totle;
    }

//    public static void main(String[] args) {
//        System.out.println(addition(1,2,3));
//    }
}

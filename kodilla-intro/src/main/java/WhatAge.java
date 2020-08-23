public class WhatAge {
    public static void main(String[] args) {
        int yourAge = 10;

        if (yourAge < 10){
            System.out.println("You're a kid");
        } else if (yourAge > 10 && yourAge < 18) {
            System.out.println("You're a teenager");
        } else {
            System.out.println("You're an adult");
        }
    }
}

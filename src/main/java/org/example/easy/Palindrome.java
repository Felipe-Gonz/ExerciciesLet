package org.example.easy;

public class Palindrome {

    public int x;
    int digit;

    public boolean evaluar(){
        int reversed = 0;
        int original = x;
        int n = x;

        if(x < 0){
            return false;
        }if( x == 0){
            return true;
        }

        while(n!= 0) {
            digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return (original == reversed);

    }

}

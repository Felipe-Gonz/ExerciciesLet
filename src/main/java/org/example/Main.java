package org.example;

import org.example.easy.CommonPrefix;
import org.example.easy.Palindrome;
import org.example.easy.Parentheses;
import org.example.easy.RomanToInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Palindrome palindrome = new Palindrome();
        palindrome.x = 121;

        boolean resultado = palindrome.evaluar();
        System.out.println("Es Palindrome? " + resultado); **/

        /*RomanToInteger romanToInteger = new RomanToInteger();
        int resultado = romanToInteger.romanToInt("MCMXCIV");
        System.out.println("Resultado: " + resultado); **/

        /*CommonPrefix commonPrefix = new CommonPrefix();
        String[] ejemplo = {"flower", "flow", "flight"};
        System.out.println(commonPrefix.Prefijo(ejemplo)); **/

        Parentheses parentheses = new Parentheses();
        Boolean parentesis = parentheses.isValid("(()");
        System.out.println("Resultado:" + parentesis);

    }
}
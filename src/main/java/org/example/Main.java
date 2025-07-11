package org.example;

import org.example.easy.*;

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

        /*Parentheses parentheses = new Parentheses();
        Boolean parentesis = parentheses.isValid("(()");
        System.out.println("Resultado:" + parentesis);**/

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        TowList towList = new TowList();
        ListNode merged = towList.mergeTwoLists(list1, list2);

        while (merged != null){
            System.out.println(merged.val + " ");
            merged = merged.next;
        }


    }
}
package org.example;

import org.example.easy.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Palindrome palindrome = new Palindrome();
        palindrome.x = 121;

        boolean resultado = palindrome.evaluar();
        System.out.println("Es Palindrome? " + resultado);

        RomanToInteger romanToInteger = new RomanToInteger();
        int resultado = romanToInteger.romanToInt("MCMXCIV");
        System.out.println("Resultado: " + resultado);

        CommonPrefix commonPrefix = new CommonPrefix();
        String[] ejemplo = {"flower", "flow", "flight"};
        System.out.println(commonPrefix.Prefijo(ejemplo));

        Parentheses parentheses = new Parentheses();
        Boolean parentesis = parentheses.isValid("(()");
        System.out.println("Resultado:" + parentesis);

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

        DuplicatesArrays duplicatesArrays = new DuplicatesArrays();
        int[] Num = {0, 1, 0, 3, 4, 4, 2, 2};
        int k = duplicatesArrays.removeDuplicates(Num);
        System.out.println("Numero de numeros unicos " + k );

        for (int i = 0; i < k; i++){
            System.out.print(Num[i] + " ");
        }

        RemoveElement removeElement = new RemoveElement();
        int[] Num = {3,2,2,3};
        int val = 3;
        int k = removeElement.removeElements(Num, val);
        System.out.println("Numero removido " + k);
        System.out.print("Nums[");
        for (int i = 0; i < k; i++){
            System.out.print(Num[i] + ", ");
        }
        System.out.print("]");

        FindtheIndex findtheIndex = new FindtheIndex();
        String palabra = "mississippi";
        String palabra2= "issip";
        int valor = findtheIndex.strStr(palabra, palabra2);
        System.out.println("La Respuesta es: " + valor); **/

        InsertPosition insertPosition = new InsertPosition();
        int[] Nums = {1,3,5,6};
        int tgt = 5;
        int k = insertPosition.searchInsert(Nums, tgt);
        System.out.println("La respuesta es: " + k);
    }
}
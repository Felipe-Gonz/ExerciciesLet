package org.example.easy;

import java.util.HashMap;

public class RomanToInteger {

    HashMap<Character, Integer>  map;
    public int romanToInt(String roman){
        int total = 0;
        int longitud = roman.length();
        int valoractual = 0;
        int valorsiguiente = 0;
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0; i < longitud; i++){
            valoractual = map.get(roman.charAt(i));
            if (i + 1 < longitud){
                valorsiguiente = map.get(roman.charAt(i+1));
                if (valoractual < valorsiguiente){
                    total = total - valoractual;
                } else {
                    total = total + valoractual;
                }
            } else {
                total = total + valoractual;
            }
        }

        return total;
    }
}

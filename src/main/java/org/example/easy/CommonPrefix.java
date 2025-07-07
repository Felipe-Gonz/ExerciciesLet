package org.example.easy;

public class CommonPrefix {

    public String Prefijo(String[] palabras){

        if (palabras == null || palabras.length == 0){
            return "";
        }

        String palabraBase = palabras[0];;


        for(int i = 0; i < palabras.length; i++){

            char letraActual = palabraBase.charAt(i);

            for (int j = 1; j < palabras.length; j++){
                if (i >= palabras[j].length() || palabras[j].charAt(i) != letraActual){
                    return palabraBase.substring(0, i);
                }
            }
        }
        return "";
    }
}

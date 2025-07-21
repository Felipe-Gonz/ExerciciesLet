package org.example.easy;

public class FindtheIndex {
    public int strStr(String haystack, String needle) {

        String sub;
        if (needle.isEmpty()){
            return 0;
        }

        for (int i = 0; i <= (haystack.length() - needle.length()); i++){
            sub = haystack.substring(i, i + needle.length());
            if (sub.equals(needle)){
                return i;
            }
        }

        return -1;
    }

}

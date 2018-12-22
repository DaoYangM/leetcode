package top.daoyang.easy;

import java.util.Arrays;
import java.util.HashSet;

public class TheOnlyMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String[] a = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet res = new HashSet<String>();
        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            char[] arr = word.toCharArray();
            String resWord = "";

            for (int i = 0; i < arr.length; i++) {
                resWord += a[(int) arr[i] - 97];
            }
            res.add(resWord);
        }

        return res.size();
    }

    public static void main(String[] args) {
        TheOnlyMorseCode theOnlyMorseCode = new TheOnlyMorseCode();
        System.out.println(theOnlyMorseCode.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}

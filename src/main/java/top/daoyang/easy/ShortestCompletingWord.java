package top.daoyang.easy;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * ShortestCompletingWord
 * "Ah71752"
["suggest","letter","of","husband","easy","education","drug","prevent","writer","old"]
 */
public class ShortestCompletingWord {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        String n = "";
        char[] charArray = licensePlate.toCharArray();
		Arrays.sort(charArray);
        for (char c : charArray) {
            if (!Character.isDigit(c) && !Character.isWhitespace(c)) {
                n += c;        
            }
        }
        charArray = n.toLowerCase().toCharArray();
        String res = "";

        for (String word : words) {
            String w = word;
            List<String> list = new LinkedList<>(Arrays.asList(w.split("")));
            boolean f = true;
            for (char c : charArray) {
                int i = list.indexOf(String.valueOf(c));
                if (i != -1) {
                    list.remove(i);
                } else {
                    f = false;
                    break;
                }
            }
            if (f) {
                if (res.equals("") || res.length() > w.length())
                    res = w;
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        new ShortestCompletingWord().shortestCompletingWord("Ah71752", new String[]{"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"});
    }
}
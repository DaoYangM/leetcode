package top.daoyang.easy;

public class ReverseWordsByWords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            for (int j = 0; j < word.length / 2; j ++) {
                char t = word[j];
                word[j] = word[word.length - j - 1];
                word[word.length - 1 - j]  = t;
            }

            res.append(String.valueOf(word));
            if (i < words.length - 1)
                res.append(" ");
        }

        return res.toString();
    }
    
    public static void main(String[] args) {
        ReverseWordsByWords reverseWordsByWords = new ReverseWordsByWords();

        System.out.println(reverseWordsByWords.reverseWords("Let's take Leetcode contest"));
    }
}
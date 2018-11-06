package top.daoyang.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KeyboardWord{
    public String[] findWords(String[] words) {
        String f = "qwertyuiop";
        String s = "asdfghjkl";
        String t = "zxcvbnm";
        List<String> res = new ArrayList<>();
        int y = 0;
        for (int i = 0; i < words.length;i++) {
            int k = -1;
            String z = words[i].substring(0, 1).toLowerCase();

            if (f.contains(z))
                k = 1;
            else if (s.contains(z))
                k = 2;
            else if (t.contains(z))
                k = 3;
            boolean flag = true;
            for (int j = 1; j < words[i].length(); j ++) {
                String h = words[i].substring(j, j+1).toLowerCase();
                if (k == 1) {
                    if (!f.contains(h)) {
                        flag = false;
                        break;
                    }
                } else if (k == 2) {
                    if (!s.contains(h)) {
                        flag = false;
                        break;
                    }
                } else if (k == 3) {
                    if (!t.contains(h)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                res.add(words[i]);
            }
        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        KeyboardWord k = new KeyboardWord();
        System.out.println(Arrays.toString(k.findWords(new String[]{"Dad", "Alaska", "hello"})));
    }
}

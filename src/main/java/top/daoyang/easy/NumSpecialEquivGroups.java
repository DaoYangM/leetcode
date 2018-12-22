package top.daoyang.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumSpecialEquivGroups {
    public int numSpecialEquivGroups(String[] A) {

        Map<String, Integer> m = new HashMap<>();

        for (String s : A) {
            String even = "", odd = "";

            for (int i = 0; i < s.length(); i+=2)
                even += s.substring(i, i+1);

            for (int i = 1; i < s.length(); i+=2)
                odd += s.substring(i, i+1);


            even = Stream.of(even.split("")).sorted().collect(Collectors.joining());

            odd = Stream.of(odd.split("")).sorted().collect(Collectors.joining());

            String res = even+odd;
            if (m.get(res) == null)
                m.put(res, 1);
            else
                m.put(res, m.get(res) + 1);

        }

        return m.size();
    }

    public static void main(String[] args) {
//        new NumSpecialEquivGroups().numSpecialEquivGroups(new String[]{"abc", "cba"});
        System.out.println((int)"abc".charAt(0));
    }
}

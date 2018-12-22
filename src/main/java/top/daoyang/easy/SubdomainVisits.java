package top.daoyang.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisits {
	public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < cpdomains.length; i++) {
            String[] split = cpdomains[i].split(" ");
            String[] domain = split[1].split("\\.");

            String r = "";
            for (int j = domain.length - 1; j >= 0; j--) {
                r = domain[j] + r;
                if (map.get(r) != null) {
                    map.put(r, map.get(r) + Integer.parseInt(split[0]));
                } else 
                    map.put(r, Integer.parseInt(split[0]));
                if (j > 0) r = '.' + r;
            }
                        
        }

        for (Map.Entry<String, Integer> var : map.entrySet()) {
            res.add(var.getValue() + " " + var.getKey());
        }
        return res;
    }
    public static void main(String[] args) {
        new SubdomainVisits().subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
    }
}
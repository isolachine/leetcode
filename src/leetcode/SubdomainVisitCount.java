package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> results = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for (String domain : cpdomains) {
            Integer count = Integer.valueOf(domain.substring(0, domain.indexOf(' ')));
            String dd = domain.substring(domain.indexOf(' ') + 1, domain.length());
            String[] domains = dd.split("\\.");
            domains[0] = dd;
            if (domains.length == 3) {
                domains[1] = domains[1] + "." + domains[2];
            }

            for (String d : domains) {
                map.put(d, map.getOrDefault(d, 0) + count);
            }
        }

        for (String key : map.keySet()) {
            results.add(map.get(key) + " " + key);
        }

        return results;

    }

    public static void main(String[] args) {
        List<String> results = new SubdomainVisitCount().subdomainVisits(new String[] { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" });
        for (String string : results) {
            System.out.println(string);
        }
    }

}

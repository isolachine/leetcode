package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = new String[] { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String suffix = email.substring(email.indexOf('@'));

            int plus = email.indexOf('+');
            if (plus != -1) {
                email = email.substring(0, plus);
            }
            String[] seg = email.split(".");
            set.add(String.join("", seg) + suffix);
        }
        return set.size();
    }

}

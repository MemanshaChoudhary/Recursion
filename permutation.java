import java.util.ArrayList;
import java.util.List;

public class permutation {
    static void perm(String s, String prefix, List<String> result) {

        if (s.length() == 0) {
            result.add(prefix);
            System.out.println(result);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            perm(remaining, prefix + ch, result);
        }
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        perm("abc", "", list);
    }
}

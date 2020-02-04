//O(n * n!)
public class stringPermutations {
    void getPermutations(String str, String prefix) {
        if (str.length() == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                getPermutations(rem, prefix + str.charAt(i));
            } 
        }
    }
}

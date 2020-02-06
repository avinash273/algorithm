package CodingInteview;

public class compStrPermutation {
    String[] store;

    void getPermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            int k = 0;
            while (prefix.length() != 0) {
                store[k] = prefix;
                k++;
            }

        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                getPermutations(rem, prefix + str.charAt(i));
            }
        }
    }

    void checkStringPermutation(String str1, String str2) {
        getPermutations(str1, "");
    }
}

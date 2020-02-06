package CodingInteview;

public class uniqueChar {
    //O(n2)
    void checkUniqueChar(String str){
        int[] arr;
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            count =0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i))
                    count++;
                if (count > 1)
                    break;
            }
        }
        System.out.println(count);
        if (count > 1)
            System.out.println("\nNot unique");
        else
            System.out.print("\nUnique");
    }
}
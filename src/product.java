public class product {
    void productNoMultiply(int a, int b){
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        System.out.println("Product without *: " + sum);
    }
}
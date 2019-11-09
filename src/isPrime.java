public class isPrime {
    //O(n)
    String check_prime(int number) {
        String is_prime = "Not a Prime Number";
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                is_prime = "Prime Number";
            }
        }
        return is_prime;
    }

    //O(root n)
    String optimised_prime(int number) {
        String is_prime = "Not a Prime Number";
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                is_prime = "Prime Number";
            }
        }
        return is_prime;
    }
}

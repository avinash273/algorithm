public class isPrime{
    String check_prime(int number) {
        String is_prime = "Not a Prime Number";
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                is_prime = "Prime Number";
            }
        }
        return is_prime;
    }
}

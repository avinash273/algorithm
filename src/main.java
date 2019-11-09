public class main {
    public static void main(String[] args){
        System.out.println("This is main class is used to call all other program classes");
        //Code to find a number is prime or not
        isPrime isPrime = new isPrime();
        System.out.println(isPrime.check_prime(17));
    }
}

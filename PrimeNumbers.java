
public class PrimeNumbers {
	
	public static void main (String[] args) {
		int n = 2;
        int counting = 0;
        boolean prime = false; 

        //PrimeNumbers.isPrime(n, counting);
        PrimeNumbers pn = new PrimeNumbers(); 
        

        while (counting < 10001) {
            prime = pn.isPrime(n);
            if (prime) {
                counting++;
                //System.out.println("Number: " + counting);
            } else {
                //System.out.println("Number: " + n);
            } 

            if (counting == 10001) {
                System.out.println("The 10001th prime number is " + n + ".");
                break;
            }

            n++;
        }
    }

    //public static boolean isPrime (int n, int counting) {
    private boolean isPrime (int n) {
        boolean reply = false;       
        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        } 

        for(int i = 3; i < n ; i+=2) {
            if (n % i == 0) {
                return false;
            } 
        } 

        return true;
    } 
}

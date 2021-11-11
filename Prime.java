import java.util.Random;

public class Prime {

    public static void main(String[] args) {
        
        printPrimes();
        
    }

    private static void printPrimes() {

        Random random = new Random();
        int num = random.nextInt(100);

        for(int i = 1; i < 100; i++) {
            boolean isPrime = true;
            for (int x = 2; x < i; x++){
                if (i % x == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
        }

        }


    }


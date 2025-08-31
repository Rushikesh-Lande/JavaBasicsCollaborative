import java.util.Random;
public class GenerateRandomNum{
public static void main(String[] args) {
        
        // generate random number using Random class
        Random rand = new Random();
        int number = rand.nextInt(100);  // from 0 to 99
        System.out.println("Random number (0-99): " + number);
        
        // generate random number using Math.random()
        double doubleRandom = Math.random();
        System.out.println("Random double (0.0 to 1.0): " + doubleRandom);
        
        int dbl = (int)(Math.random() * 100);  // from 0 to 99
        System.out.println("Random number (0-99): " + dbl);
        
        // generate 4 digit OTP (1000 - 9999)
        int otp = 1000 + rand.nextInt(9000);
        System.out.println("4 digit OTP generated : " + otp);
        
        // generate 6 digit OTP (100000 - 999999)
        int otps = 100000 + rand.nextInt(900000);
        System.out.println("6 digit OTP generated : " + otps);
    }
}
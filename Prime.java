import java.util.Scanner;
public class Prime {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println("true (since " + number + " is a prime number)");
        }
       
        scanner.close();
    }
    

        public static boolean isPrime(int number){
            if(number <=1 ){
                System.out.println("false (since "+number+" is not a prime number)");
                return false;
            }
            for (int i = 2; i <= number-1; i++){
                    if(number % i == 0){
                        System.out.println( "false (since "+number+" is not a prime number)");
                        return false;
                    }
                       
                }    
            
            return true;
        }
    }




package day2;
import java.util.Scanner;

public class Check_prime {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int number = sc.nextInt();

        check_prime(number);
    }
    public static void check_prime(int n){
        for(int i=0;i<n;i++){
            int count = 0;
            if(i<2){
                System.out.println("Not prime: "+i);
                continue;
            }
            for(int j=1;j<=n;j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("Prime: "+i);
            }else{
                System.out.println("Not Prime: "+i);
            }
        }
//        for(int i=0;i<n;i++){
//            if(i<2){
//                System.out.println("Not prime: "+i);
//                continue;
//            }
//            boolean isPrime=true;
//            for(int j=2;j*j<=i;j++){
//                if(i%j ==0){
//                   isPrime = false;
//                   break;
//                }
//            }
//            if(isPrime){
//                System.out.println("Prime: "+i);
//            }else{
//                System.out.println("Not prime: "+i);
//            }
//        }
    }
}

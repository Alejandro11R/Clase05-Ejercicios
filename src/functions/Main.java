package functions;

import java.lang.Math;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        exampleString();
            }


            private static void exampleString() {
                var name = "alejandro Rodriguez Real";
                System.out.println(name.length());
                System.out.println(name.toUpperCase());
                System.out.println(name.toLowerCase());
                
            }
        
        
            private static void exampleRamdom() {
                var random = new Random();

                for (int i = 0; i < 10 ; i++) {
                    System.out.println(random.nextInt(10));
                }
                
            }
        
        
            private static void examploMath(){
        System.out.println(Math.min(5, 7));
        System.out.println(Math.sqrt(125));
        System.out.println(Math.pow(2, 30));                             
    }
}

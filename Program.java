 

//import stuff here
import java.util.Scanner;
//Your code here

public class Program7 {
    //Define your final variables here
    // **HINT: Maybe the conversion rates?????**
     

    public static void main(String[] args){
        //Make your own test code here
        Scanner numScanner = new Scanner(System.in);
        
        int schruteBucks = 0;
        int stanleyNickels = 0;
        int klevin = 0;
        
        
        System.out.println("Enter schrute-bucks: ");
            schruteBucks = numScanner.nextInt();
            
        System.out.println("Enter klevins: ");
            klevin = numScanner.nextInt();
            
        System.out.println("Enter stanley-nickels: ");
            stanleyNickels = numScanner.nextInt();
        int schruteBucks2 = 100 * stanleyNickels;
        final int klevToSch = 20;
        final int stanToKlev = 12; 
        int finalSchruteBucks = 20 * klevin;
        int finalKlevins = 12 * stanleyNickels;
        double total = 0;
        total = (klevin * stanToKlev) + stanleyNickels;
        double total2 = total / (stanToKlev * klevToSch); 
        double total3 = (schruteBucks + total2);
        int total31 = (int) (total3 * 100);
        total3 =  (double) total31 / 100;
        System.out.println("Decimal schrute-bucks = " + total3 );
        
      
        
        
        
    }
    
    
    
   //public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        //implement a function that converts from the old format to the new format
         
    }

package src.main.java;

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
            
        System.out.println("Enter stanley-nichels: ");
            stanleyNickels = numScanner.nextInt();
        
        //final int finals = SchruteBuck = 20 * klevins;
        //final int finalKlevin = 12 * stanleyNichels;
        
        System.out.println(schruteBucks + "." + klevin + "." + stanleyNickels);
        
        int newStanleyNickel = 0;
        int schruteBuck = 100 * newStanleyNickel;
        
        
    }
    
    
    
   //public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        //implement a function that converts from the old format to the new format
         
    }


/**
 * Truth class finds truth values of conjuction, disjunction, exclusive or conditional statement, and biconditional statement of propositions p and q based on user input.
 *
 * Branden Carstarphen
 * 9-10-2021
 */

   import java.util.Scanner; // Implies Scanner for input will be used

   public class Truth{ // creates Truth class with opening bracket
       Boolean conjuction( Boolean p, Boolean q){
           return (p && q); //Returns conjunction of propositions p Logical AND q
        } // closing conjunction bracket
        
       Boolean disjunction(Boolean p, Boolean q){
           return (p || q); //Returns disjunction of propositions p OR q
        } // closing disjunction bracket
        
       Boolean xor(Boolean p, Boolean q){
           return (p ^ q); //Returns exclusive of propositions p AND q
        } // closing exclusive bracket
        
       Boolean conditional(Boolean p, Boolean q){
           return (!p || q); //Returns conditional statement of propositions NOT p OR q
        } // closing conditional statement bracket
        
       Boolean biconditional(Boolean p, Boolean q){
           return(!p || q) && (!q || p); //Returns biconditional of propositions (NOT p OR q) AND (NOT q OR p)
        } // clsoing biconditional statement bracket
        
        public static void main(String[]args){ // Main method opening bracket
            
            Boolean p = false, q = false; //Assigns booleans to p and q
            Scanner sc = new Scanner(System.in); //Creates Scanner for user input
            System.out.print("Enter proposition p:"); // Prompts user input for p
            p = sc.nextBoolean(); //Takes user input for p with scanner
            System.out.print("Enter proposition q:"); //Prompts user input for q
            q = sc.nextBoolean(); //Takes user input for q with scanner
            
            Truth t= new Truth(); //Method creates new truth based on user input
            
            System.out.println("The conjuction of p and q is:" +t.conjuction(p, q)); //Prints conjuction of p and q
            System.out.println("The disjunction of p and q is:" +t.disjunction(p, q)); //Prints disjunction of p and q
            System.out.println("The exclusive || of p and q is:" +t.xor(p, q)); //Prints exclusive OR of p and q
            System.out.println("The conditional of p and q is:" +t.conditional(p, q)); //Prints the conditional of NOT p OR q
            System.out.println("The biconditional of p and q is:" +t.biconditional(p, q)); //Prints the biconditional of (NOT p OR q) AND (NOT q OR p)
            
        } //Closing Main() method bracket
        
    } // Closing bracket of entire Truth class
        
        
    
    



import java.util.ArrayList;
import java.util.Scanner;

public class startingScript {
    
    public static Scanner scn = new Scanner(System.in);

    static String letterCheck() {
        String letter;
        if (scn.hasNext()){ 
            
            letter = scn.nextLine();
            
        } else {letter = scn.next();}
            try {

            if ((letter.length() == 1 )&& (true)) {  
            // Letter and 1 char long
            
            try {Double var1 = Double.valueOf(letter); throw new Exception("Letter Only." + var1);} 
            
            catch(NumberFormatException e) {return letter;}
                
        } else { throw new Exception("1 character only."); }
        } catch (Exception e) { System.out.println("Erreur! : " + e); return null;
    }
}

    
 // simple error case
    

    public static void main(String[] args) {    
    
    System.out.print("\033[H\033[2J");  System.out.flush(); 

    ArrayList<String> lettersUsed = new ArrayList<String>(); lettersUsed.add(" ");
    // ArrayList<String> secretWord = new ArrayList<String>();



while (true) { 

        String letter = letterCheck();
        if (!(letter.equals(letter))) { 
            lettersUsed.add(letter); // add letter to list
            System.out.println(letter + " : list");
        }
        System.out.println(!(letter.equals(letter)));
        System.out.println(lettersUsed.toString());}

    //for (String x : lettersUsed) {
 //       System.out.println(!(letter.equals(x)));  
   //     if (!(letter.equals(x))) { 
     //       lettersUsed.add(letter); // add letter to list
       ///     System.out.println(letter + " : list");
       // }
        //System.out.println(lettersUsed.toString());}
    

}
}
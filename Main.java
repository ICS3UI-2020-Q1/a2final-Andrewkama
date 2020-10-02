/**
 	*
 	* @author
 	*/
       import java.util.Scanner;
 
  
    /**
 	* asks the customer  for the diameter of pizza in Cm, calculates the price  and sends the user a message.
 	* @author Andrew
 	*/
    public class Main {
    
 
 	/**
   	* @param args the command line arguments
 	*/
 	public static void main(String[] args) {
 	// delcare the scanner 
 	Scanner input = new Scanner(System.in);
    
 
 	// varying components
 	double diameter; // diameter for pizza
 	double subtotal;  // cost befroe tax
 	double tax;      // tax totaol
 	double total;    // toatal ptice
    
 
 	// tax
 	final double SALES_TAX = 0.13;
 	// Adtional fees
 	final double price_LABOUR = 0.75; 
 	final double price_POWER = 0.99;
 	final double price_SIZE = 0.5; 
 	//Size range
 	final double SIZE_20 = 20; // medium
 	final double SIZE_40 = 40; //large
   	//asks for  diameter 
 	System.out.println("What is the size of the pizza (in cm):");
 	diameter = input.nextDouble();    
 
 	// price for the pizza labour and power and size
 	subtotal = PRICE_LABOUR + PRICE_POWER + (diameter + PRICE_SIZE); 
    //Finds tax amount
 	tax = subtotal*SALES_TAX;
    //add tax to price 
 	total = subtotal + tax;
    // display pirceing before tax , tax total and all togather
   // price before tax 
 	System.out.println("Subtotal: $" + subtotal);
    // taxe toatal
 	System.out.println("Taxes: $" + tax);
    // total
 	System.out.println("Total: $" + total);
   //add message 
 	if (diameter > SIZE_40){ // 40cm or larger pizza message
 	System.out.println("Whoa, big pizza! You might need a truck to get this home!");
 	}else if (diameter > SIZE_20){ //40cm - 20cm medium pizza message
 	System.out.println("This will be delicious!");
 	}else{ //20cm or less small pizza message
 	System.out.println("We are going to make you a cute little pizza!");
 	}
    }

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//class ShippingCost
//	main ()
//		num itemPrice
//		num shippingPrice
//		num totalPrice
//			output “Please enter the price of the item.”
//			Input itemPrice
//			if [itemPrice ≥ 100] then
//				shippingPrice = 0.00
//			else
//				shippingPrice = itemPrice * 0.02
//			end if
//			totalPrice = itemPrice + shippingPrice
//			output “The shipping cost for this item is $” + shippingPrice + “ and the total cost for this item is $” + totalCost + “.”
//	return
//end class
        //declare variables
        int itemPrice ;
        double shippingPrice ;
        double totalPrice ;
        //prompt user to enter the price
        System.out.println("Please enter the price of your item:");
        //take the user input
        itemPrice = input.nextInt() ;
        //if then
        if (itemPrice >= 100) {
            shippingPrice = 0.00 ;
            System.out.println("You have no shipping charge, so your total price is $" + itemPrice);
        }
        else {
            shippingPrice = itemPrice * 0.02 ;
            totalPrice = itemPrice + shippingPrice ;
            System.out.println("Your shipping cost is $" + shippingPrice + ", so your total price is $" + totalPrice);
        }
    }
}
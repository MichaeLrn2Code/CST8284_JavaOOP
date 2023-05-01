/**
 * File name: Invoice.java
 * Author: Wai Wai Chan, 041057469 
 * Course: CST8284, Java
 * Assignment: 23W Lab 6
 * Due Date: 31 Mar 2023
 * Professor: David Houtman
 * Description: 
 * This class implements the Payme interface, providing methods to print out invoice's information and calculate payment amount.
 * 
 * @author Wai Wai Chan
 */
public class Invoice implements Payme {

private String partNumber; 
private String partDescription;
private int quantity;
private double pricePerItem;

/**
 * Parameterized constructor to initialize a Invoice object with passed part number, part description, quantity and price per item.
 * 
 * @param part the part number of the item
 * @param description the part description of the item
 * @param count the quantity of the item
 * @param price the price per item
 */
public Invoice(String part, String description, int count, 
 double price) {
 partNumber = part;
 partDescription = description;
 setQuantity(count); // validate and store quantity
 setPricePerItem(price); // validate and store price per item
}

/**
 * Sets the part number for Invoice. The setter hasn't checked if
 * user input is the expected result which should be a String without special characters
 * and should not be something other than that, for example: a whole number or a double.
 * 
 * @param part the part number for this invoice
 */
public void setPartNumber(String part) {
 partNumber = part; 
}

/**
 * Returns the part number of Invoice. The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return part number of this Invoice
 */
public String getPartNumber() {
 return partNumber;
}

/**
 * Sets the part description for Invoice. The setter hasn't checked if
 * user input is the expected result which should be a String and should not be something other than that, for example: a whole number or a double.
 * 
 * @param description the part description of this invoice
 */
public void setPartDescription(String description) {
 partDescription = description; 
}

/**
 * Returns the part description of Invoice. The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * 
 * @return partDescription the description of the part
 */
public String getPartDescription() {
 return partDescription;
}

/**
 * Sets quantity of part for the Invoice. This method guarantees the input count must be greater than or equal to zero. 
 * If the input count is smaller than zero, this method sets the quantity as zero, otherwise sets the quantity as passed count.
 * However, this method hasn't checked if the input count should be a whole number and should not be something other than that, for example: a string.
 * 
 * @param count the quantity of the part
 */
public void setQuantity(int count) {
 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
}

/**
 * Returns the quantity of part. The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return quantity the quantity of the part
 */
public int getQuantity() {
 return quantity;
}

/**
 * Sets price per item for the Invoice. This method guarantees the input price must be greater than or equal to zero. 
 * If the input price is smaller than zero, this method sets the price per item as zero, otherwise sets the price per item as passed price.
 * However, this method hasn't checked if the input price should be a double and should not be something other than that, for example: a string.
 * 
 * @param price the price of a item
 */
public void setPricePerItem(double price) {
 pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
}

/**
 * Returns the price per item of the invoice. The result of 
 * the getter hasn't been checked for valid input, having the
 * possibility of returning the unexpected result.
 * 
 * @return pricePerItem the price per item of the Invoice
 */
public double getPricePerItem() {
 return pricePerItem;
}

/**
 * Returns a string representation for the part number, part description, quantity and price per item of the Invoice Object.
 * 
 * @return a string representation showing the part number, part description, quantity and price per item
 */
@Override
public String toString() {
 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
    "invoice", "part number", getPartNumber(), getPartDescription(), 
    "quantity", getQuantity(), "price per item", getPricePerItem());
} 

/**
 * Returns the total cost of the Invoice Object by multiplying quantity by price per item.
 * 
 * @return a double representing the total cost of the Invoice
 */
@Override
public double getPaymentAmount() {
 return getQuantity() * getPricePerItem(); // calculate total cost
}

/**
 * Returns the income tax amount of Invoice by multiplying total cost amount by 30%.
 * 
 * @return a double of income tax amount which is 30% of the total cost amount
 */
@Override
public double display() {
	return getPaymentAmount()*0.3;
}
}



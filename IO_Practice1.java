import java.util.Scanner; 
import javax.swing.JOptionPane; 
public class IO_Practice1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Brevin Blalock
		 * CS160-02/03/04 Spring 2019
		 * Lab 03
		 */
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		int numberOfBooks;
		int yearPublished;
		double unitPrice;
		String bookTitle;
		String publisher;
		String edition;
		String cfirstName, cmiddleName, clastName;
		String streetAddress, cityName, stateName, zipCode;
		String afirstName, amiddleName, alastName;

		
		
		System.out.println("Enter number of books: ");
		numberOfBooks = sc1.nextInt();
	
		System.out.println("Unit price of the book? ");
		unitPrice = sc1.nextDouble();
	
		System.out.println("Enter your first name, middle name, and last name:");
		cfirstName = sc2.next();
		cmiddleName = sc2.next();
		clastName = sc2.nextLine();
		
		System.out.println("Enter your street address (i.e., nos and street):");
		streetAddress = sc2.nextLine();
		
		System.out.println("Enter the name of the city");
		cityName = sc2.nextLine();
		
		System.out.println("Enter the name of the state");
		stateName = sc2.nextLine();
		
		System.out.println("Enter Zip Code");
		zipCode = sc2.nextLine();

		System.out.println("Enter your favorite author first name, middle name and last name:");
		afirstName = sc2.next();
		amiddleName = sc2.next(); 
		alastName = sc2.nextLine();
			
		System.out.println("Title of your favorite book:");
		bookTitle = sc2.nextLine();
		
		System.out.println("Enter the name of the publisher for the book:");
		publisher = sc2.nextLine();
		
		System.out.println("Enter the edition for the book: ");
		edition = sc2.nextLine();
		
		System.out.println("Enter the year for publishing the book: ");
		yearPublished = sc1.nextInt();
		
		double totalCost = unitPrice * numberOfBooks;
		int titleLength = bookTitle.length();
		
		String outputA = "Imformation about your book:\n Author:\n\t" + alastName + ", " + afirstName + " " + amiddleName
				+ "\nMy favorite book from " + afirstName + " is:\n\t" + bookTitle + "\n\t" + publisher + " "+ edition + " edition, " + yearPublished + "."
				+ "\nThe length of the book title is: " + titleLength + "." 
				+ "\nThe total cost of " + numberOfBooks + " book(s) of unit price $" + unitPrice + " is $" + totalCost + " from the " + publisher + " publisher";
				
		 
		System.out.println(outputA);
		
		String reOrder = JOptionPane.showInputDialog(null, "Enter the unit price of the book ordered:");

		 String outputB = "Imformation about Customer:\n" 
					+ "Name: " + cfirstName + " " + cmiddleName + " " + clastName
					+ "\nStreet Address: " + streetAddress + ".,\n" + "City: " + cityName + "\nState: " + stateName + "\nZip Code: " + zipCode
					+ "\nThe total cost for reordered " + numberOfBooks + " book(s) of unit price $" + reOrder + " is $" + totalCost
					+ " from the " + publisher + " Publishers." + "\nThe end of the invoice.";
		 
		int q = JOptionPane.showConfirmDialog(null, "Do you want to reorder this book?", "Question?", JOptionPane.YES_NO_OPTION);
		
		 if (q == JOptionPane.YES_OPTION) {
			 System.out.println(reOrder);
			 System.out.println(outputB);
        }
        else {
            JOptionPane.showMessageDialog(null, "Have a nice day!");
        }

		 
		System.exit(0);	
	}

}

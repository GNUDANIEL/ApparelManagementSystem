package apparel;

import java.util.Scanner;

public class TopApparel extends Apparel implements ApparelInput {

	public TopApparel(ApparelKind kind) {
		super(kind);//this.kind와 동일?
	}

	public void setApparelGender(ApparelInput apparel, Scanner input) {
		char answer = 'f';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Is this Unisex apparel? (Y/N): ");
			
			answer = input.next().charAt(0);
			if (answer == 'y' ||answer ==  'Y') {
				gender = "Unisex";
				this.setGender(gender);
				break;
				}
				else if (answer == 'n' ||answer ==  'N') {
					setScanGender(input);
					break;
				}
				else {}			
		}
	}
	
	public void setScanGender(Scanner input) {
		System.out.print("Gender: ");
		String gender = input.next();
		this.setGender(gender);
	}
	
	public void setScanSize( Scanner input) {
		System.out.print("size: ");
		String size = input.next();
		try {
			this.setSize(size);
		} catch (SizeFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect Size. Put right size within 2 characters");
		}
	}
	

	public void getUserInput(Scanner input) {
	 	
		setApparelName(input);
		setApparelGender(this, input);	
		setApparelSize(input);	
		setApparelNumber(input);		
		setApparelStock(input);	
		setApparelLocation(input);		
		setApparelColor(input);		
		setApparelPrice(input);		
		setApparelSeason(input);
		
		System.out.println("\n --- Check New Apparel Information ---  ");
		System.out.println("name: "+ name);
		System.out.println("Gender: " + gender);
		System.out.println("Size: "+ size);
		System.out.println("ProductNumber: " + productNumber);
		System.out.println("Location: " +location);
		System.out.println("Stock: "+ stock);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		System.out.println("Season: " + season);
		System.out.println("\n Information is successfully registered \n");
 }
	public void printInfo() {	 
		String skind = "none"; 
		switch (this.kind) {
		case Top : 
			 skind = "Top";
			 break;
		 case Outer:
			 skind = "Outer";
			 break;
		 case Bottom:
			 skind = "Bottom";
			 break;
		 case Acc:
			 skind = "Accessory";
			 break;
		 default:
			 skind = "none";
			 break;
		 }
		 System.out.println("Kind: "+ skind);
		 System.out.println("Name: " + this.name);
		 System.out.println("Size: " + this.size);
		 System.out.println("Gender: " + this.gender);
		 System.out.println("Location: "+ this.location);
		 System.out.println("ProductNumber: " + this.productNumber );
		 System.out.println("Stock: " + this.stock);
		 System.out.println("Color: " + this.color);
		 System.out.println("Price: " + this.price);
		 System.out.println("Season: " + this.season);
	 }

}

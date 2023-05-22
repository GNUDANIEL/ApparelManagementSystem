package apparel;
import java.util.Scanner;

public class BottomApparel extends Apparel{
	// Apparel 상속받은 하의 Bottom
	//하의를 고를 떄 고려해야하는 부분 선정 예정.
	public BottomApparel(ApparelKind kind) {
		super(kind); //this.kind와 동일?
	}
	
	public void setScanSize(Scanner input) {
		System.out.print("Size: ");
		String size = input.next();
		try {
			this.setSize(size);
		} catch (SizeFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect Size. Put right size within 2 character");
		}
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

	public void getUserInput(Scanner input) {
		setApparelName(input);
		setApparelGender(this, input);
		setScanSize(input);
		setApparelNumber(input);
		setApparelStock(input);
		setApparelLocation(input);
		setApparelColor(input);	
		setApparelPrice(input);
		setApparelSeason(input);
		
		System.out.println("\n --- Check New Apparel Information ---");
		System.out.println("name: "+ name);
		System.out.println("Gender: " + gender);
		System.out.println("Size: "+ size);
		System.out.println("ProductNumber: " + productNumber);
		System.out.println("Location: " +location);
		System.out.println("Stock: "+ stock);
		System.out.println("Price: " + price);
		System.out.println("Season: " + season);
		System.out.println("\n Information is successfully registered \n");
		}
	
		@Override
	public void printInfo() {	 
		String skind = getKindString(); 	
		System.out.println("kind: "+ skind);
		System.out.println("name: " + this.name);
		System.out.println("size: " + this.size);
		System.out.println("gender: " + this.gender);
		System.out.println("location: "+ this.location);
		System.out.println("productNumber: " + this.productNumber );
		System.out.println("Stock: " + this.stock);
		System.out.println("Price: " + this.price);
		System.out.println("Season: " + this.season);
		}
			
	public String getKindString() {
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
				 break;
			 }
			return skind;
		}
	}


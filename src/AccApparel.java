import java.util.Scanner;

public class AccApparel extends Apparel {
	// Apparel 상속받은 악세사리 Apparel
	public void getUserInput(Scanner input) {
		System.out.print("Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("ProductNumber: ");
		int productNum = input.nextInt();
		this.setProductNumber(productNum);
		
		System.out.print("Location: ");
		String location = input.next();
		this.setLocation(location);
		
		System.out.print("Stock: ");
		int stock = input.nextInt();
		this.setStock(stock);
		
		System.out.print("Color: ");
		String color = input.next();
		this.setColor(color);
		
		char answerSize = 'f';
		while(answerSize !='y' && answerSize !='Y' && answerSize !='n' && answerSize !='Y') {
			System.out.print("Is this Free size accessory? (Y/N): ");
			
			answerSize = input.next().charAt(0);
			if (answerSize == 'y' || answerSize ==  'Y') {
				size = "Free size";
				this.setSize(size);
				break;
				}
				else if (answerSize == 'n' ||answerSize ==  'N') {
					System.out.println("Size: ");
					size = input.next();
					this.setSize(size);
					break;
				}
				else {}
			}
		
		char answerGender = 'f';
		while(answerGender !='y' && answerGender !='Y' && answerGender !='n' && answerGender !='Y') {
			System.out.print("Is this Unisex apparel? (Y/N): ");
			
			answerGender = input.next().charAt(0);
			if (answerGender == 'y' || answerGender ==  'Y') {
				gender = "Unisex";
				this.setGender(gender);
				break;
				}
				else if (answerGender == 'n' ||answerGender ==  'N') {
					System.out.println("Gender: ");
					gender = input.next();
					this.setGender(gender);
					break;
				}
				else {}
			
			}	 
		System.out.println("\n --- Check New Apparel Information --- ");
		System.out.println("name: "+ name);
		System.out.println("Gender: " + gender);
		System.out.println("Size: "+ size);
		System.out.println("ProductNumber: " + productNum);
		System.out.println("Location: " +location);
		System.out.println("Stock: "+ stock);
		System.out.println("Color: "+color);
		System.out.println("\n Information is successfully registered \n");

		}
	}


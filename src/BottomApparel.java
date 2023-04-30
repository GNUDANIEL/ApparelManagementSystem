import java.util.Scanner;

public class BottomApparel extends Apparel {
	// Apparel 상속받은 하의 Apparel
	//하의를 고를 떄 고려해야하는 부분 선정 예정.
	public void getUserInput(Scanner input) {
	 	System.out.print("Name: ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'f';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='Y') {
			System.out.println("Is this Unisex apparel? (Y/N)");
			
			answer = input.next().charAt(0);
			if (answer == 'y' || answer ==  'Y') {
				gender = "Unisex";
				this.setGender(gender);
				break;
				}
				else if (answer == 'n' ||answer ==  'N') {
					System.out.println("Gender: ");
					gender = input.next();
					this.setGender(gender);
					break;
				}
				else {
					
				}
			}	 
			System.out.println("Type: ");
			String type = input.next();
			this.setType(type);
			
			System.out.println("Size: ");
			String size = input.next();
			this.setSize(size);
			
			System.out.println("ProductNumber: ");
			int productNum = input.nextInt();
			this.setProductNumber(productNum);
			
			System.out.println("Location: ");
			String location = input.next();
			this.setLocation(location);
			
			System.out.println("Stock: ");
			int stock = input.nextInt();
			this.setStock(stock);

		}
	}


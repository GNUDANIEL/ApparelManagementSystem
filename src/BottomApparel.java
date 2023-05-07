import java.util.Scanner;

public class BottomApparel extends Apparel {
	// Apparel 상속받은 하의 Bottom
	//하의를 고를 떄 고려해야하는 부분 선정 예정.
	public BottomApparel(ApparelKind kind) {
		super(kind); //this.kind와 동일?
	}
	public void getUserInput(Scanner input) {
		System.out.print("Name: ");
		String name = input.next();
		this.setName(name);
					
		System.out.print("Size: ");
		String size = input.next();
		this.setSize(size);
		
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
		
		System.out.print("Price: ");
		int price = input.nextInt();
		this.setPrice(price);

		char answer = 'f';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='Y') {
			System.out.print("Is this Unisex apparel? (Y/N): ");
			
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
				else {}
			}	 
		System.out.println("\n --- Check New Apparel Information ---");
		System.out.println("name: "+ name);
		System.out.println("Gender: " + gender);
		System.out.println("Size: "+ size);
		System.out.println("ProductNumber: " + productNum);
		System.out.println("Location: " +location);
		System.out.println("Stock: "+ stock);
		System.out.println("Color: "+color);
		System.out.println("Price: " + price);
		
		System.out.println("\n Information is successfully registered \n");
		}
	}


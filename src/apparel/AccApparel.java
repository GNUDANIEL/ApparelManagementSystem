package apparel;
import java.util.Scanner;


public class AccApparel extends Apparel implements ApparelInput{
	// Apparel 상속받은 악세사리 Apparel
	//항상 unisex 상품이라고 가정
	//금속 비금속 고려하여 비금속일 경우 목도리 스카프 추가
	static final String GENDER = "Unisex";
	
	public AccApparel(ApparelKind kind) {
		super(kind);//this.kind와 동일?
	}
	
	public void getUserInput(Scanner input) { //오버라이딩된 것이므로 이것이 실행되어야함
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
		this.setStock(stock);;
		
		System.out.print("Price: ");
		int price = input.nextInt();
		this.setPrice(price);
		
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
		System.out.println("\n --- Check New Apparel Information --- ");
		System.out.println("name: "+ name);
		System.out.println("Size: "+ size);
		System.out.println("ProductNumber: " + productNum);
		System.out.println("Location: " +location);
		System.out.println("Stock: "+ stock);
		//System.out.println("Color: "+ color);
		System.out.println("Price: "+ price);
		System.out.println("\n Information is successfully registered \n");

		}
	
	//오버라이딩된 메소드이므로 Acc printInfo시 이 메소드가 실행되어야 함 
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
		 System.out.println("kind: "+ skind);
		 System.out.println("name: " + this.name);
		 System.out.println("size: " + this.size);
		 System.out.println("gender: " + GENDER);
		 System.out.println("location: "+ this.location);
		 System.out.println("productNumber: " + this.productNumber );
		 System.out.println("Stock: " + this.stock);
		 System.out.println("Price: "+ this.price);
	 }
}
package apparel;
import java.util.Scanner;


public class AccApparel extends Apparel{
	// Apparel 상속받은 악세사리 Apparel
	//항상 unisex 상품이라고 가정
	//금속 비금속 고려하여 비금속일 경우 목도리 스카프 추가
	static final String GENDER = "Unisex";
	
	public AccApparel(ApparelKind kind) {
		super(kind);//this.kind와 동일?
	}
	
	public void setApparelGender() {
		this.setGender(GENDER);
	}

	public void setApparelSize(ApparelInput apparel, Scanner input) {
		char answerSize = 'f';
		while(answerSize !='y' && answerSize !='Y' && answerSize !='n' && answerSize !='Y') {
			System.out.print("Is this Free size accessory? (Y/N): ");
			
			answerSize = input.next().charAt(0);
				try {
				if (answerSize == 'y' || answerSize ==  'Y') {
					size = "Free size";
					this.setSize(size);
					break;
					}
					else if (answerSize == 'n' ||answerSize ==  'N') {
						setScanSize(input);
						break;
					}
					else {}
					}
				catch(SizeFormatException e) {
					System.out.println("Incorrect Size. Put right size within 2 character");
				}
		}
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

	public void getUserInput(Scanner input) { //오버라이딩된 것이므로 이것이 실행되어야함

		setApparelName(input);
		setApparelGender();
		setScanSize(input);
		setApparelNumber(input);
		setApparelStock(input);
		setApparelLocation(input);
		setApparelPrice(input);
		setApparelSize(this, input);
		
		System.out.println("\n --- Check New Apparel Information --- ");
		System.out.println("name: "+ name);
		System.out.println("Size: "+ size);
		System.out.println("ProductNumber: " + productNumber);
		System.out.println("Location: " +location);
		System.out.println("Stock: "+ stock);
		System.out.println("Price: "+ price);
		System.out.println("\n Information is successfully registered \n");

		}
	
	//오버라이딩된 메소드이므로 Acc printInfo시 이 메소드가 실행되어야 함 
	public void printInfo() {	 
		 String skind = getKindString();
		System.out.println("kind: "+ skind);
		System.out.println("name: " + this.name);
		System.out.println("size: " + this.size);
		System.out.println("gender: " + GENDER);
		System.out.println("location: "+ this.location);
		System.out.println("productNumber: " + this.productNumber );
		System.out.println("Stock: " + this.stock);
		System.out.println("Price: "+ this.price);
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
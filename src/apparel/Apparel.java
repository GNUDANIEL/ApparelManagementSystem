package apparel;
import java.util.Scanner;

public abstract class Apparel { //ㄴstudent라는 객체 생성 x 
	public ApparelKind getKind() {
		return kind;
	}
	
	protected ApparelKind kind = ApparelKind.Top;
	protected String name;//ex)windbreaker
	protected String gender; // M FM UniSex
	protected int productNumber ;
	protected String location;
	protected String size; //S,M,L
	protected int stock;
	protected String color;
	protected int price;
	protected String season;
	
	public Apparel() {}; 

	public Apparel(String name, String gender, String size,String color) {//기본정보이므로 최초로 의류를 등록할 때 사용
		 this.name = name;
		 this.gender= gender;
		 this.size = size;
		 this.color = color;
	}

	public Apparel(ApparelKind kind, String name, String gender, String size, int productNumber 
			 		,String location, int stock,String color,int price, String season) {//location 과 productNumber, Stock 할당 이후 정보
		 this.kind = kind;
		 this.name = name;
		 this.gender= gender;
		 this.productNumber =productNumber; 
		 this.location =location;
		 this.size = size;
		 this.stock = stock;
		 this.color = color;
		 this.price = price;
		 this.season = season;
	 }

	public Apparel(ApparelKind kind) {
		this.kind = kind;
	}
	//Getter Setter 항상 생성자 아래위치
	public void setKind(ApparelKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	
	public abstract void printInfo() ;
	 
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
			
			System.out.print("Price: ");
			int price = input.nextInt();
			this.setPrice(price);
			
			System.out.print("Season: ");
			String season= input.next();
			this.setSeason(season);
			
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
						System.out.print("Size: ");
						size = input.next();
						this.setSize(size);
						break;
					}
					else {}
				}
			
			char answer = 'f';
			while(answer !='y' && answer !='Y' && answer !='n' && answer !='Y') {
				System.out.print("Is this Unisex apparel? (Y/N) : ");
				
				answer = input.next().charAt(0);
				if (answer == 'y' || answer ==  'Y') {
					gender = "Unisex";
					this.setGender(gender);
					break;
					}
					else if (answer == 'n' ||answer ==  'N') {
						System.out.print("Gender: ");
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
			System.out.println("Location: " + location);
			System.out.println("Stock: " + stock);
			System.out.println("Color: " + color);
			System.out.println("Price: " + price);
			System.out.println("Season: " + season);
			System.out.println("\n Information is successfully registered \n");
	 }
}

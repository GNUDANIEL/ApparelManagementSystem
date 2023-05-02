import java.util.Scanner;

public class Apparel {
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

	public Apparel() {}; 
	public Apparel(String name, String gender, String size,String color) {//기본정보이므로 최초로 의류를 등록할 때 사용
		 this.name = name;
		 this.gender= gender;
		 this.size = size;
		 this.color = color;
	 }
	public Apparel(String name, String gender, String size, int productNumber 
			 		,String location, int stock,String color) {//location 과 productNumber, Stock 할당 이후 정보
		 this.name = name;
		 this.gender= gender;
		 this.productNumber =productNumber; 
		 this.location =location;
		 this.size = size;
		 this.stock = stock;
		 this.color = color;
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
	 
	 public void printInfo() {
//		 int i = input.nextInt();
//		 ApparelManager apparelInfo = new ApparelManager();
//		 Apparel info = apparelInfo.getNumFromList(i);
//		 System.out.println(info);
		 
		 System.out.println("name: " + this.name);
		 System.out.println("size: " + this.size);
		 System.out.println("gender: " + this.gender);
		 System.out.println("location: "+ this.location);
		 System.out.println("productNumber: " + this.productNumber );
		 System.out.println("Stock: " + this.stock);
		 System.out.println("Color: " + this.color);
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
			
			System.out.println("\n Check New Apparel Information: ");
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

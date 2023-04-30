import java.util.Scanner;

public class Apparel {
	public ApparelKind getKind() {
		return kind;
	}
	
	protected ApparelKind kind = ApparelKind.Top;
	protected String name;//ex)windbreaker
	protected String gender; // M FM UniSex
	protected String type; //삭제 예정 의미없는 멤버변수
	protected int productNumber ;
	protected String location;
	protected String size; //S,M,L
	protected int stock;
	 
	 public Apparel() {};
	 
	 public Apparel(String name, String gender, String type, String size) {//기본정보이므로 최초로 의류를 등록할 때 사용
		 this.name = name;
		 this.gender= gender;
		 this.type=type;
		 this.size = size;
	 }
	 public Apparel(String name, String gender, String type, String size, int productNumber 
			 		,String location, int stock) {//location 과 productNumber, Stock 할당 이후 정보
		 this.name = name;
		 this.gender= gender;
		 this.type=type;
		 this.productNumber =productNumber; 
		 this.location =location;
		 this.size = size;
		 this.stock = stock;
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

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
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
	 
	 public void printInfo() {
		 System.out.println("type: " + this.type );
		 System.out.println("name: " + this.name);
		 System.out.println("size: " + this.size);
		 System.out.println("gender: " + this.gender);
		 System.out.println("location: "+ this.location);
		 System.out.println("productNumber: " + this.productNumber );
		 System.out.println("Stock: " + this.stock);
	 }
	 
	 public void getUserInput(Scanner input) {
		 	System.out.print("Name: ");
			String name = input.next();
			this.setName(name);
			
			System.out.println("Gender: ");
			String gender = input.next();
			this.setGender(gender);
			 
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

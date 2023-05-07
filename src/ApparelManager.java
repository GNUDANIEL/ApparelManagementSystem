import java.util.ArrayList;
import java.util.Scanner;

public class ApparelManager {
	ArrayList <Apparel> apparels = new ArrayList<Apparel>();
	Scanner input ;
	
	public Apparel getNumFromList(int index) {
		return apparels.get(index);
	}
	
	ApparelManager(){}
	
	ApparelManager(Scanner input){
		this.input =input;
	}
	
	public void addApparel() {
		int kind = 0;
		Apparel apparel ;
		while (kind != 1 && kind != 2) {
			System.out.println("Add Apparel"); //productNum 겹치는 경우 오류나는 경우
		
			System.out.println("1 for Top");
			System.out.println("2 for Outer");
			System.out.println("3 for Bottom");
			System.out.println("4 for Acc");
			System.out.print("Select number for Apparel kind: ");
			kind = input.nextInt();
			if(kind == 1) {
				apparel = new Apparel(ApparelKind.Top); //Top
				apparel.getUserInput(input);
				apparels.add(apparel);
				break;
			}
			else if(kind == 2) {
				apparel = new OuterApparel(ApparelKind.Outer);
				apparel.getUserInput(input);
				apparels.add(apparel);
				break;
			}
			else if(kind == 3) {
				apparel = new BottomApparel(ApparelKind.Bottom);
				apparel.getUserInput(input);
				apparels.add(apparel);
				break;
			}
			else if(kind == 4) {
				apparel = new AccApparel(ApparelKind.Acc);
				apparel.getUserInput(input);
				apparels.add(apparel);
				break;
			}
			else {
				System.out.print("Select number between 1-4: ");
			}
		}
	}
	
	public void editApparel() {
		System.out.println("Edit Apparel");
		System.out.print("Apparel Product code: ");
		int apparelProductNumber= input.nextInt();
		for(int i = 0; i < apparels.size();i++) {
			Apparel apparel = apparels.get(i);
			if(apparel.getProductNumber() == apparelProductNumber) {
				int num = -1;
				while(num != 7) {
				System.out.println("1. Edit Name"); 
				System.out.println("2. Edit Gender");
				System.out.println("3. Edit Size");
				System.out.println("4. Edit ProductNumber");
				System.out.println("5. Edit Location");
				System.out.println("6. Edit Stock");
				System.out.println("7. Exit");
				System.out.println("Select number between 1-7: ");
				num = input.nextInt();
				System.out.println(" ");
				 
				 if (num==1){
				System.out.print("Type new name: ");
				String name = input.next();
				 apparel.setName(name);
				 System.out.println("Modified name: "+apparel.getName());
				 }
				 else if(num==2) {
				System.out.print("Type new gender: ");
				String gender = input.next();
				 apparel.setGender(gender);
				 System.out.println("Modified gender: "+apparel.getGender());
				 }
				 else if(num==3){
				System.out.print("Type new size: ");
				String size = input.next();
				apparel.setSize(size);
				System.out.println("Modified size: "+apparel.getSize());
				 }
				 else if(num==4){
				System.out.print("Type new product number: ");
				int productNumber = input.nextInt();
				
					for(int j = 0; j < apparels.size();j++) {
						if(apparels.get(j).productNumber == productNumber) {
							System.out.println("\n***Product Number is already exist***\n");
							break;
						}else {
							apparel.setProductNumber(productNumber);
							System.out.println("Modified producr number: "+apparel.getProductNumber());
						}
					}
				 }
				
				 else if(num==5){
				System.out.print("Type new location: ");
				String location = input.next();
				apparel.setLocation(location);
				System.out.println("Modified location: "+apparel.getLocation());
				 }
				 else if(num==6){
				System.out.print("Type new stock: ");
				int stock = input.nextInt();
				apparel.setStock(stock);
				System.out.println("Modified stock: "+apparel.getStock());
				 }
				 else if(num==7) {
				
				 }
				 else{ 
					 break;
				 }
				 
		}}}}
	public void infoOfApparel() {
		//의복정보 불러 온 다음사이즈 및 개수 각각 원하는 거만 출력할 수 있도록 할 것
		if( apparels.size() == 0) {
			System.out.println("Nothing has been registered\n");
		}
		else {
			for(int i = 0; i < apparels.size();i++) {
				System.out.println("--- Number" + (i+1) + "---");
				apparels.get(i).printInfo();
				System.out.println(" ");
			} //apperels가 갖고 있는 멤버에 접근하여 출력하는 방법 추가할 것임
		
		}
	}
	public void deleteApparel(){ 
		System.out.print("Product Number: ");
		int productNum = input.nextInt();
		int index = -1 ;
		for(int i = 0; i < apparels.size();i++) {
			if(apparels.get(i).productNumber == productNum) {
				index = i;
				System.out.println(" ");
				break;
			}
		}
		
		if(index >= 0) {
			System.out.println("--- Deleted Information --- \n");
			apparels.get(index).printInfo();
			apparels.remove(index);
			System.out.println("The Apparel Product Number " + productNum + " deleted \n");
		}else {
			System.out.println("The Apparel has not been registered");
			System.out.println(" ");
			}
	}
}

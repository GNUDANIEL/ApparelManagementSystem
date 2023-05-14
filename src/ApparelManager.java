import java.util.ArrayList;

import java.util.Scanner;

import apparel.AccApparel;
import apparel.Apparel;
import apparel.TopApparel;
import apparel.ApparelInput;
import apparel.ApparelKind;
import apparel.BottomApparel;
import apparel.OuterApparel;

public class ApparelManager {
	ArrayList <ApparelInput> apparels = new ArrayList<ApparelInput>();
	Scanner input ;
	
	public ApparelInput getNumFromList(int index) {
		return apparels.get(index);
	}

	ApparelManager(Scanner input){
		this.input =input;
	}
	
	public void addApparel() {
		int kind = 0;
		ApparelInput apparelInput ;
		while (kind != 1 && kind != 2) {
			System.out.println("Add Apparel"); //productNum 겹치는 경우 오류나는 경우
		
			System.out.println("1 for Top");
			System.out.println("2 for Outer");
			System.out.println("3 for Bottom");
			System.out.println("4 for Acc");
			System.out.print("Select number for Apparel kind: ");
			kind = input.nextInt();
			if(kind == 1) {
				apparelInput = new TopApparel(ApparelKind.Top); //Top
				apparelInput.getUserInput(input);
				apparels.add(apparelInput);
				break;
			}
			else if(kind == 2) {
				apparelInput = new OuterApparel(ApparelKind.Outer);
				apparelInput.getUserInput(input);
				apparels.add(apparelInput);
				break;
			}
			else if(kind == 3) {
				apparelInput = new BottomApparel(ApparelKind.Bottom);
				apparelInput.getUserInput(input);
				apparels.add(apparelInput);
				break;
			}
			else if(kind == 4) {
				apparelInput = new AccApparel(ApparelKind.Acc);
				apparelInput.getUserInput(input);
				apparels.add(apparelInput);
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
			ApparelInput apparelInput = apparels.get(i);
			if(apparelInput.getProductNumber() == apparelProductNumber) {
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
				apparelInput.setName(name);
				 System.out.println("Modified name: "+apparelInput.getName());
				 }
				 else if(num==2) {
				System.out.print("Type new gender: ");
				String gender = input.next();
				apparelInput.setGender(gender);
				 System.out.println("Modified gender: "+apparelInput.getGender());
				 }
				 else if(num==3){
				System.out.print("Type new size: ");
				String size = input.next();
				apparelInput.setSize(size);
				System.out.println("Modified size: "+apparelInput.getSize());
				 }
				 else if(num==4){
				System.out.print("Type new product number: ");
				int productNumber = input.nextInt();
				
					for(int j = 0; j < apparels.size();j++) {
						if(apparels.get(j).getProductNumber() == productNumber) {
							System.out.println("\n***Product Number is already exist***\n");
							break;
						}else {
							apparelInput.setProductNumber(productNumber);
							System.out.println("Modified producr number: "+apparelInput.getProductNumber());
						}
					}
				 }
				
				 else if(num==5){
				System.out.print("Type new location: ");
				String location = input.next();
				apparelInput.setLocation(location);
				System.out.println("Modified location: "+apparelInput.getLocation());
				 }
				 else if(num==6){
				System.out.print("Type new stock: ");
				int stock = input.nextInt();
				apparelInput.setStock(stock);
				System.out.println("Modified stock: "+apparelInput.getStock());
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
			if(apparels.get(i).getProductNumber() == productNum) {
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

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import apparel.AccApparel;
import apparel.Apparel;
import apparel.TopApparel;
import apparel.ApparelInput;
import apparel.ApparelKind;
import apparel.BottomApparel;
import apparel.OuterApparel;
import apparel.SizeFormatException;

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
		while (kind < 1 || kind > 3) {
			try {
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
			catch (InputMismatchException e) {
				System.out.println("Put an integer between 1-3");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void editApparel() {
		System.out.println("Edit Apparel");
		System.out.print("Apparel Product code: ");
		int apparelProductNumber= input.nextInt();
		for(int i = 0; i < apparels.size();i++) {
			ApparelInput apparel = apparels.get(i);
			if(apparel.getProductNumber() == apparelProductNumber) {
				int num = -1;
				while(num != 7) {
				showEditMenu();
				num = input.nextInt();
				System.out.println(" ");
				 
				 switch(num){
				 
				 case 1:
					 apparel.setApparelName(input);
				 	break;
				 case 2:
					 setApparelGender(apparel, input);
					 break;
				 case 3:
					 apparel.setScanSize(input);
					 break;
				 case 4:
					 apparel.setApparelNumber(input);
					 break;
				 case 5:
					 apparel.setApparelLocation(input);
					 break;
				 case 6:
					 apparel.setApparelStock(input);
					 break;
				 case 7:
					 
				default:
					continue;
				 	} 
				}
			}
		}
	}
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
		int index = findIndex(productNum);
		removeFromIndex(index, productNum);
	}
	
	public int findIndex(int productNum) {
		int index = -1 ;
		for(int i = 0; i < apparels.size();i++) {
			if(apparels.get(i).getProductNumber() == productNum) {
				index = i;
				//System.out.println(" ");
				break;
			}
		}
		return index;
	}
	
	public int removeFromIndex(int index, int productNum) {
		if(index >= 0) {
			System.out.println("--- Deleted Information --- \n");
			apparels.get(index).printInfo();
			apparels.remove(index);
			System.out.println("The Apparel Product Number " + productNum + " deleted \n");
			return 1;
		}else {
			System.out.println("The Apparel has not been registered");
			System.out.println(" ");
			return -1;
			}
	}

	public void setApparelGender(ApparelInput apparel, Scanner input) {
		System.out.print("Type new gender: ");
		String gender = input.next();
		apparel.setGender(gender);
		 System.out.println("Modified gender: "+apparel.getGender());
	}
	public void setApparelSize(ApparelInput apparel, Scanner input) {
		System.out.print("Type new size: ");
		String size = input.next();
		try {
			apparel.setSize(size);
		} catch (SizeFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect Size. Put right size within 2 character");
		}
		System.out.println("Modified size: "+apparel.getSize());
	}
	public void setApparelNumber(ApparelInput apparel, Scanner input) {
		System.out.print("Type new product number: ");
		int productNumber = input.nextInt();
		
			for(int j = 0; j < apparels.size();j++) {
				if(apparels.get(j).getProductNumber() == productNumber) {
					System.out.println("\n***Product Number is already exist***\n");
					break;
				}else {
					apparel.setProductNumber(productNumber);
					System.out.println("Modified producr number: "+apparel.getProductNumber());
				}
			}
	}
	
	public void showEditMenu() {
		System.out.println("1. Edit Name"); 
		System.out.println("2. Edit Gender");
		System.out.println("3. Edit Size");
		System.out.println("4. Edit ProductNumber");
		System.out.println("5. Edit Location");
		System.out.println("6. Edit Stock");
		System.out.println("7. Exit");
		System.out.println("Select number between 1-7: ");
	}
}

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
				apparel = new Apparel(); //Top
				apparel.getUserInput(input);
				apparels.add(apparel);
				break;
			}
			else if(kind == 2) {
				apparel = new OuterApparel();
				apparel.getUserInput(input);
				apparels.add(apparel);
				break;
			}
			else if(kind == 3) {
				apparel = new BottomApparel();
				apparel.getUserInput(input);
				apparels.add(apparel);
				break;
			}
			else if(kind == 4) {
				apparel = new AccApparel();
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
		System.out.println("Apparel Name: ");
		String apparelName = input.next();
		for(int i = 0; i < apparels.size();i++) {
			Apparel apparel = apparels.get(i);
			if(apparel.getName() == apparelName) { //왜 menumanager로 넘어가는가
				int num = -1;
				while(num != 7) {
				//옷 정보에 저장할 정보: 사이즈 종류 코드 
				num = input.nextInt();
				System.out.println("1. Edit Name"); 
				System.out.println("2. Edit Gender");//입력한 옷 정보를 담을 스킬이 없어 생략 아마 상속 혹은 메소듣 이용할 것이라고 예상
				System.out.println("3. Edit Type");
				System.out.println("4. Edit Size");
				System.out.println("5. Edit ProductNumber");
				System.out.println("6. Edit Location");
				System.out.println("7. Edit Stock");
				System.out.print("Select a number between 1-7: ");
				System.out.println(" ");
				 
				 if (num==1){
				String name = input.next();
				 apparel.setName(name);
				 }
				 else if(num==2) {
				String gender = input.next();
				 apparel.setGender(gender);
				 }
				 else if(num==3){
				String size = input.next();
				apparel.setSize(size);
				 }
				 else if(num==4){
				int productNumber = input.nextInt();
				apparel.setProductNumber(productNumber);
				 }
				 else if(num==5){
				String location = input.next();
				apparel.setLocation(location);
				 }
				 else if(num==6){
				int stock = input.nextInt();
				apparel.setStock(stock);
				 }
				 else{ 
					 continue;
				 }
		}}}}
	public void infoOfApparel() {
		//의복정보 불러 온 다음사이즈 및 개수 각각 원하는 거만 출력할 수 있도록 할 것
		for(int i = 0; i < apparels.size();i++) {
			apparels.get(i).printInfo();
		} //apperels가 갖고 있는 멤버에 접근하여 출력하는 방법 추가할 것임
		
	}
	public void deleteApparel(){
		System.out.println("Product Number: ");
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
			apparels.remove(index);
			System.out.println("The Apparel " + productNum + " deleted");
		}else {
			System.out.println("The Apparel has not been registered");
		}
		input.close();	}
}

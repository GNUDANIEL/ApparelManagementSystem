import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {		
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		ApparelManager apparelManager = new ApparelManager(input);
		
		
		selectMenu(input, apparelManager);
		showMenu();
	}
		
	
	public static void showMenu() {
		System.out.println("##### Apparel Manager System Menu #####");
		System.out.println("1. Show a Apparel Information"); //몇개의 사이즈가 몇개의 재고를 갖고 있는지 포함
		System.out.println("2. Add Apparel");//입력한 옷 정보를 담을 스킬이 없어 생략 아마 상속 혹은 메소듣 이용할 것이라고 예상
		System.out.println("3. Edit Apparel");//저장된 정보를 불러내어 수정하는 기술 필요
		System.out.println("4. Delete Apparel");
		System.out.println("5. Exit");
		System.out.print("Select a number between 1-5: ");
	}
	public static void selectMenu(Scanner input, ApparelManager apparelManager) {
		int num = -1;
		while(num != 5) {
			try {
		
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1: 
				apparelManager.infoOfApparel();
				break;
			case 2:
				apparelManager.addApparel();
				break;
			case 3:
				apparelManager.editApparel();
				break;
			case 4:
				apparelManager.deleteApparel();
				break;
			case 5:
				System.out.println("Program is finished");
				break;
			default:
				continue;
				}
			System.out.println(" ");		
			}
		catch (InputMismatchException e) {
			System.out.println("\nPut an integer between 1-5\n");
			if (input.hasNext()) {
				input.next();
			}
			num = -1;
		}
		}
	}
}


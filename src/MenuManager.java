import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {		
	static EventLogger logger = new EventLogger("log.txt");	
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		ApparelManager apparelManager = getObject("apparelManager.ser");
		if(apparelManager == null) {
			apparelManager = new ApparelManager(input);
		}//apparelManager가 NULL일 경우 객체가 없는 경우 제거-> 직렬화??
		//new ApparelManager(input); 보류
		selectMenu(input, apparelManager);
		// showMenu();
		putObject(apparelManager, "apparelManager.ser");
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
				logger.log("Show an info of apparel");
				break;
			case 2:
				apparelManager.addApparel();
				logger.log("Add an apparel");
				break;
			case 3:
				apparelManager.editApparel();
				logger.log("edit a list of apparel");
				break;
			case 4:
				apparelManager.deleteApparel();
				logger.log("delete an apparel");
				break;
			case 5:
				System.out.println("Program is finished");
				logger.log("System is finished "); //왜 Program is finished 출력되지 않고 끝나는지? 
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
	
	public static ApparelManager getObject(String fileName) {
		ApparelManager apparelManager = null;
		FileInputStream file;
		try {
			file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);		
			apparelManager = (ApparelManager)in.readObject();
			in.close();
			file.close();		
		} catch (FileNotFoundException e) {
			return apparelManager; //
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return apparelManager;
	}
	
	public static void putObject(ApparelManager apparelManager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(apparelManager);
			out.close();
			file.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


import java.util.Scanner;

public class MenuManager {
	public static void addApparel() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Add Apparel");
		System.out.println("Apparel Code Form: Gender, Type, Number");
		System.out.print("Apparel Code: ");
		String gender = sc1.next();
		String type = sc1.next();
		int Code = sc1.nextInt();
		System.out.println("Apparel Code: "+ gender + " "+ type + " "+ Code);
		sc1.close();
	}
	
	public static void editApparel() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Edit Apparel");
		System.out.println("Apparel Code Form: Gender, Type, Number");
		System.out.print("Apparel Code: ");
		
		String gender = sc1.next();
		String type = sc1.next();
		int Code = sc1.nextInt();
		System.out.println("Apparel Code: "+ gender + " "+ type + " "+ Code);
		sc1.close();
	}
	public static void sizeOfApparel() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Size of Apparel");
		System.out.println("Apparel Code Form: Gender, Type, Number");
		System.out.print("Apparel Code: ");
		
		String gender = sc1.next();
		String type = sc1.next();
		int Code = sc1.nextInt();
		System.out.println("Apparel Code: "+ gender + " "+ type + " "+ Code);
		sc1.close();
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		while(num != 6) {
			System.out.println("1. Location of Apparel"); // Male section, Female Seceion > outer , Top, Bottom, Acc >
			System.out.println("2. Add Apparel");//입력한 옷 정보를 담을 스킬이 없어 생략 아마 상속 혹은 메소듣 이용할 것이라고 예상
			System.out.println("3. Edit Apparel Code");//저장된 정보를 불러내어 수정하는 기술 필요
			System.out.println("4. Size of Apparel");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Select a number between 1-6: ");
			num = sc.nextInt();
			System.out.println(" ");
			 
			 switch (num) {
			case 1:	
				System.out.println("1. Male section");
				System.out.println("2. Female Seceion");
				System.out.print("Select a number between 1-2: ");
				int sectionNumber1 = sc.nextInt();
				System.out.println(" ");
				
				if (num == 1) {
					System.out.println("1. outer");
					System.out.println("2. Top");
					System.out.println("3. Bottom");
					System.out.println("4. Acc");
					System.out.print("Select a number between 1-4: ");
					int typeOfMaleApparel = sc.nextInt();
					System.out.println(" ");
					if (typeOfMaleApparel==1) {
						System.out.println("Male Area 1");
					}else if (typeOfMaleApparel==2) {
						System.out.println("Male Area 2");
					}else if (typeOfMaleApparel==3) {
						System.out.println("Male Area 3");
					}else if (typeOfMaleApparel==4) {
						System.out.println("Male Area 4");
					}
					
				}else if (num==2){
					System.out.println("1. outer");
					System.out.println("2. Top");
					System.out.println("3. Bottom");
					System.out.println("4. Acc");
					System.out.print("Select a number between 1-4: ");
					int typeOfFemaleApparel = sc.nextInt();
					System.out.println(" ");
					if (typeOfFemaleApparel==1) {
						System.out.println("Female Area 1");
					}else if (typeOfFemaleApparel==2) {
						System.out.println("Female Area 2");
					}else if (typeOfFemaleApparel==3) {
						System.out.println("Female Area 3");
					}else if (typeOfFemaleApparel==4) {
						System.out.println("Female Area 4");
					}
				}
				break;
			case 2:
				addApparel();
				break;
			case 3:
				editApparel();
				break;
			case 4:
				sizeOfApparel();
				break;
				
			}
			 sc.close();
		}
	}
}

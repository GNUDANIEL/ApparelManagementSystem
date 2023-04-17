import java.util.Scanner;

public class MenuManager {		
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		ApparelManager apparelManager = new ApparelManager(input);
		
		int num=0;
		
		while(num != 5) {
			//옷 정보에 저장할 정보: 사이즈 종류 코드 
			System.out.println("1. Show a Apparel Information"); 
			System.out.println("2. Add Apparel");//입력한 옷 정보를 담을 스킬이 없어 생략 아마 상속 혹은 메소듣 이용할 것이라고 예상
			System.out.println("3. Edit Apparel Code");//저장된 정보를 불러내어 수정하는 기술 필요
			System.out.println("4. Delete Apparel Code");
			System.out.println("5. Exit");
			System.out.print("Select a number between 1-5: ");
			num = input.nextInt();
			System.out.println(" ");
			 
			 if (num==1){
			apparelManager.infoOfApparel();
			 }
			 else if(num==2) {
			apparelManager.addApparel();
			 }
			 else if(num==3){
				apparelManager.editApparel();
			 }
			 else if(num==4){
				apparelManager.deleteApparel();
			}
			 else if(num==5){
					System.out.println("Program is finished");
				}
			 else{ 
				 continue;
			 }
		
			}
		input.close();
		}
	}

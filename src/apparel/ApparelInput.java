package apparel;

import java.util.Scanner;

public interface ApparelInput {	
	
	public void getUserInput(Scanner input);
	
	public int getProductNumber();
	
	public String getName();
	
	public void setName(String name);

	public String getGender() ;

	public void setGender(String gender);

	public void setProductNumber(int productNumber);
	
	public String getLocation() ;
	
	public void setLocation(String location);
	
	public String getSize();

	public void setSize(String size);

	public int getStock() ;
	
	public void setStock(int stock) ;

	public void printInfo();
}

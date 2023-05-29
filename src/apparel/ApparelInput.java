package apparel;

import java.util.Scanner;

public interface ApparelInput {	
	public void getUserInput(Scanner input);
	public int getProductNumber();
	public String getGender() ;
	public void setGender(String gender);
	public void setProductNumber(int productNumber);
	public String getLocation() ;
	public void setLocation(String location);
	public String getSize();
	public void setSize(String size) throws SizeFormatException;
	public int getStock() ;
	public void setStock(int stock) ;
	public void setColor(String color) ;
	public void setSeason(String season) ;
	public abstract void printInfo();
	public void setApparelLocation( Scanner input);
	public void setApparelName(Scanner input);
	public void setApparelStock(Scanner input);
	public void setApparelNumber(Scanner input);
	public void setScanSize(Scanner input);
}


	
import java.io.IOException;
import java.util.Scanner;

public class Osztas {

	public static void main(String[] args) throws IOException {
	
		Scanner  scan = new Scanner(System.in);
		
		System.out.println("Gepeljen be egy szamot h tudja meg mennyi elosztva 100-al");
				
		while(scan.hasNext()) {
			
			System.out.println("Gepeljen be egy szamot h tudja meg mennyi elosztva 100-al");
		try {
			
			String szam0 = scan.next();
			float szam = Float.parseFloat(szam0);
			
			System.out.println(100/szam);
		}catch(java.lang.NumberFormatException e) {
			System.out.println("A szam beolvasasa nem sikerult "+ e);
			
			}	

			}

	}

}

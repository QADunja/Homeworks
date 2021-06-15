package package1;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Domaci 23 April 2021.
		
//Napisati program za prijavu polaganja vozacke dozvole gde korisnik unese kroz skener
		//broj godina i program mu vrati jednu od 4 poruke zavisno od unosa.
//Ako je korisnik maloletan ispisuje "Samo osobe starije od 18 godina mogu imati vozacku dozvolu",
//ako je korisnik stariji od 65 godina ispisuje "Korisnici stariji od 65 godina ne mogu polagati za vozacku dozvolu" 
//i ako korisnik unese neki izmedju broj ispisati "Vasa prijava je prihvacena".
//za negativan unos "Uneli ste pogresan broj, molimo Vas pokusajte ponovo".
		
		Scanner s = new Scanner (System.in);
		
	/*	System.out.println("Unesite svoje ime: ");
		String ime = s.next();
	
		System.out.println("Unesite svoje prezime: ");
		String prezime = s.next(); */
		
		System.out.println("Koliko imate godina: ");
		int godine = s.nextInt();
		int a = -11;
		
		if ((a <= 0 && a == 0) || (a < 0 && a >-10)) {
			System.out.println("Uneli ste pogresan broj, molimo Vas pokusajte ponovo");
		} else if (a <= 17)  {
			System.out.println("Samo osobe starije od 18 godina mogu imati vozacku dozvolu");
		} else if (a >= 66) {
			System.out.println("Korisnici stariji od 65 godina ne mogu polagati za vozacku dozvolu");
		} else if ((a >= 18) || (a <= 65)) {
			System.out.println("Vasa prijava je prihvacena");
		} else {
			System.out.println("Uneli ste pogresan broj, molimo Vas pokusajte ponovo");
		}
		

	}

}

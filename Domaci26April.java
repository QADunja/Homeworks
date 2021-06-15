package package1;

import java.util.Scanner;

public class Domaci26April {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 1.	 Napisati program koji od korisnika trazi unos broja dana u jednom mesecu
// i da za rezultat ispise koliko meseci u godini ima toliko dana.
// Primer. korisnik unese 31 a program vrati rezultat "7 meseci u godini ima 31 dan"

		/*	Scanner scanner = new Scanner (System.in);
		
		System.out.println("Unesite broj dana u jednom mesecu(1-31): ");
		int danMeseca = s.nextInt();
		
		if (danMeseca >= 1 && danMeseca <= 28) {
			System.out.println("12 meseci u godini ima " + danMeseca + " dana.");
		} else if (danMeseca == 31) {
			System.out.println("7 meseci u godini ima " + danMeseca + " dan.");
		} else {
			System.out.println("Nevalidan unos.");
		}*/
		
// 2.zadatak		
// Napisati program koji od korisnika trazi da unese dan u celoj godini 
	//a da za rezultat dobije kojoj nedelja pripada taj dan u godini.
//	Primer. korisnik unese 75 a program kao rezultat vrati 
	//"11. nedelja u godini"
//	Napomena: Racunajte da je prvi dan u godini ponedeljak.
///???
	/*	System.out.println("Unesite jedan broj dana u godini (<366): ");
		
		int danGodine = s.nextInt();
		int nedeljaGodine = s.nextInt();
		
		if (danGodine >= 1 && danGodine <= 365) {
			System.out.println(danGodine + " nedelja u godini.");
		} else {
			System.out.println("Nevalidan unos.");
		}
		
	}

}*/

// RESENJE ZADATKA

//1. zadatak
	// 1.	 Napisati program koji od korisnika trazi unos broja dana u jednom mesecu
	// i da za rezultat ispise koliko meseci u godini ima toliko dana.
	// Primer. korisnik unese 31 a program vrati rezultat "7 meseci u godini ima 31 dan"
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite broj dana u mesecu: ");
		int broj = scanner.nextInt();

		if (broj == 1) {
			System.out.println("Svi meseci imaju jedan dan.");
		} else if ((broj > 1) && (broj <= 28)) {
			System.out.println("Svi meseci imaju " + broj + " dana.");
		} else if (broj == 29) {
			System.out.println("Februar kad je prestupna godina i svi ostali meseci imaju 29 dana.");
		} else if ((broj > 29) && (broj <= 30)) {
			System.out.println("Svi meseci osim februara imaju " + broj + " dana.");
		} else if (broj == 31) {
			System.out.println("Januar, Mart, Maj, Jul, Avgust, Oktobar i Decembar imaju po " + broj + " dan.");
		} else {
			System.out.println("Uneli ste nulu, negativan broj ili veci od 31");

		}
	}

}



   //  2. zadatak
  
/*  Scanner s = new Scanner(System.in);
  System.out.println("Unesite dan u godini brojem: "); int a = s.nextInt();
  
  int b = (a / 7) + 1;
  
  if ((a > 0) && (a <= 366)) System.out.println(b + ". nedelja u godini.");
  else {
  System.out.println("Uneli ste negativan broj, nulu ili broj veci od 366"); 
       }
  }
	
}   */

 
  
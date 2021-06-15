package package2;

import java.util.Scanner;

public class Domaci28April {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	1.	Napisati niz brojeva i prikazati aritmeticku sredinu niza
		
	  /*  double[] nizBrojeva = { -0 , -20 , -555555 , -78 , -565 , -1111 };

		double aritmetickaSredina = 0;

		for (int i = 0; i < nizBrojeva.length; i++) {

			aritmetickaSredina += nizBrojeva[i];
		}

		System.out.println("Aritmeticka sredina elemenata niza je " + aritmetickaSredina); */
		
		
		
	//	2.	Napisati program gde korisnik unese datum rodjenja i
//program vrati koji je to horoskopski znak.
		
		int dan, mesec, godina;
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Unesite dan rodjenja : ");
        dan = sc.nextInt();

        System.out.println("Unesite mesec rodjenja: ");
        mesec = sc.nextInt();
        
        System.out.println("Unesite godinu rodjenja: ");
        godina = sc.nextInt();

        if ((dan>21 && mesec == 12) || (dan<=19 && mesec== 1)){
           System.out.println("Vas horoskopski znak je Jarac");
       }
       if ((dan>20 && mesec ==1) || (dan<=18 && mesec == 2)){
           System.out.println("Vas horoskopski znak je Vodolija");
       }
       if ((dan>19 && mesec == 2) || (dan <=20 && mesec == 3)){
           System.out.println("Vas horoskopski znak je Riba");
       }
       if ((dan>21 && mesec == 3) || (dan <=20 && mesec == 4)){
           System.out.println("Vas horoskopski znak je Ovan");
       }
       if ((dan>21 && mesec == 4) || (dan <=20 && mesec == 5)){
           System.out.println("Vas horoskopski znak je Bik");
       }
       if ((dan>21 && mesec == 5) || (dan<=20 && mesec == 6)){
           System.out.println("Vas horoskopski znak je Blizanac");
       }
       if ((dan>21 && mesec == 6) || (dan<=20 && mesec == 7)){
           System.out.println("Vas horoskopski znak je Rak");
       }
       if ((dan>21 && mesec  == 7) || (dan<=20 && mesec== 8)){
           System.out.println("Vas horoskopski znak je  Lav");
       }
       if ((dan>21 && mesec ==8) || (dan<=22 && mesec == 9)){
           System.out.println("Vas horoskopski znak je Devica");
       }
       if ((dan>23 && mesec == 9) || (dan<=20 && mesec ==10)){
           System.out.println("Vas horoskopski znak je Vaga");
       }
       if ((dan>21 && mesec == 10) || (dan<=22 && mesec == 11)){
           System.out.println("Vas horoskopski znak je Skorpija");
       }
       if ((dan>23 && mesec == 11) || (dan<=20 && mesec == 12)){
           System.out.println("Vas horoskopski znak je Strelac");
       }
		
       
	}

}


/*  RESENJE DOMACEG:
1. ZADATAK

package base;

import java.util.Scanner;

public class domaci {

    public static void main(String[] args) {

        double [] nizBrojeva = {3, 0, 1, -1, 2, 0};
        double aritmetickaSredina = 0;
        double zbir =0;
        System.out.println("Niz: ");
        for (int i = 0; i < nizBrojeva.length; i++) {
            System.out.println(nizBrojeva[i] + " ");
        }

        for (int i = 0; i < nizBrojeva.length; i++) {
            zbir += nizBrojeva[i];
        }
        System.out.println("Aritmeticka sredina niza: " + zbir / nizBrojeva.length);

    }
}

2. ZADATAK

package base;

import java.util.Scanner;

public class domaci {

    public static void main(String[] args) {
        // 1) Napisati program gde korisnik unese datum rodjenja i program vrati koji je
        // to horoskopski znak

        int dan;
        int mesec;
        String znak = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite mesec rodjenja: ");
        mesec = s.nextInt();
        while (mesec < 1 || mesec > 12) {
            System.out.println("Unesite validan mesec (1-12): ");
            mesec = s.nextInt();
        }
        System.out.println("Unesite dan rodjenja: ");
        dan = s.nextInt();
        while (mesec == 2 && (dan < 1 || dan > 29)) {
            System.out.println("Unesite validan dan (1-29):");
            dan = s.nextInt();

        }
        while ((mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10 || mesec == 12) && (dan < 1 || dan > 31)) {
            System.out.println("Unesite validan dan (1-31): ");
            dan = s.nextInt();
        }
        while ((mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11) && (dan < 1 || dan > 30)) {
            System.out.println("Unesite validan dan (1-30)");
            dan = s.nextInt();

        }

        if (mesec == 12) {

            if (dan < 22)
                znak = "Strelac";
            else
                znak = "Jarac";
        }

        else if (mesec == 1) {
            if (dan < 20)
                znak = "Jarac";
            else
                znak = "Vodolija";
        }

        else if (mesec == 2) {
            if (dan < 19)
                znak = "Vodolija";
            else
                znak = "Ribe";
        }

        else if (mesec == 3) {
            if (dan < 21)
                znak = "Ribe";
            else
                znak = "Ovan";
        } else if (mesec == 4) {
            if (dan < 20)
                znak = "Ovan";
            else
                znak = "Bik";
        }

        else if (mesec == 5) {
            if (dan < 21)
                znak = "Bik";
            else
                znak = "Blizanci";
        }

        else if (mesec == 6) {
            if (dan < 21)
                znak = "Blizanci";
            else
                znak = "Rak";
        }

        else if (mesec == 7) {
            if (dan < 23)
                znak = "Rak";
            else
                znak = "Lav";
        }

        else if (mesec == 8) {
            if (dan < 23)
                znak = "Lav";
            else
                znak = "Devica";
        }

        else if (mesec == 9) {
            if (dan < 23)
                znak = "Devica";
            else
                znak = "Vaga";
        }

        else if (mesec == 10) {
            if (dan < 23)
                znak = "Vaga";
            else
                znak = "Skorpion";
        }

        else if (mesec == 11) {
            if (dan < 22)
                znak = "Skorpion";
            else
                znak = "Strelac";
        }

        System.out.println("Vas horoskopski znak je: " + znak);
    }

}

*/
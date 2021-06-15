package package1;

import java.util.Scanner;

public class Domaci07Maj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.	Napisati program gde korisnik unese redni broj dana u godini (1-365) i program vrati
	//odgovor koji je to dan u nedelji. Podjimo od pretpostavke da je 1. januar ponedeljak.
		
	

		        Scanner sc = new Scanner (System.in);

		        System.out.print("Unesite redni broj dana u godini");

		        int dan = sc.nextInt();
		        int danUNedelji = 1;

		        for (int i = dan; i >= -6; i-=7) {
		            if (dan < 1 || dan > 365) {
		                System.out.println("Greska u unosu, unesite broj od 1 do 365");
		                break;
		            }
		            danUNedelji = i;
		        }


		        switch (danUNedelji) {
		            case -6: {
		                System.out.println("Dan " + dan + ". je ponedeljak.");
		            }
		            break;
		            case -5: {
		                System.out.println("Dan " + dan + ". je utorak.");
		            }
		            break;
		            case -4: {
		                System.out.println("Dan " + dan + ". je sreda.");
		            }
		            break;
		            case -3: {
		                System.out.println("Dan " + dan + ". je cetvrtak.");
		            }
		            break;
		            case -2: {
		                System.out.println("Dan " + dan + ". je petak.");
		            }
		            break;
		            case -1: {
		                System.out.println("Dan " + dan + ". je subota.");
		            }
		            break;
		            case 0: {
		                System.out.println("Dan " + dan + ". je nedelja.");
		            }
		            break;
		            default:
		                break;
		        }

		    }

		

}


/* 2. zadatak
package base;

import java.util.Scanner;

public class domaci
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi prvi broj: ");
        int num1 = sc.nextInt();

        System.out.print("Unesi drugi broj: ");
        int num2 = sc.nextInt();

        System.out.print("Unesi treci broj: ");
        int num3 = sc.nextInt();

        sc.close();

        if(sum(num1, num2, num3))
        {
            System.out.println("Zbir prva dva broja je treci broj");
        }
        else
        {
            System.out.println("Zbir prva dva broja nije treci broj");
        }

    }

    public static boolean sum(int num1, int num2, int num3)
    {
        boolean vrednost = true;

        if(num1 + num2 != num3)
        {
            vrednost = false;
        }
        return vrednost;
    }
}*/

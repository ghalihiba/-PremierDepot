package Hello;

import java.util.Scanner;

public class main {
	static double a;
	static double b;
	static String o;
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("donner un entier a:");
		a=s.nextDouble();
		System.out.println("donner un entier b:");
		b=s.nextDouble();
		System.out.println("donner l'opération à faire :add /div/mul/sub:");
		s.nextLine();
		o=s.nextLine();
		calculatrice c=new calculatrice();
		if (o.equals("add")) {System.out.println("le résultat est :"+c.addition(a,b));}
		else {
			if (o.equals("sub")) {System.out.println("le résultat est :"+c.soustraction(a,b));}
			else {
				if (o.equals("div")) {
				try {
					System.out.println("le résultat est :"+c.division(a,b));}
				catch (ArithmeticException e) {
					System.out.println("Erreur Division par zéro !");}
				}
				else {
					System.out.println("le résultat est :"+c.multi(a,b));}
			}
		}
	}
}
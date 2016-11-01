package uebung_4_1;

public class uebung_4_1 {

	public static void main(String[] args) {

		int zaehler1 = 2;
		int nenner1 = 3;

		bruchDarstellen(zaehler1, nenner1);

		int zaehler2 = 88;
		int nenner2  = 90;
		
		bruchDarstellen(zaehler2, nenner2);
		
		int zaehler3 = 6;
		int nenner3 = 3;
		
		bruchDarstellen(zaehler3, nenner3);
		
	}

	public static void bruchDarstellen(int a, int b) {

		double c = a;
		double d = b;
		
		double loesung = c / d;

		System.out.println(a);
		System.out.println("--- = " + loesung);
		System.out.println(b);

	}
}

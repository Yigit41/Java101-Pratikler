package patikadev;

import java.util.Scanner;

public class TaksimetreHesaplama {

	public static void main(String[] args) {

		double ucret,acilisUcret = 10, kmUcret=2.2;
		int km;
		
		System.out.println("****TAKSIMETRE HESAPLAMA****");
		Scanner giris = new Scanner(System.in);
		
		System.out.println("Gidilen Kilometreyi Giriniz : ");
		km = giris.nextInt();
	
		ucret = acilisUcret+km*kmUcret;
		
		ucret = (ucret>20) ? ucret : 20;
		System.out.println("Taksimetre Tutari : "+ucret);
		
		
	}

}

package patikadev;

import java.util.Scanner;

public class UcgenAlanHesabi {

	public static void main(String[] args) {
		
		double kenarA,kenarB,kenarC,u,cevre,alan ;
		
		Scanner giris = new Scanner(System.in);
		System.out.println("****UCGEN ALAN HESAPLAMA****");
		System.out.println("A kenarinin uzunlugunu giriniz : ");
		kenarA = giris.nextDouble();
		
		System.out.println("B kenarinin uzunlugunu giriniz : ");
		kenarB = giris.nextDouble();
		
		System.out.println("C kenarinin uzunlugunu giriniz : ");
		kenarC = giris.nextDouble();
		
		cevre = kenarA+kenarB+kenarC;
		u = cevre/2;
		alan= Math.sqrt(u*(u-kenarA)*(u-kenarB)*(u-kenarC));
		
		System.out.println("Ucgenin Alani : "+ alan);
		
	}

}

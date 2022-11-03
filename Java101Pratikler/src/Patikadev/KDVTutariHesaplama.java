package patikadev;

import java.util.Scanner;

public class KDVTutariHesaplama {

	public static void main(String[] args) {
		
		int fiyat;
		double kdv,kdvOrani;
		
		Scanner giris = new Scanner(System.in);
		
		System.out.println("****KDV Tutari Hesaplama****");
		System.out.println("Fiyat Bilgisi Giriniz : ");
		
		fiyat = giris.nextInt();
		
		kdvOrani = (fiyat>=1000) ? 0.08 : 0.18;
		
		kdv = fiyat*kdvOrani;
		
		System.out.println("KDV'siz Fiyat : "+ fiyat);
		System.out.println("KDV Orani : "+ kdvOrani);
		System.out.println("KDV'li Fiyat : "+(fiyat+kdv));
		System.out.println("KDV Tutari : "+ kdv);
		
		
	}

}

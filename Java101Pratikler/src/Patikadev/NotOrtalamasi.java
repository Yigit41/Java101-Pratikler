package Patikadev;

import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		 //Giris degiskenleri tanımlandı
		int mat,fizik,kimya,turkce,tarih,muzik;
		double notOrt;						
		String kosul;
		
		//Scanner sınıfı için nesne üretildi
		Scanner giris = new Scanner(System.in);	
		
		System.out.println("****Not Ortalamasi Hesaplama****");
		
		//Kullanıcıdan değerler alınıyor ve ilgili değişkenlere atanıyor.
		System.out.print("Matematik Notunuzu Giriniz : ");
		mat = giris.nextInt();
		
		System.out.print("Fizik Notunuzu Giriniz : ");
		fizik = giris.nextInt();
		
		System.out.print("Kimya Notunuzu Giriniz : ");
		kimya = giris.nextInt();

		System.out.print("Turkce Notunuzu Giriniz : ");
		turkce = giris.nextInt();
		
		System.out.print("Tarih Notunuzu Giriniz : ");
		tarih = giris.nextInt();
		
		System.out.print("Muzik Notunuzu Giriniz : ");
		muzik = giris.nextInt();
		
		//Not Ortalaması Hesaplanıyor
		notOrt = (mat+fizik+kimya+turkce+tarih+muzik)/6;
		System.out.println("Not Ortalamaniz : "+notOrt);
		
		//Koşula göre sonuc belirleniyor
		kosul = (notOrt>=60) ? "Sinifi Gectiniz" : "Sinifta Kaldiniz";
		System.out.println(kosul);
	}

}

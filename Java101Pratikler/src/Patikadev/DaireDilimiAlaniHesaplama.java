package patikadev;

import java.util.Scanner;

public class DaireDilimiAlaniHesaplama {

	public static void main(String[] args) {

		int yariCap,merkezAci;
		double alan, pi=3.14;
		
		System.out.println("****DAIRE DILIMI ALAN HESAPLAMA****");
		Scanner giris = new Scanner(System.in);
		
		System.out.println("Yari Cap Bilgisini Giriniz : ");
		yariCap = giris.nextInt();
		
		System.out.println("Merkez Aci Bilgisini Giriniz : ");
		merkezAci = giris.nextInt();
		
		alan = (pi*(yariCap*yariCap)*merkezAci)/360;
		
		System.out.println("Daire Dilimin Alani : "+alan);
	}

}

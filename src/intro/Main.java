package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu ="İnternet Şubesi";
		double dolarDun=8.15;
		double dolarBugun=8.15;
		int vade=36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);
		
		if (dolarDun<dolarBugun) {
			System.out.println("Dolar düştü resmi");
		}else if(dolarDun>dolarBugun){
			System.out.println("Dolar arttı resmi");
		}
		
		else {
			System.out.println("Dolar eşittir resmi");
		}
		
		String kredi1="Hızlı Kredi";
		String kredi2="Mutlu Emekli Kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="Çiftçi Kredisi";
		String kredi5="Msb Kredisi";

		
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler= {
				"Hızlı Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Ciftci Kredisi",
				"Msb Kredisi",
				"Kultur Bakanligi Kredisi",
				"Meb Kredisi"
				};
		
		//foreach 
		for (String kredi:krediler) {
			
			System.out.println(kredi);
		}
		
		//normal for
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,45,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		String sehir1="Ankara";
		String sehir2="Istanbul";
		sehir1=sehir2;
		sehir2="Izmir";
		System.out.println(sehir1);

	}

}

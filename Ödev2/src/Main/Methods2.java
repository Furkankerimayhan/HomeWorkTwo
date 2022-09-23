package Main;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava cok guzel";
		String yeniMesaj = mesaj.substring(0,2);   //substring değer döndürmek demektir.
		System.out.println(yeniMesaj);
		String mesaj2 = sehirVer();
		System.out.println(mesaj2);
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6,7,10);
		System.out.println(toplam);
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	private static int topla(int sayi1, int sayi2) {
		return sayi1+ sayi2;
	}
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi:sayilar) {
			toplam+=sayi;
		}
		
		return toplam;
	}
	
	public static String sehirVer() {
		return "Sakarya";
		
	}

}

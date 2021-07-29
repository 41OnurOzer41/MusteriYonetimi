package staj2;

public class MusteriManager extends Musteri{
	
	private Logger logger;
	
	public MusteriManager(Logger logger) {
		this.logger = logger;
	}
	
	public void musteriEkle (Musteri musteri) {
		System.out.println("Müsteri Eklendi -->" +musteri.getAdSoyad());
		logger.log();
		
	}
    private void musteriEkle(Musteri[] musteriler) {
		
	}
	public void cokluMusteriEkle(Musteri [] musteriler) {
		
		for(Musteri musteri:musteriler) {
		musteriEkle(musteriler);
		System.out.println("Çoklu Müsteri Eklendi -->"+musteri.getAdSoyad()+"<--");
		}
		logger.log();

	}

	
	public void musteriSil(Musteri musteri) {
		System.out.println("Müsteri Silindi -->" +musteri.getAdSoyad());
		logger.log();
	}
	
	public void musteriGuncelle(Musteri musteri) {
		System.out.println("Müsteri Güncellendi -->" +musteri.getAdSoyad());
		logger.log();
	}
	public void musteriListele(Musteri musteri) {
		System.out.println("Müsteri Listelendi -->" +musteri.getAdSoyad());
		logger.log();
	}

	
}

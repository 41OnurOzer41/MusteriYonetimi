package staj2;

public class MusteriManager extends Musteri{
	
	private Logger logger;
	
	public MusteriManager(Logger logger) {
		this.logger = logger;
	}
	
	public void musteriEkle (Musteri musteri) {
		System.out.println("M�steri Eklendi -->" +musteri.getAdSoyad());
		logger.log();
		
	}
    private void musteriEkle(Musteri[] musteriler) {
		
	}
	public void cokluMusteriEkle(Musteri [] musteriler) {
		
		for(Musteri musteri:musteriler) {
		musteriEkle(musteriler);
		System.out.println("�oklu M�steri Eklendi -->"+musteri.getAdSoyad()+"<--");
		}
		logger.log();

	}

	
	public void musteriSil(Musteri musteri) {
		System.out.println("M�steri Silindi -->" +musteri.getAdSoyad());
		logger.log();
	}
	
	public void musteriGuncelle(Musteri musteri) {
		System.out.println("M�steri G�ncellendi -->" +musteri.getAdSoyad());
		logger.log();
	}
	public void musteriListele(Musteri musteri) {
		System.out.println("M�steri Listelendi -->" +musteri.getAdSoyad());
		logger.log();
	}

	
}

package staj2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Musteri musteri = new Musteri (1,"Onur ÖZER",15);
	      Musteri musteriler[] = new Musteri [3];
	      Musteri musteriler1 = new Musteri(2,"Emre ÖZER",16);
	      musteriler[0]=musteriler1;
	      Musteri musteriler2 = new Musteri(3,"Cihat ÖZER",17);
	      musteriler[1]=musteriler2;
	      Musteri musteriler3 = new Musteri(4,"Ali ÖZER",18);
	      musteriler[2]=musteriler3;

	    	  
		  
			MusteriManager manager=new MusteriManager(new DatabaseLogger());
			manager.musteriEkle(musteri);
			manager.cokluMusteriEkle(musteriler);
	}

}

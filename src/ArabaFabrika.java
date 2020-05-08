import java.util.ArrayList;

/*
 * Genel bir araba fabrikasini tanimlar. Soyut oldugu için bu siniftan nesne olusturulamaz.
 * belirli bir araba marka ve modelini uretebilmek icin bu sinifin alt sinifi olusturulmasi
 * gerekmektedir.
 */
public abstract class ArabaFabrika {
	/*
	 * Bir araba fabrikasinini urettigi degisik modeldeki arabalarin icinde yer aldigi liste.
	 */
	private ArrayList<Araba> arabaListesi=new ArrayList<Araba>();
	/*
	 * Alt siniflarda bir fabrikanin (nesnenin) olusturulmasi ile beraber,
	 * createAuto() metodu isleme girer, yani fabrika araba uretime baslamýs olur.
	 */
	public ArabaFabrika() {
		createAuto();
	}
	/*
	 * Alt siniflar tarafindan override edilir. Belirli bir marka ve modelin
	 * olusturulmasinda kullanilir.
	 */
	public abstract void createAuto();
	public ArrayList<Araba> getArabaListesi(){
		return arabaListesi;
	}
	public void setArabaListesi(final ArrayList<Araba> arabaListesi) {
		this.arabaListesi=arabaListesi;
	}

}

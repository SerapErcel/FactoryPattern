
public class AudiFabrika extends ArabaFabrika{
	/*
	 * ArabaFabrika sinifinda yer alan createAuto() metodu Audi alt sinifinda
	 * implemente edilir. Bu metod Audi markasina ait A4 modelinin 
	 * uretimi icin kullanilir.
	 */
	public void createAuto() {
		getArabaListesi().add(new A4(120));
	}

}


public class BmwFabrika extends ArabaFabrika{
	/*
	 * ArabaFabrika sinifinda yer alan createAuto() metodu BmwFabrika
	 * alt sinifinda override edilir. Bu metod Bmw markasina ait Z4 model
	 * arabayi uretmek icin kullanilir.
	 */
	public void createAuto() {
		getArabaListesi().add(new Z4(180));
	}

}

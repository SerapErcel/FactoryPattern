
public class Test {
	public static void main(String args[]) {
		//Bmw marka arabalarin uretildigi bir fabrika  oluolusturuyoruz
		ArabaFabrika bmw=new BmwFabrika();
		//Audi marka arabalarin uretildigi bir fabrika olusturuyoruz.
		ArabaFabrika audi=new AudiFabrika();
		
		//Bmw marka arabalari ekrana yaziyoruz.
		for(final Araba araba: bmw.getArabaListesi()) {
			System.out.println(araba.getMarka()+" "+araba.getModel()+" "+araba.getBeygirGucu());
		}
		
		//Audi marka arabalari ekrana yaziyoruz.
		for(final Araba araba: audi.getArabaListesi()) {
			System.out.println(araba.getMarka()+" "+araba.getModel()+" "+araba.getBeygirGucu());

		}
	}

}

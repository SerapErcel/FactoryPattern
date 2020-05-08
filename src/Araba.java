
public abstract class Araba {
	private String marka=null;
	private String model=null;
	private int beygirGucu=0;
	public Araba(final String marka, final String model, final int beygirGucu) {
		setMarka(marka);
		setModel(model);
		setBeygirGucu(beygirGucu);
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(final String marka) {
		this.marka=marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(final String model) {
		this.model=model;
	}
	public int getBeygirGucu() {
		return beygirGucu;
	}
	public void setBeygirGucu(final int beygirGucu) {
		this.beygirGucu=beygirGucu;
	}

}



public class Bus extends PublicTransformation implements IBilgilendirme {

	
	
	private String marka;
	private int muavin_sayisi;
	private int ikram_say�s�;
	private Boolean Tv;
	

	public Bus(int fiyat, int seyehat_Suresi, String gidilecek_Yer, String baslangic_Konumu,String sirket_adi) {
		super(fiyat, seyehat_Suresi, gidilecek_Yer, baslangic_Konumu, baslangic_Konumu);
		// TODO Auto-generated constructor stub
	}
	
	public Bus(int fiyat, int seyehat_Suresi, String gidilecek_Yer, String baslangic_Konumu, String marka,
			int muavin_sayisi, int ikram_say�s�, Boolean tv) {
		super(fiyat, seyehat_Suresi, gidilecek_Yer, baslangic_Konumu, marka);
		this.marka = marka;
		this.muavin_sayisi = muavin_sayisi;
		this.ikram_say�s� = ikram_say�s�;
		Tv = tv;
	}
	

	public String getMarka() {
		return marka;
	}



	public void setMarka(String marka) {
		this.marka = marka;
	}



	public int getMuavin_sayisi() {
		return muavin_sayisi;
	}



	public void setMuavin_sayisi(int muavin_sayisi) {
		this.muavin_sayisi = muavin_sayisi;
	}



	public int getIkram_say�s�() {
		return ikram_say�s�;
	}



	public void setIkram_say�s�(int ikram_say�s�) {
		this.ikram_say�s� = ikram_say�s�;
	}



	public Boolean getTv() {
		return Tv;
	}



	public void setTv(Boolean tv) {
		Tv = tv;
	}



	

	
	
	
	
	
	
	
	
	

}

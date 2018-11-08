package kucniljubimci;

import greska.GreskaAaplikacije;
import zivotinjebriga.Setnja;

public class Kuce extends KucniLjubimci implements Setnja {
// kuce implements setnja
	// jedino ta podklasa moze da se seta
	String rasa;
	Boolean pedigre;
	
	
	public Kuce(String naziv, Boolean dlaka, String rasa, Boolean pedigre) throws GreskaAaplikacije {
		super(naziv, dlaka);
		// prosledjujemo u super naziv i dlaku
		this.rasa = rasa;
		this.pedigre = pedigre;
	}

// da li treba override? ne
	
	
	
	


	public String getRasa() {
		return rasa;
	}


	@Override
	public String tipZabave() {
		// TODO Auto-generated method stub
		//return super.tipZabave();
		return " Zuca zahteva setnju " + " i igranje na otvorenom prostoru";
		
		// umesto kuce zuca
	}

	@Override
	public Integer vremeZabave() {
		// TODO Auto-generated method stub
		//return super.vremeZabave();
		return 60;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}


	public Boolean getPedigre() {
		return pedigre;
	}


	public void setPedigre(Boolean pedigre) {
		this.pedigre = pedigre;
	}
	
	
	
	
	
	
	
	
	
	
	
}

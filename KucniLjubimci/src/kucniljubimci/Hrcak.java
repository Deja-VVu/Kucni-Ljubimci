package kucniljubimci;

import greska.GreskaAaplikacije;

public class Hrcak extends KucniLjubimci{

	
	
	
	String boja;

	public Hrcak(String naziv, Boolean dlaka, String boja) throws GreskaAaplikacije {
		super(naziv, dlaka);
		this.boja = boja;
	}

	/////// dodat u konstructor throwwwwwwwwww klick na crveno i add throws declaration
	// override? za naziv i dlaku boolean
	
	
	
	
	
	public String getBoja() {
		return boja;
	}

	@Override
	public String tipZabave() {
		// TODO Auto-generated method stub
		//return super.tipZabave();
		return "Dlaka zahteva: " + "Igra u akvarijumu i " + "trcanje po tocku" ;
		// naziv dlaka umesto hrcak
	}


	@Override
	public Integer vremeZabave() {
		// TODO Auto-generated method stub
		//return super.vremeZabave();
		return 120;
	}


	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	
	// automatski kad idem source stavlja mi i atribute od superklase ako sam vec definisao
	
	
	
	
	
	
	
	
	
	
	
	
}

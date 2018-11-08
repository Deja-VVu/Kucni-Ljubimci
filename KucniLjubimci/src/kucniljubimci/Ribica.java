package kucniljubimci;

import greska.GreskaAaplikacije;

public class Ribica extends KucniLjubimci{

	
	
	Boolean zlatna;

	// get i set posto ima atribute
	
	
	public Ribica(String naziv, Boolean dlaka, Boolean zlatna) throws GreskaAaplikacije {
		super(naziv, dlaka);
		this.zlatna = zlatna;
	}
// u svaki adovati throw declaration
// prvi klik









	@Override
	public String tipZabave() {
		// TODO Auto-generated method stub
		//return super.tipZabave();
		return "Plivanje u akvarijumu.";
	}











	@Override
	public Integer vremeZabave() {
		// TODO Auto-generated method stub
		//return super.vremeZabave();
		return 1440;
	}











	public Boolean getZlatna() {
		return zlatna;
	}




	public void setZlatna(Boolean zlatna) {
		this.zlatna = zlatna;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

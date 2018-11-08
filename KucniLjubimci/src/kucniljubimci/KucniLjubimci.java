package kucniljubimci;

import greska.GreskaAaplikacije;
import zivotinjebriga.BrigaOLjubimcu;

public abstract class KucniLjubimci implements BrigaOLjubimcu{
// add unimplemented methods vreme i tip zabave
	// private na atribute?
	// dodati abstract
	String naziv;
	Boolean dlaka;
	
	// ili abstract ali onda svaka podklasa mora da implementira briga o ljubimcu
	// da li mora da bude abstract class
	
	// ne moze da se instancira
	// ali ne mora da implementira metode
	
	
	public KucniLjubimci(String naziv, Boolean dlaka) throws GreskaAaplikacije{
		super();
		///////////////////////////////////////DODATO///////////////////////////////////////////////////////
		//if (naziv.isEmpty()) {
			if (naziv == null || naziv.isEmpty()) {
			throw new GreskaAaplikacije("Naziv mora biti popunjen");
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		this.naziv = naziv;
		this.dlaka = dlaka;
	}




	public String getNaziv() {
		return naziv;
	}




	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}




	public Boolean getDlaka() {
		return dlaka;
	}




	public void setDlaka(Boolean dlaka) {
		this.dlaka = dlaka;
	}




	@Override
	public String tipZabave() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Integer vremeZabave() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

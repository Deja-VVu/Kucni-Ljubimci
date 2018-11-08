package osoba;

import kucniljubimci.Hrcak;
import kucniljubimci.Kuce;
import kucniljubimci.KucniLjubimci;
import zivotinjebriga.BrigaOLjubimcu;
import zivotinjebriga.Setnja;

public class Vlasnik  {
	
	
	//////////////////////////////////////////////////////////////////
	
	public void staviOgrlicu(KucniLjubimci kucniLjubimac) {
	try {
		Kuce pas = (Kuce) kucniLjubimac;
		System.out.println("Stavljena je ogrlica na" + pas.getNaziv());
		
		// zaboravio sam plus
	}catch (ClassCastException e) {
		System.out.println("ne moze da stavite ogrlicu na ljubimca");
	}
	
	}// da li je kuce ribica ili hrcak
	////////////////////////////////////////////////////////////////////
	
// ok ovo je tacno bilo public void Setnja
	
	
	public void setaj (Setnja setaj) {
		// tip setnja i naziv atributa setaj moze umesto setaj bilo sta
	//System.out.println(setaj);
		//System.out.println("Setam ljubimca" + setaj.vremeZabave() + "minuta dnevno");
// mislio sam samo naziv da promenim ali svi pozivaju ovu metodu
		
		// treba kastovati setnju
		
		Kuce kuce = (Kuce) setaj;
		Hrcak h =(Hrcak) setaj; // i import hrcak
		// kod njega je setnja zbog naziva gornje void metode
		
		System.out.println("Setam" + kuce.getNaziv() + " , setam ga" + kuce.vremeZabave() + "minuta dveno");
		
		// ovo umesto ovog dole zbog naziva
		
    // System.out.println("Setam ljubimca" + setaj.vremeZabave() + "minuta dnevno");
     
		
		
		
		// setaj a ne setnja
		// menjanje umesto ljubimca ime tog ljubimca zuca itd
	}
		public void brigaoljubimcu (BrigaOLjubimcu oLjubimcu ) {
		//System.out.println(briga);
			KucniLjubimci kl= (KucniLjubimci) oLjubimcu;
			// casting 
			// interfejs briga
			// import
			// System.out.println("O svom ljubimcu se brinem na sledece nacine :"); bilo je ovako
			System.out.println("O svom ljubimcu " + kl.getNaziv() + "se brinem na sledece nacine : ");
			
			
//			System.out.println("O svom Zuci se brinem na sledeci nacine:" +);
//			System.out.println("O svom Milunki se brinem na sledeci nacine:" +);
//			System.out.println("O svom  se brinem na sledeci nacine:" +);
			
			
			System.out.println(oLjubimcu.tipZabave());
			System.out.println("Najmanje" + oLjubimcu.vremeZabave() + "minuta dnevno");
		// mora da ima syso u setaj
		
		// evo ga nekako
	}
//	
//	public void setaj(Setnja setaj) {
//	
//	
//    public void BrigaLjubimca(BrigaOLjubimcu);
	
	
	
	
	
	
	
	
	
	
}

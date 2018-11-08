package demo;

import greska.GreskaAaplikacije;
import kucniljubimci.Hrcak;
import kucniljubimci.Kuce;
import kucniljubimci.KucniLjubimci;
import kucniljubimci.Ribica;
import osoba.Vlasnik;


// import zivotinke . * i sve ce da importuje iz istog paketa kod mene je kucniljubimci
public class Aplikacija {

	public static void main(String[] args) throws GreskaAaplikacije {
		// TODO Auto-generated method stub
// dodat throws GreskaAaaplikacije 
		
		// ponovo sam pogresio Greska a a plikacije
		
		
		//moj pokusaj
//		
//		Vlasnik v = new Vlasnik ()	;	
//		
//		Kuce n - new Kuce(Dzek, dlaka, rasa, pedigre);
//		
//	
//		Hrcak h - new Hrcak(naziv, dlaka, boja) 
//		h.
//		Ribica r = new Ribica(naziv, dlaka, zlatna)
//		r.
//		// nakon hrcak samo ctrl da automatski parametre ubaci i metode i import
//		// v. briga o ljubimcu
		
		
		
		
		
		// ctrl space nakon kuce za parametre
		
//		Vlasnik vlasnik = new Vlasnik ();
//		
//		Kuce ker = new Kuce("Zuca", true, "DOC", true);
//		KucniLjubimci ribica = new Ribica("Milunka", false, true);
//		
//		Hrcak hrcak = new Hrcak("Dlaka", true , "plava");
//		
//		
//		// zbog cega je kucni ljubimac
//		// kucni ljubimci i import a ne ljubimac
//		// moze a i ne mora vec zbog interfejsa
//		
//		
//		
//		
//		
//		vlasnik.setaj(ker);
//		
//		// pozivanje metode setaj na kera hmm
//		//vlasnik.setaj(ribica); ne moze
//		vlasnik.brigaoljubimcu(ker);
//		vlasnik.brigaoljubimcu(ribica);
//		vlasnik.brigaoljubimcu(hrcak);
//		
//		
//		// poziva hrcka jer je to naziv objekta Hrcak hrcak
//		
//		// i briga o ljubimcu za hrcka
//		
		
		
		
		
		
		
		
		//////////////////////////////DODATO/////////////////////////////////////////////////////////////////////
		
		
		
		
		
		try {
		
		
Vlasnik vlasnik = new Vlasnik ();
		
		Kuce ker = new Kuce("Zuca", true, "DOC", true);
		KucniLjubimci ribica = new Ribica("Milunka", false, true);
		
		Hrcak hrcak = new Hrcak("Dlaka", true , "plava");
		
		
		// zbog cega je kucni ljubimac
		// kucni ljubimci i import a ne ljubimac
		// moze a i ne mora vec zbog interfejsa
		
		
		
		
		
		vlasnik.setaj(ker);
		
		// pozivanje metode setaj na kera hmm
		//vlasnik.setaj(ribica); ne moze
		vlasnik.brigaoljubimcu(ker);
		vlasnik.brigaoljubimcu(ribica);
		vlasnik.brigaoljubimcu(hrcak);
		
		} catch (GreskaAaplikacije e) {
			System.out.println(e.getMessage());
		}
		// poziva hrcka jer je to naziv objekta Hrcak hrcak
		
		// i briga o ljubimcu za hrcka
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

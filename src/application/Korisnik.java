package application;

import java.util.Date;

public class Korisnik {
	public String ID_JMBG;
	public String ime;
	public String prezime;
	public Date datum_rodjenja;
	public String adresa;
	public String broj_telefona;
	
	public Korisnik() {
		
	}
	public Korisnik(String ID_JMBG) {
		this.ID_JMBG = ID_JMBG;
		//2312997999999
	}
	
	//***********
	public String getID_JMBG() {
		return ID_JMBG;
	}
	public void setID_JMBG(String iD_JMBG) {
		ID_JMBG = iD_JMBG;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public Date getDatum_rodjenja() {
		return datum_rodjenja;
	}
	public void setDatum_rodjenja(Date datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getBroj_telefona() {
		return broj_telefona;
	}
	public void setBroj_telefona(String broj_telefona) {
		this.broj_telefona = broj_telefona;
	}
}

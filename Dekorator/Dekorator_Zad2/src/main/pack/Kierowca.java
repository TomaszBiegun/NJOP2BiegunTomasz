package main.pack;

class Kierowca extends UzytkownikDrogi {
	Pole pole;
	public String idKierowcy = "K";
	
	public Kierowca(Pole pole){
		this.pole = pole;
	}
	public String znakPola(){
		return idKierowcy;
	 }
}

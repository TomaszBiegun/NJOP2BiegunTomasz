package main.pack;

class Rowerzysta extends UzytkownikDrogi {
	Pole pole;
	public String idRowerzysty = "R";
	
	public Rowerzysta(Pole pole){
		this.pole = pole;
	}
	public String znakPola(){
		return idRowerzysty;
	 }
	
	
}

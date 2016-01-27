package main.pack;
import java.util.Random;
import java.util.Scanner;



public class Main {
	
	public static int pobierzOdp(){
			Scanner pytanie = new Scanner(System.in);
			int odpowiedz = pytanie.nextInt();
			return odpowiedz;
	}
	
	public static void kraksa(){
		System.out.println("KRAKSA! Koniec programu.");
		System.exit(0);
	}
	public static void umiescObiekty(String plansza[][], Pole pola[], int k){
		int i = losujLiczbe(plansza.length);
		int j = losujLiczbe(plansza.length);
		if(plansza[i][j].equals("-")){
			plansza[i][j] = pola[k].znakPola();
		}else{
			umiescObiekty(plansza, pola, k);
		}
	}
	public static int losujLiczbe(int zakres){
		Random random = new Random();
		int los = random.nextInt(zakres);
		return los;
	}
	
	public static void oczekujReakcji(String plansza[][]){
		System.out.println("Naduœ ENTER, aby przejœæ do kolejnej fazy");
		Scanner wait = new Scanner(System.in);
		String enter = wait.nextLine();
		if(enter.equals("")) {
			kolejnaFaza(plansza);
		}else{
			oczekujReakcji(plansza);
		}
	}
	public static void kolejnaFaza(String plansza[][]){
		for(int i=0; i<plansza.length; i++){
			for(int j=0; j<plansza.length; j++){
				int kierunek = losujLiczbe(3);
				if(plansza[i][j].equals("P") || plansza[i][j].equals("R")|| plansza[i][j].equals("K")){
					if(kierunek == 0){
						if(i-1>=0){
							if(plansza[i-1][j].equals("-")){
								plansza[i-1][j] = plansza[i][j];
								plansza[i][j] = "-";
							}else kraksa();
						}else{
							if(plansza[i+1][j].equals("-")){
								plansza[i+1][j] = plansza[i][j];
								plansza[i][j] = "-";
							}else kraksa();
						}
					}
					if(kierunek == 1){
						if(j-1>=0){
							if(plansza[i][j-1].equals("-")){
								plansza[i][j-1] = plansza[i][j];
								plansza[i][j] = "-";
							}else kraksa();
						}else{
							if(plansza[i][j+1].equals("-")){
								plansza[i][j+1] = plansza[i][j];
								plansza[i][j] = "-";
							}else kraksa();
						}
					}
					if(kierunek == 2){
						if(i+1<plansza.length){
							if(plansza[i+1][j].equals("-")){
								plansza[i+1][j] = plansza[i][j];
								plansza[i][j] = "-";
							}else kraksa();
						}else{
							if(plansza[i-1][j].equals("-")){
								plansza[i-1][j] = plansza[i][j];
								plansza[i][j] = "-";
							}else kraksa();
						}
					}
					if(kierunek == 3){
						if(j+1<plansza.length){
							if(plansza[i][j+1].equals("-")){
								plansza[i][j+1] = plansza[i][j];
								plansza[i][j] = "-";
							}else kraksa();
						}else{
							if(plansza[i][j-1].equals("-")){
								plansza[i][j-1] = plansza[i][j];
								plansza[i][j] = "-";
							}else kraksa();
						}
					}
				}
			}
		}
		for(int i=0; i < plansza.length; i++){
			for(int j=0; j < plansza.length; j++){
				System.out.print(plansza[i][j]);
			}
			System.out.println();
		}
		oczekujReakcji(plansza);	
	}
	
	
	public static void main(String[] args){
		
		System.out.println("Ilu u¿ytkowników drogi?");
		int iloscObiektow = pobierzOdp();
		
		Pole[] pola = new Pole[iloscObiektow];
		
		System.out.println("Ilu pieszych?");
		int iloscPieszych = pobierzOdp(); 
		for(int i=0; i<iloscPieszych; i++){
			pola[i] = new Pieszy();
		}
		
		System.out.println("Ilu z nich ma byæ na rowerze?");
		int iloscRowerow = pobierzOdp();
		
		for(int i=iloscPieszych; i<iloscRowerow+iloscPieszych; i++){
			Pole rowerzysta = new Rowerzysta(pola[i]);
			pola[i] = rowerzysta;
		}
		
		System.out.println("Kierowcow pojazdow bedzie zatem:\n" +(iloscObiektow-iloscPieszych-iloscRowerow));
		for(int i=iloscRowerow+iloscPieszych; i<iloscObiektow; i++){
			Pole kierowca = new Kierowca(pola[i]);
			pola[i] = kierowca;
		}
		
		for(int i=0; i<pola.length; i++){
			System.out.print(pola[i].znakPola()); 
		}
		
		System.out.println("\nPodaj rozmiar planszy");
		int rozmiar = pobierzOdp();
		String[][] plansza = new String[rozmiar][rozmiar];
		System.out.println("Pusta plansza");
		for(int i=0; i < rozmiar; i++){
			for(int j=0; j < rozmiar; j++){
				plansza[i][j] = "-";
				System.out.print(plansza[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Po dodaniu obiektów");
		for (int k=0; k<pola.length; k++){
			umiescObiekty(plansza, pola, k);
		}
		
		for(int i=0; i < plansza.length; i++){
			for(int j=0; j < plansza.length; j++){
				System.out.print(plansza[i][j]);
			}
			System.out.println();
		}
		oczekujReakcji(plansza);
		
		
		
		
		
		//kraksa();		
	}

}

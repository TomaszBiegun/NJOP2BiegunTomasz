package main.pack;
import java.io.IOException;
import java.util.Scanner;

public class Dekorator {
	
	public static void main(String[] args){
		
		String sciezka_pliku = "D:/test.txt";
		
		try{
			FileSource plik	= new FileSource(sciezka_pliku);
			String[] tablicaWierszy = plik.OpenFile();
			
			int i;
			for(i=0; i < tablicaWierszy.length; i++){
				System.out.println(tablicaWierszy[i]);
			}
			System.out.println("��cznie wierszy: " + tablicaWierszy.length);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Policzy� ilo�� s��w? t/n");
		String odp;
		Scanner odpowiedz = new Scanner(System.in);
		
		odp = odpowiedz.nextLine();
		odpowiedz.close();
		
		if(odp.equals("t")){
			try{
				FileSource plik = new FileSource(sciezka_pliku);
				int liczbaSlow = plik.PoliczSlowa();
				System.out.println("��cznie s��w: " + liczbaSlow);
			}catch(IOException ee){
				
			}
		}
	}

}

package main.pack;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class FileSource {
	
	private String sciezka;
	
	public FileSource(String sciezkaPliku){
		sciezka = sciezkaPliku;
	}
	
	public String[] OpenFile() throws IOException {
		
		FileReader fr = new FileReader(sciezka);
		BufferedReader readText = new BufferedReader(fr);
		
		int ileLinii = PoliczLinie();
		String[] textData = new String[ileLinii];
		
		int i;
		
		for(i=0; i < ileLinii; i++){
			textData[i] = readText.readLine();
		}
		readText.close();
		return textData;
	}
	
	int PoliczLinie() throws IOException {
		
		FileReader plik_do_czytania = new FileReader(sciezka);
        BufferedReader bf = new BufferedReader(plik_do_czytania);
         
        String linie;
        int liczbaLinii = 0;
        while((linie = bf.readLine()) != null){
            liczbaLinii++;
        }
        bf.close();
         
        return liczbaLinii;
	}
	
	int PoliczSlowa() throws IOException {
		FileReader fr = new FileReader(sciezka);
		Scanner skan = new Scanner(fr);
		int licz = 0;
		while(skan.hasNext()){
			skan.next();
			licz++;
		}
		skan.close();
		return licz;		
	}
	

}

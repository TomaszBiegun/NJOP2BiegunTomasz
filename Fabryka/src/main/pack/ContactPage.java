package main.pack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ContactPage implements Page {
	
	public static int losujLiczbe(int zakres){
		Random random = new Random();
		int los = random.nextInt(zakres);
		return los;
	}
	
	public static String phoneNumber(){
		String phoneNumber="<td>";
		for(int j=0; j<9; j++){
			if (j==0){
				int pierwszaCyfra = losujLiczbe(3);
				Integer cyfra = pierwszaCyfra+5;
				phoneNumber += cyfra.toString();
			}else{
				Integer cyfra = losujLiczbe(9);
				phoneNumber += cyfra.toString();
			}
		}
		phoneNumber += "</td>\n";
		return phoneNumber;
	}
	
	public static String imie(){
		String []imiona = new String[8];
		imiona[0]="Maciej"; imiona[1]="Anna"; imiona [2]="Bolek"; imiona[3]="Bartek";
		imiona[4]="£ukasz"; imiona[5]="Hermiona"; imiona[6]="Gra¿yna"; imiona[7]="Antek";
		
		String imie ="<td>" + imiona[losujLiczbe(8)] + "</td>\n";
		return imie;
	}
	public static String nazwisko(){
		String []nazwiska = new String[8];
		for(int i=0; i<nazwiska.length; i++){
			nazwiska[i] = "Nazwisko" + i;
		}
		String nazwisko = "<td>" + nazwiska[losujLiczbe(8)] + "</td>\n";
		return nazwisko;
	}
	
	public static String miasto(){
		String []miasta = new String[5];
		miasta[0]="Katowice"; miasta[1]="Warszawa"; miasta[2]="Gdynia"; miasta[3]="Kraków"; miasta[4]="Wroc³aw";
		String miasto = "<td>" + miasta[losujLiczbe(5)] + "</td>\n";
		return miasto;
	}
	
	public void writePage(){
		String content;
		content = "<html>\n"
				+ "<body>\n"
				+ "<table border="+ '"' + "1" + '"' + ">"
				+ "<tbody>\n"
				+ "<tr>\n"
				+ "<th>ID</th>"
				+ "<th>Imiê</th>"
				+ "<th>Nazwisko</th>"
				+ "<th>Miasto</th>"
				+ "<th>Telefon</th>";
		int iloscDanych = losujLiczbe(20);
		for (int i=0; i<=iloscDanych; i++){
			content += "<tr>";
			content += "<td>" + (i+1) + "</td>\n" + imie() + nazwisko() + miasto() + phoneNumber() + "</tr>\n";
		}
		content += "\n</body>\n</html>";
		BufferedWriter output = null;
		try{
			System.out.println("I'm creating a contacts page.");
			File file = new File("Contacts Page.html");
			output = new BufferedWriter(new FileWriter(file));
			output.write(content);
			output.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

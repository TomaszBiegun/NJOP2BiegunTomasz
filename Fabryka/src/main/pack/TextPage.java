package main.pack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class TextPage implements Page {
	
	private static String litery ="qwertyuiop asdfghjkl zxcvbnm.,";

	public static int losujLiczbe(int zakres){
		Random random = new Random();
		int los = random.nextInt(zakres);
		return los;
	}
	
	public static String randomizeText(){
		String randomizedText="";
		int length = losujLiczbe(300);
		length += 200;
		char []text = new char[length];
		for (int i=0; i < length; i++){
			int znak = losujLiczbe(litery.length());
			if (i==0){	//Pierwsza litera ka¿dego newsa zawsze z du¿ej litery
				if(litery.charAt(znak)== ' ' || litery.charAt(znak)== ',' || litery.charAt(znak)== '.'){
					text[i] = litery.charAt(znak-2);
				}else{
					text[i] = litery.charAt(znak);
				}
				String first = "";
				first += text[i];
				first = first.toUpperCase();
				text[i]=first.charAt(0);
			}else if(i>2 && (text[i-1] == '.' || text[i-1] == ',')){ //po ka¿dej kropce/przecinku spacja
				text[i] = ' ';
			}else if(i>3 && text[i-2] == '.'){ //ka¿da kropka koñczy zdanie.
				if(litery.charAt(znak)== ' ' || litery.charAt(znak)== ',' || litery.charAt(znak)== '.'){
					text[i] = litery.charAt(znak-2);
				}else{
					text[i] = litery.charAt(znak);
				}
				String noweZdanie = "";
				noweZdanie += text[i];
				noweZdanie = noweZdanie.toUpperCase();
				text[i]=noweZdanie.charAt(0);
			}else if(i>1 && text[i-1]==' '){ //jak poprzednia by³a spacja, to nastêpna musi byæ litera
				if(litery.charAt(znak)== ' ' || litery.charAt(znak)== ',' || litery.charAt(znak)== '.'){
					text[i] = litery.charAt(znak-2);
				}else{
					text[i] = litery.charAt(znak);
				}
			}else{
				text[i] = litery.charAt(znak);
			}	
			randomizedText += text[i];
		}
		return randomizedText;
	}

	public void writePage(){
		String content;
		content = "<html>\n<body>\n";
		Random random = new Random();
		int iloscParagrafow = random.nextInt(50);
		for(int i=0; i<iloscParagrafow; i++){
			content +="<p>"
					+ randomizeText()
					+"</p>\n";
		}
		content +="</body>\n</html>";
		BufferedWriter output = null;
		try{
			System.out.println("I'm creating a text page.");
			File file = new File("Text Page.html");
			output = new BufferedWriter(new FileWriter(file));
			output.write(content);
			output.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}

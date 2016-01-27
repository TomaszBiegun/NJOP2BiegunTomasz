package main.pack;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static String getAnswer(){
		Scanner scan = new Scanner(System.in);
		String answer = scan.nextLine();
		return answer;
	}
	
	public static void repetition(){
		System.out.println("Do you want to repeat? (y/n)");
		String repeat = getAnswer();
		if(repeat.equals("y")){
			pageCreation();
		}else if(repeat.equals("n")){
			System.out.println("Okay, bye!");
			System.exit(0);
		}else{
			System.out.println("Bad answer!");
			repetition();
		}
	}
	
	public static void askUser(){
		System.out.println("Do you want to create a page? (y/n)");
		String answer = getAnswer();
		if(answer.equals("n")){
			System.out.println("Okay, bye!");
			System.exit(0);
		}
		else if(answer.equals("y")){
			pageCreation();
		}
		else{
			System.out.println("Wrong answer!");
			askUser();
		}
	}
	
	public static void pageCreation(){
		PageFactory pageFactory = new PageFactory();	
		System.out.println("Please type the page type (img/text/contact/news)");
		
		String answer = getAnswer();
		if(answer.equals("img")){
			Page imgPage = pageFactory.getPage("img");
			imgPage.writePage();
		}else if(answer.equals("text")){
			Page textPage = pageFactory.getPage("text");
			textPage.writePage();
		}else if(answer.equals("contact")){
			Page contactPage = pageFactory.getPage("contact");
			contactPage.writePage();
		}else if(answer.equals("news")){
			Page newsPage = pageFactory.getPage("news");
			newsPage.writePage();	
		}else{
			System.out.println("Check your answer and try again");
			System.out.println("Make sure you type " 
			+'"'+"img"+'"'+" or "
			+'"'+"text"+'"'+" or "
			+'"'+"contact"+'"'+" or "
			+'"'+"news"+'"'+"!\n");
			pageCreation();
		}
		System.out.println("Page created!");
		repetition();
	}
	
	public static int losujLiczbe(int zakres){
		Random random = new Random();
		int los = random.nextInt(zakres);
		return los;
	}
	
	public static void main(String[] args){
		
		askUser();
		
	}

}

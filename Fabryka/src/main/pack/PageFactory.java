package main.pack;

public class PageFactory {

	public Page getPage(String pageType){
		
		if(pageType.equals("img")){
			return new ImgPage();
		}else if(pageType.equals("text")){
			return new TextPage();
		}else if(pageType.equals("contact")){
			return new ContactPage();
		}else{
			return new NewsPage();
		}
	}
	
}

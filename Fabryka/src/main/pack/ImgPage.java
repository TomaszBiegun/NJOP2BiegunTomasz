package main.pack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class ImgPage implements Page {
	
	
	public void writePage(){
		String content;
		content = "<html>\n<body>\n"
				+"<img src="
				+'"'+"http://blog.newrelic.com/wp-content/uploads/javalogo.png"+'"'
				+"</img>\n"
				+"<img src="+'"'
		+"http://cache.lego.com/r/catalogs/-/media/catalogs/characters/dc/mugshots/new%202hy%202015/76034_batman_912x516_360w.png?l.r2=1238082943"
				+'"'+"</img>\n"
		 +"\n</body>\n</html>";
		
		BufferedWriter output = null;
		try{
			System.out.println("I'm creating an img page.");
			File file = new File("Image Page.html");
			output = new BufferedWriter(new FileWriter(file));
			output.write(content);
			output.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

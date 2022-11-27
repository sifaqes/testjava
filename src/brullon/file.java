package brullon;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

		
		
public class file {

	public static void main(String[] args) {
//		file.bufferlogs();
		file.filemaker();
	}	
		


	public static void filemaker() throws IOException {
		try { 
			
			// TODO Auto-generated method stub
			File myfile = new File("test.txt");
			FileWriter mywriter = new FileWriter("test.txt");
			
			
			if (myfile.createNewFile()) {
				System.out.println("Text true"+ myfile.getName());
				mywriter.write("Name:" + myfile.getName());
				mywriter.close();
			} else {
				System.out.println("Text false exist "+ myfile.getName());
				
				mywriter.write("File Exist ");
				mywriter.write("Name:" + myfile.length());
				mywriter.close();
				
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void bufferlogs()
	{
		StringBuffer bufferlogs = new StringBuffer("Logs");
		bufferlogs.append("+++++++++++++++");  					//Add text to buffer
		bufferlogs.insert(4, "***"); 										//insert the text to buffer depends on the line number
		bufferlogs.replace(0,4,"----" );
		System.out.println(bufferlogs);										//Print Buffer
	}	
	public static void timelogs()
	{
	

	}	
	
}

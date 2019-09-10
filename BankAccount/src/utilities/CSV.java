package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	//a method named read that will read from file like below (takes file path and returns a list of String array) 
	/* name, adhaar no, type of account, deposit money	
	 * Arielle Duncan,444102638,Savings,1000
		Marybeth Sanders,431551383,Checking,2500
	 	Hattie Storey,476687875,Checking,3500
		Hilary Ward,005965723,Checking,6000  */
	//and return a list of String array which is split by "," so we will have string array for each row of the file
	
	public static List<String[]> read(String file){
		
		
		List <String[]> dataList= new LinkedList<String[]>();
		String dataRow;
		BufferedReader br;

		
		try {
			br = new BufferedReader(new FileReader(file));
			while(!((dataRow=br.readLine())==null)) {
				String [] dataRecord=dataRow.split(",");
				dataList.add(dataRecord);
			}
		} 
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return  dataList;
	}
}

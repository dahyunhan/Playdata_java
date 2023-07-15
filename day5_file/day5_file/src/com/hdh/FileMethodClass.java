package com.hdh;
import java.io.*;

public class FileMethodClass {

	public FileMethodClass() {
	
	}
	public static void fileWrite(String uri) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(uri);

			String txt = "웼잉잉/r꿀벌";
			fw.write(txt);
			fw.close();
			
		} catch (IOException e) {
			
			
		System.out.println("FileWriter -> "+e.getMessage());	
		}
		
	}
	
	public static void fileRead(String uri) {
		

		try {
			FileReader fr = new FileReader(uri);
			BufferedReader br = new BufferedReader(fr);
	
			String temp="";
			while((temp=br.readLine())!=null) {
				System.out.println(temp);
			}
			
			
			br.close();
			fr.close();
			
		} catch (Exception e) {
		System.out.println("FileReader -> "+e.getMessage());	
		}
		
	}

}

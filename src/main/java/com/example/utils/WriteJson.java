package com.example.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.example.models.Data;

public class WriteJson {
	
	
	public static void writeDataString(Data data, String path){
		
		
		
		try {
			
			FileWriter file = new FileWriter(path);
			BufferedWriter salida = new BufferedWriter(file);
			
			salida.write(data.toString());
			salida.close();

			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

}

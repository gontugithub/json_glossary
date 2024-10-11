package com.example.utils;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.example.models.Data;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

public class ReadJson {
	
	public static Data readJsonData(String path) {
		
		Data salida = null;
		
		try {
			
			FileReader filereader = new FileReader(path);
			
			JsonObject json =  (JsonObject) Jsoner.deserialize(filereader);	
			
			JsonObject glossary = (JsonObject) json.get("glossary");
			
			System.out.println((String) glossary.get("title"));
			
			
			JsonObject glossdiv = (JsonObject) glossary.get("GlossDiv");			
			JsonObject  glossList = (JsonObject) glossdiv.get("GlossList");			
			JsonObject  glossEntry = (JsonObject) glossList.get("GlossEntry");			
			JsonObject  glossDef = (JsonObject) glossEntry.get("GlossDef");
			
			Data salidax = new Data(
				(String) glossary.get("title"),
				(String) glossdiv.get("title"),
				(String) glossEntry.get("ID"),
				(String) glossEntry.get("SortAs"),
				(String) glossEntry.get("GlossTerm"),
				(String) glossEntry.get("Acronym"),
				(String) glossEntry.get("Abbrev"),
				(String) glossDef.get("para"),
				(ArrayList<String>) glossDef.get("GlossSeeAlso"),
				(String) glossEntry.get("GlossSee")
				);
			
			salida = salidax;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return salida;
		
	}
	
	
	
	

}

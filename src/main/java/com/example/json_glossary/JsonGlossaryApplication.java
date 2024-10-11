package com.example.json_glossary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.utils.ReadJson;
import com.example.utils.WriteJson;

@SpringBootApplication
public class JsonGlossaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonGlossaryApplication.class, args);
		
		String jsonpath = "src/main/resources/static/glossary.json";
		String pathtxt = "src/main/resources/static/salida.txt";

		
		ReadJson readJson = new ReadJson();
		WriteJson writeJson = new WriteJson();
		
		writeJson.writeDataString(readJson.readJsonData(jsonpath), pathtxt);
		
		
		
		
	}

}

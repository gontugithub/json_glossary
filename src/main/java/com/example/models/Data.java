package com.example.models;

import java.util.ArrayList;

public class Data {

	private String glossaryTitle;
	private String glossDivTitle;
	private String id;
	private String sortAs;
	private String glossTerm;
	private String acronym;
	private String abbrev;
	private String para;
	private ArrayList<String> glossSeeAlso;
	private String glossSee;
	

	public Data(String glossaryTitle, String glossDivTitle, String id, String sortAs, String glossTerm, String acronym,
			String abbrev, String para, ArrayList<String> glossSeeAlso, String glossSee) {
		
		this.glossaryTitle = glossaryTitle;
		this.glossDivTitle = glossDivTitle;
		this.id = id;
		this.sortAs = sortAs;
		this.glossTerm = glossTerm;
		this.acronym = acronym;
		this.abbrev = abbrev;
		this.para = para;
		this.glossSeeAlso = glossSeeAlso;
		this.glossSee = glossSee;
	}

	public String getGlossaryTitle() {
		return glossaryTitle;
	}

	public void setGlossaryTitle(String glossaryTitle) {
		this.glossaryTitle = glossaryTitle;
	}

	public String getGlossDivTitle() {
		return glossDivTitle;
	}

	public void setGlossDivTitle(String glossDivTitle) {
		this.glossDivTitle = glossDivTitle;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSortAs() {
		return sortAs;
	}

	public void setSortAs(String sortAs) {
		this.sortAs = sortAs;
	}

	public String getGlossTerm() {
		return glossTerm;
	}

	public void setGlossTerm(String glossTerm) {
		this.glossTerm = glossTerm;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getAbbrev() {
		return abbrev;
	}

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public ArrayList<String> getGlossSeeAlso() {
		return glossSeeAlso;
	}

	public void setGlossSeeAlso(ArrayList<String> glossSeeAlso) {
		this.glossSeeAlso = glossSeeAlso;
	}

	public String getGlossSee() {
		return glossSee;
	}

	public void setGlossSee(String glossSee) {
		this.glossSee = glossSee;
	}

	@Override
	public String toString() {
		return "\n glossaryTitle: " + glossaryTitle + 
				"\n glossDivTitle: " + glossDivTitle + 
				"\n id: " + id + 
				"\n sortAs: "+ sortAs + 
				"\n glossTerm: " + glossTerm + 
				"\n acronym: " + acronym + 
				"\n abbrev: " + abbrev + 
				"\n para: " + para+ 
				"\n glossSeeAlso: " + glossSeeAlso + 
				"\n glossSee: " + glossSee;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

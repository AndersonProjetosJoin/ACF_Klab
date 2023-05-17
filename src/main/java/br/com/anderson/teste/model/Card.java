package br.com.anderson.teste.model;

	public class Card {
	    private String value;
	    private String suit;

	    public Card(String value, String suit) {
	        this.value = value;
	        this.suit = suit;
	    }

	    public int getNumericValue() {
	        switch (value) {
	            case "ACE":
	                return 1;
	            case "KING":
	                return 13;
	            case "QUEEN":
	                return 12;
	            case "JACK":
	                return 11;
	            default:
	                return Integer.parseInt(value);
	        }
	    }
	    // getters e setters
	}
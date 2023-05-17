package br.com.anderson.teste.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.anderson.teste.model.*;


///**
//* Classe controladora da API para jogo de baralho.
//* @author Anderson de C. Fernandes
//*/

	

	@RestController
	public class APIController  {
	    @GetMapping("/play")
	    public String play() {
	        Deck deck = new Deck();
	        deck.fill();
	        deck.shuffle();
	        List<Main> mains = deck.deal();
			return null;
	}

}

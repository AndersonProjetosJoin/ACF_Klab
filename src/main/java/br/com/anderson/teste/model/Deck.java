package br.com.anderson.teste.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.web.client.RestTemplate;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public void fill() {
        RestTemplate restTemplate = new RestTemplate();
        //String url = "https://deckofcardsapi.com/api/deck/new/draw/?count=52";
        String url = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";
        CardsResponse response = restTemplate.getForObject(url, CardsResponse.class);
        for (CardsResponse cardResponse : response.getCards()) {
            Card card = new Card(cardResponse.getValue(), cardResponse.getSuit());
            cards.add(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Main> deal() {
        List<Main> mains = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
        	Main main = new Main();
            for (int j = 0; j < 5; j++) {
                Card card = cards.get(i * 5 + j);
                main.addCard(card);
            }
            mains.add(main);
        }
        return mains;
    }
    
    // getters e setters
}
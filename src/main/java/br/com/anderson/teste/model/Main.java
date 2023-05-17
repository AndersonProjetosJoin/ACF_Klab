package br.com.anderson.teste.model;



import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getSum() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getNumericValue();
        }
        return sum;
    }
    
 // getters e setters
    
}
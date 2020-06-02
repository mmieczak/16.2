package utils;

import data.Card;
import data.Color;
import data.Language;

import java.util.*;

public class Utilities {

    public static Optional<String> getLanguageFromUser() {
        System.out.println("Choose your language for below options: ");
        System.out.println(Arrays.toString(Language.values()));

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        Language[] languages = Language.values();
        try {
            boolean isLanguagePossible = Language.valueOf(userInput).name().equals(userInput);
            if (isLanguagePossible) {
                return Optional.of(Language.valueOf(userInput).name());
            }
            return Optional.empty();
        } catch (IllegalArgumentException ex) {
            return Optional.empty();
        }
    }

    public static List<String> generateDeck(String language) {
        List<String> cardDeck = new ArrayList<>();
        Color[] colors = Color.values();
        Card[] cards = Card.values();
        for (Color color : colors) {
            for (Card card : cards) {
                switch (language) {
                    case "PL" -> cardDeck.add(card.getPlName() + " " + color.getPlName());
                    case "EN" -> cardDeck.add(card.getEngName() + " " + color.getEngName());
                }
            }
        }
        return cardDeck;
    }

    public static void printCardDeck(List<String> cardDeck) {
        for (String card : cardDeck) {
            System.out.println(card);
        }
    }
}

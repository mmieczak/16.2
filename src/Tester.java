import data.Language;
import utils.Utilities;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Tester {

    public static void main(String[] args) {

        Optional<String> getLanguage = Utilities.getLanguageFromUser();
        if (getLanguage.isPresent()) {
            List<String> cardDeck = Utilities.generateDeck(getLanguage.get());
            Utilities.printCardDeck(cardDeck);
        } else {
            System.out.println("No such language. Choose one from below options");
            System.out.println(Arrays.toString(Language.values()));
        }

    }
}



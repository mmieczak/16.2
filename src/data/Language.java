package data;

public enum Language {
    PL("Polish"),
    EN("English");

    private final String description;

    Language(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}

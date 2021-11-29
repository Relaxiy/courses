package lesson7.Task3;

public enum Season {
    WINTER("winter"),
    SUMMER("summer"),
    AUTUMN("autumn"),
    SPRING("spring");

    private String season;

    private Season(String season) {
        this.season = season;
    }

    public String getSeason() {
        return this.season;
    }
}
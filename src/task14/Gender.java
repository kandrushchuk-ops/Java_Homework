package task14;

enum Gender {
    MALE("Мужской"),
    FEMALE("Женский");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

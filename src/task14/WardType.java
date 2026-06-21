package task14;

enum WardType {
    MALE_WARD("Мужская палата"),
    FEMALE_WARD("Женская палата");

    private final String description;

    WardType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

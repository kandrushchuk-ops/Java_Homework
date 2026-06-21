package task14;

import java.util.Objects;

class Patient implements Comparable<Patient> {
    private int id;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private Gender gender;

    Patient(int id, String name, String surname, String diagnosis, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    // Геттеры
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getDiagnosis() { return diagnosis; }
    public int getAge() { return age; }
    public Gender getGender() { return gender; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Пациент [ID=" + id + ", " + name + " " + surname +
                ", диагноз: " + diagnosis + ", возраст: " + age +
                ", пол: " + gender.getDescription() + "]";
    }
}

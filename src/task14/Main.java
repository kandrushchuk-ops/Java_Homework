package task14;

public class Main {
    public static void main(String[] args) {
        // 1.4 Создаём пациентов
        Patient p1 = new Patient(1, "Иван", "Иванов", "Грипп", 25, Gender.MALE);
        Patient p2 = new Patient(2, "Мария", "Петрова", "Грипп", 30, Gender.FEMALE);
        Patient p3 = new Patient(3, "Алексей", "Сидоров", "ОРВИ", 28, Gender.MALE);
        Patient p4 = new Patient(4, "Ольга", "Козлова", "Грипп", 22, Gender.FEMALE);
        Patient p5 = new Patient(5, "Дмитрий", "Новиков", "ОРВИ", 35, Gender.MALE);

        // Создаём дубликат пациента
        Patient duplicate = new Patient(1, "Иван", "Иванов", "Грипп", 25, Gender.MALE);

        // Создаём палаты
        Ward ward1 = new Ward(101, WardType.MALE_WARD);
        Ward ward2 = new Ward(102, WardType.FEMALE_WARD);

        // Добавляем пациентов в палаты
        ward1.addPatientByDiagnosis(p1);
        ward1.addPatientByDiagnosis(p3);
    }}
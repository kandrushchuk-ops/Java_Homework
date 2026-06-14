package task14;

import java.util.*;

class Ward {
    private int number;
    private WardType type;
    private TreeSet<Patient> patients;

    Ward(int number, WardType type) {
        this.number = number;
        this.type = type;
        this.patients = new TreeSet<>();
    }

    public boolean addPatientByDiagnosis(Patient patient) {
        // Проверка пола
        if ((type == WardType.MALE_WARD && patient.getGender() == Gender.FEMALE) ||
                (type == WardType.FEMALE_WARD && patient.getGender() == Gender.MALE)) {
            System.out.println("Ошибка: пациент " + patient.getName() +
                    " не может быть помещён в палату №" + number + " — несовпадение пола!");
            return false;
        }

        // Проверка вместимости
        if (patients.size() >= 3) {
            System.out.println("Ошибка: палата №" + number + " заполнена!");
            return false;
        }

        // Проверка диагноза
        if (patients.isEmpty() || patients.first().getDiagnosis().equals(patient.getDiagnosis())) {
            patients.add(patient);
            System.out.println("Пациент " + patient.getName() + " добавлен в палату №" + number);
            return true;
        } else {
            System.out.println("Ошибка: в палате №" + number +
                    " пациенты с диагнозом '" + patients.first().getDiagnosis() +
                    "', а у нового пациента диагноз '" + patient.getDiagnosis() + "'");
            return false;
        }
    }

    public void printAllPatients() {
        System.out.println("\nПалата №" + number + ", тип: " + type.getDescription());
        System.out.println("Всего пациентов: " + patients.size());
        for (Patient patient : patients) {
            System.out.println("  " + patient);
        }
    }

    public int getPatientCount() {
        return patients.size();
    }

    public Collection<Patient> getPatients() {
        return patients;
    }

    public int getNumber() {
        return number;
    }

    public WardType getType() {
        return type;
    }
}

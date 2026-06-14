package task14;

import java.util.*;

class Department {
    private String name;
    private Set<Ward> wards;


    Department(String name) {
        this.name = name;
        this.wards = new HashSet<>();
    }

    public void addWard(Ward ward) {
        wards.add(ward);
    }

    public int countMales() {
        int count = 0;
        for (Ward ward : wards) {
            for (Patient patient : ward.getPatients()) {
                if (patient.getGender() == Gender.MALE) {
                    count++;
                }
            }
        }
        return count;
    }

    public int countFemales() {
        int count = 0;
        for (Ward ward : wards) {
            for (Patient patient : ward.getPatients()) {
                if (patient.getGender() == Gender.FEMALE) {
                    count++;
                }
            }
        }
        return count;
    }

    public String getName() {
        return name;
    }

    public Set<Ward> getWards() {
        return wards;
    }

    @Override
    public String toString() {
        return "Отделение '" + name + "', палат: " + wards.size();
    }
}

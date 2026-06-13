package task13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupNumber;
    private List<Student> students;

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void removeStudentsByMark(int mark) {
        List<Student> studentsToRemove = new ArrayList<>();

        for (Student student : students) {
            if (student.getAverageMark() < mark) {
                studentsToRemove.add(student);
            }
        }
        students.removeAll(studentsToRemove);
    }

    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.getStudents().addAll(students);
            students.clear();
        }
    }

    @Override
    public String toString() {
        return "Группа №" + groupNumber + ", студентов: " + students.size();
    }

    public double calculateAverageGroupMark() {

        if (students.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;


        for (Student student : students) {
            sum += student.getAverageMark();
        }


        return sum / students.size();
    }
}

package task13;

class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ivan", "Ivanov", "18-05-1999", "Minsk", 2);
        Student student3 = new Student("Oleg", "Sidorov", "18-05-1989", "Minsk", 4);
        Student student4 = new Student("Vasya", "Pupkin", "18-05-1999", "Minsk", 5);



        Group group1 = new Group(101);
        Group group2 = new Group(102);


        group1.getStudents().add(student1);
        group2.getStudents().add(student3);
        group2.getStudents().add(student4);


        double avg1 = group1.calculateAverageGroupMark();
        double avg2 = group2.calculateAverageGroupMark();


        System.out.println("Средний балл группы 101: " + avg1);
        System.out.println("Средний балл группы 102: " + avg2);


        System.out.println("\nУдаляем из группы 101 студентов с баллом < 4.0:");
        System.out.println("До удаления в группе 101 было: " + group1.getStudents().size() + " студентов");
        group1.removeStudentsByMark(4);
        System.out.println("После удаления в группе 101 осталось: " + group1.getStudents().size() + " студентов");


        System.out.println("Проверяем перенос студентов:");


        Group smallGroup = new Group(103);
        Student student5 = new Student("Anna", "Petrova", "10-10-2000", "Minsk", 3.5);
        smallGroup.getStudents().add(student5);

        System.out.println("Маленькая группа 103 до переноса: " + smallGroup.getStudents().size() + " студентов");
        System.out.println("Группа 102 до переноса: " + group2.getStudents().size() + " студентов");


        smallGroup.transferToGroup(group2);

        System.out.println("Маленькая группа 103 после переноса: " + smallGroup.getStudents().size() + " студентов (должно быть 0)");
        System.out.println("Группа 102 после переноса: " + group2.getStudents().size() + " студентов (должно быть 3)");


        System.out.println("Проверяем перенос из полной группы 102 в пустую 103:");
        System.out.println("До переноса в группе 102: " + group2.getStudents().size() + " студентов");
        group2.transferToGroup(smallGroup);
        System.out.println("После попытки переноса в группе 102: " + group2.getStudents().size() + " студентов (количество не изменилось)");
    }
}

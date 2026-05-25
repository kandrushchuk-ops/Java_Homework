package task7;

public class Student {
    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int averageMark;

    public Student() {
        System.out.println("Конструктор без параметров");
    }

    public Student(int id, String name, String surname, String faculty, int course, String group, int averageMark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void info() {
        System.out.println("id: " + id + ", name: " + name + ", surname: " + surname + ", faculty: " + faculty + ", course: " + course + ", group: " + group + ", averageMark: " + averageMark);
    }

    public void changeGroup(String newGroup) {
        if (newGroup != null) {
            this.group = newGroup;
        }
    }

    public String getGroup() {
        return this.group;
    }

    public void updateStudent(int newMark, String newGroup) {
        if (newGroup != null) {
            this.group = newGroup;
        } else {
            System.out.println("Ошибка: группа не может быть null.");
            return;
        }
        this.averageMark = newMark;
    }

    public static Student[] getStudents(Student[] students, int mark) {

        int count = 0;
        for (Student student : students) {
            if (student != null && student.averageMark > mark) {
                count++;
            }
        }

        Student[] result = new Student[count];


        int index = 0;
        for (Student student : students) {
            if (student != null && student.averageMark > mark) {
                result[index] = student;
                index++;
            }
        }

        return result;
    }


}


//Задача
//1.  Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ),
// course(тип int) , Группа(тип String), средняя оценка (тип int).Инициализацию студента в классе main выполнять через конструктор
// с параметрами. Также определите конструктор без параметров.
//2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
//3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)
//4. Создать метод, который будет возвращать текущую группу с
//тудента.
//5. Создать метод, который будет изменять оценку студента и группу
//студента.
//6. В классе main создать массив из пяти студентов.
//        7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов,
//        массив студентов у которых оценка выше переданной оценке в методе. (Сигнатура метода будет выглядеть так
//        PublicStudent[]getStudents(Students[] students, int mark)
//8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом студенте метод info,
// который вы создавали в задании 2

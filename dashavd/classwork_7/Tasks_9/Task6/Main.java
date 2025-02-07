package Tasks_9.Task6;

public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("Тимур", "Блатной", "52", 4.5), new Aspirant("Аня", "Жиескина", "53", 5, "Чототам")};

        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " получает стипендию: " + student.getScholarship());
        }
    }
}
package Tasks_9.Task1;

public class Main {
    public static void main(String[] args) {
        Profession[] professions = {new Doctor(), new Teacher()};
        for (Profession profession : professions) {
            profession.work();
        }
    }
}
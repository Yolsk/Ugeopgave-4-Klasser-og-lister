package Opgave1;

public class Main {
    public static void main() {

        Student student1 = new Student("Isa", 31);
        Student student2 = new Student("Jakob", 35);
        Student student3 = new Student("Simon", 29);

        Student[] students = {student1, student2, student3};

        for (Student s : students) {
            s.printInfo();
        }

        Student oldest = students[0];

        for (Student s : students) {
            if (s.age > oldest.age) {
                oldest = s;
            }
        }
        System.out.println("The oldest is:");
        oldest.printInfo();
    }
}

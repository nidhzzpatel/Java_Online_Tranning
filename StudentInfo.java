class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        this.name = "Unknown";
    }

    public void printName() {
        System.out.println("Name: " + name);
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student("Jay");
        Student student2 = new Student();

        student1.printName();
        student2.printName();
    }
}
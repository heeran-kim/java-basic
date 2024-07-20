package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "Student1";
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student();
        student2.name = "Student2";
        student2.age = 20;
        student2.grade = 70;

        Student student3;
        student3 = new Student();
        student3.name = "Student3";
        student3.age = 23;
        student3.grade = 60;

        System.out.println("Name: " + student1.name + " Age: " + student1.age + " Grade: " + student1.grade);
        System.out.println("Name: " + student2.name + " Age: " + student2.age + " Grade: " + student2.grade);
        System.out.println("Name: " + student3.name + " Age: " + student3.age + " Grade: " + student3.grade);

        // address
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}

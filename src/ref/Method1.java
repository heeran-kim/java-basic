package ref;

public class Method1 {

    public static void main(String[] args) {
        /*Student student1 = new Student();
        Student student2 = new Student();
        
        initValue(student1, "Student1", 20, 40);
        initValue(student2, "Student2", 17, 80);*/

        Student student1 = createStudent("Student1", 20, 40);
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("Student2", 17, 80);
        System.out.println("student2 = " + student2);

        printValue(student1);
        printValue(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        System.out.println("student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void initValue(Student s, String name, int age, int grade){
        s.name = name;
        s.age = age;
        s.grade = grade;
    }
    
    static void printValue(Student s){
        System.out.println("s.name = " + s.name);
        System.out.println("s.age = " + s.age);
        System.out.println("s.grade = " + s.grade);
    }
}

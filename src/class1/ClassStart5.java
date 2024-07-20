package class1;

public class ClassStart5 {

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

//        Student[] students = new Student[] {student1, student2, student3};
        Student[] students = {student1, student2, student3};
        /*students[0] = student1;
        students[1] = student2;
        students[2] = student3;*/

        System.out.println("Name: " + student1.name + " Age: " + student1.age + " Grade: " + student1.grade);
        System.out.println("Name: " + student2.name + " Age: " + student2.age + " Grade: " + student2.grade);
        System.out.println("Name: " + student3.name + " Age: " + student3.age + " Grade: " + student3.grade);

        /*for (int i = 0; i < students.length; i++){
            System.out.println("Name: " + students[i].name + " Age: " + students[i].age + " Grade: " + students[i].grade);
        }

        for (int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println("Name: " + s.name + " Age: " + s.age + " Grade: " + s.grade);
        }
        */
        for (Student s: students) { //shortcut: iter
//            Student s = students[i];
            System.out.println("Name: " + s.name + " Age: " + s.age + " Grade: " + s.grade);
        }
    }
}

package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"Student1", "Student2", "Student3"};
        int[] studentAges = {15, 20, 23};
        int[] studentGrades = {90, 70, 60};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Name: " + studentNames[i] + " Age: " + studentAges[i] + " Grade: " + studentGrades[i]);
        }
    }
}

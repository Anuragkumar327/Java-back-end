public class Student {
    // static variable
    static String schoolName = "GreenLand";

    // Non-static variables
    String studentName = "Anurag";
    int rollNumber = 233;

    // Static method
    static void displaySchoolInfo() {
        System.out.println("School: " + schoolName);
    }

    // Non-static method
    void displayStudentInfo() {
        System.out.println("Student: " + studentName);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("School: " + schoolName);
    }

    public static void main(String[] args) {

        // Access static member using class name
        System.out.println("School Name: " + Student.schoolName);

        Student.displaySchoolInfo();

        // Create object for non-static members
        
        Student s = new Student();
        s.displayStudentInfo();
    }
}

// STATIC KEY WORD IS USED IN THIS
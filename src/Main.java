public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Student student1 = new Student("giang", "19020807", "abc");
        student1.setGroup("k64H");
        Student student2 = new Student("giang1", "1313134", "kas");
        student2.setGroup("k535");
        Student student3 = new Student("giang2", "103i13", "asdad");
        student3.setGroup("k64H");
        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);
        studentManagement.addStudent(student3);

        System.out.println(studentManagement.studentsByGroup());
    }
}

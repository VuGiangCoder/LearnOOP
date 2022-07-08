public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Student student1 = new Student("Vu Van A", "19020807", "vnu.vvv");
        student1.setGroup("K64H");
        Student student2 = new Student("Vu Van VB", "1902087", "vnu.vv");
        student1.setGroup("K64CB");
        Student student3 = new Student("Vu Van VC", "190208", "vnu.vv");
        student1.setGroup("K64H");
        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);
        studentManagement.addStudent(student3);

        System.out.println(studentManagement.studentsByGroup());
    }
}

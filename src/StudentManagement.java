public class StudentManagement {

    private Student[] student = new Student[100];

    /**
     * Constructor 1
     */
    public StudentManagement() {
    }

    /**
     * sameGroup(s1,s2)
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        }
        return false;
    }

    /**
     * Add Student to Array
     *
     * @param newStudent
     */
    public void addStudent(Student newStudent) {
        for (int i = 0; i < 100; i++) {
            if (student[i] == null) {
                student[i] = new Student(newStudent);
                break;
            }
        }
    }

    /**
     * Sort Student by group
     *
     * @return
     */
    public String studentsByGroup() {
        String s = "";
        int leng = 1;
        String[] groupStudent = new String[100];
        groupStudent[0] = student[0].getGroup();
        for (int i = 1; i < 100; i++) {
            if (student[i] != null) {
                int j = 0;
                while (groupStudent[j] != null) {
                    if (student[i].getGroup().equals(groupStudent[j])) {
                        break;
                    }
                    j++;
                }
                if (j == leng) {
                    groupStudent[leng] = student[i].getGroup();
                    leng++;
                }
            } else {
                break;
            }

        }
        for (int i = 0; i < 100; i++) {
            s = s + groupStudent[i] + "\n";
            for (int j = 0; j < 100; j++) {
                if (student[j] != null) {
                    if (student[j].getGroup().equals(groupStudent[i])) {
                        s = s + student[i].getName() + " - " + student[i].getId() + " - " + student[i].getGroup() + " - " + student[i].getEmail() + "\n";
                    }
                } else break;

            }


        }

        return s;
    }

    /**
     * Remove Student by id from Array
     *
     * @param id
     */
    public void removeStudent(String id) {
        for (int i = 0; i < 100; i++) {
            if (student[i].getId().equals(id)) {
                for (int j = i; j < 100; j++) {
                    student[j] = student[j + 1];
                }
                break;
            }
        }
    }


}



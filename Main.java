public class Main {
    public static void main(String[] args) {

        Course math = new Course("Matematik", "MAT101", "MAT");
        Course physics = new Course("Fizik", "FZK101", "FZK");
        Course chemistry = new Course("Kimya", "KMY101", "KMY");

        Teacher teacherMahmut = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher teacherFatma = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher teacherAli = new Teacher("Ali Veli", "90550000002", "KMY");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student studentSaban = new Student("Şaban", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student studentGüdük = new Student("Güdük Necmi", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student studentHayta = new Student("Hayta İsmail", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

    }
}

public class Student {
    String name, studentNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String studentNo, Course math,Course physics,Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.math.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.physics.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.chemistry.note = kimya;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.physics.note + this.chemistry.note + this.math.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Grade : " + this.math.note);
        System.out.println("Physics Grade : " + this.physics.note);
        System.out.println("Chemistry Grade : " + this.chemistry.note);
    }

}

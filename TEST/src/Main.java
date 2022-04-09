public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher( "Mahmut Hoca", "TRH", "+905372434545");
        Teacher t2 = new Teacher( "Graham Bell","FZK","0000");
        Teacher t3 = new Teacher("Kulyutmaz","BIO","1111");
        Teacher t4 = new Teacher("sozlu","Sozlu","1234");

        Course tarih = new Course("Tarih","101","TRH",t1);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102","FZK",t2);
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "102","BIO",t3);
        biyo.addTeacher(t3);

        Course sozlu = new Course ("Sozlu","2","Sozlu",t4);
        sozlu.addTeacher(t4);

        Student s1 = new Student ("inek Saban","123","4",tarih,fizik,biyo,sozlu);
        s1.addBulkExamBulk(100,92,50,60);
        s1.isPass();

        Student s2 = new Student("DUduk Necmi", "444","4",tarih,fizik,biyo,sozlu);
        s2.addBulkExamBulk(100,43,42,80);
        s2.isPass();
    }
}

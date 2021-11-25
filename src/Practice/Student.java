package Practice;

public class Student {
    public int noOfStudent;
    public String name;
    public String uniName;

    @Override
    public String toString() {
        return "Student{" +
                "noOfStudent=" + noOfStudent +
                ", name='" + name + '\'' +
                ", uniName='" + uniName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.uniName = "UB";
        s1.noOfStudent = 1;

        System.out.println(s1);
        Student s2 = new Student();
        s2.name = "Nick";
        s2.uniName = "SUBY";
        s2.noOfStudent = 2;
        System.out.println(s2);

        System.out.println(s1);

        Student s3 = new Student();
        s3.name = "Toby";
        s3.uniName = "CUNY";
        s3.noOfStudent = 3;
        System.out.println(s3);

        System.out.println();
        System.out.println(s2);

    }
}

public class Student extends Person {
    int Rollno;

    public void SetRollno(int r) {
        Rollno = r;
    }

    public int getRollno() {
        return (Rollno);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(24);
        s1.setName("Aman kr singh");
        s1.SetRollno(24);
        System.out.println("Age :" + s1.getAge());
        System.out.println("Name :" + s1.getName());
        System.out.println("Roll :" + s1.getRollno());
    }

}

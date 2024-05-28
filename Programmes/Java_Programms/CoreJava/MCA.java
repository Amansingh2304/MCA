class Galgotias {
    int a = 55;
}

public class MCA extends Galgotias {
    int a = 35;

    void show(int a) {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        MCA p = new MCA();
        p.show(25);
    }
}

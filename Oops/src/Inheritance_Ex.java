import org.w3c.dom.ls.LSOutput;

public class Inheritance_Ex {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(9,5);
        int r3 = obj.multi(4,5);
        int r4 = obj.div(15,4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 );
    }

}

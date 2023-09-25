package lectie;

public class IndexOf {
    public static void main(String[] args) {
        String s = "Acum este timpul" +
                " pentru programare Java.este";
        System.out.println(s);
        System.out.println("indicele lui m = " + s.indexOf('m'));
        System.out.println("lastIndexOf(m)" + s.lastIndexOf('m'));
        System.out.println("indexOf(este)) = " + s.indexOf("este"));
        System.out.println("lastIndexOf(este)" + s.lastIndexOf("este"));
        System.out.println("indexOf(a, 30)= " + s.indexOf('a', 33));
        System.out.println("lastIndexOF (e, 41) = " + s.lastIndexOf('e', 41));
        System.out.println("indexOf(pentru, 35) = " + s.indexOf("pentru", 35));
        System.out.println("lastindexOf(pentri, 20) = " + s.lastIndexOf("pentru", 20));

    }
}

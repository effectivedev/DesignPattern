package io.github.effectivedev.designpattern.creation.prototype;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Prototype p1 = new Prototype(10, "james");
        Prototype p2 = p1;
        Prototype p3 = (Prototype) p1.clone();

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode()); //swallow copy p1==p2
        System.out.println(p3.hashCode()); //deep copy   p1!=p3

        System.out.println("\n"+p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("\n############################");
        System.out.println("##### p2.setName(\"tommy\") #####");
        p2.setName("tommy"); //p3's name is not changed
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("############################\n");
        System.out.println("############################");
        System.out.println("### p3.setName(\"jake\") ######");
        p3.setName("jake");//only p3's name is changed
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("############################");
    }
}

package defualt;

public interface Interface2 extends Interface1 {

    default void method()
    {
        System.out.println(Interface2.class);
    }
}

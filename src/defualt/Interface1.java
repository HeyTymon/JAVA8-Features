package defualt;

public interface Interface1 {

    default void method()
    {
        System.out.println(Interface1.class);
    }
}

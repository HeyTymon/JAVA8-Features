package defualt;

public class Client12 implements Interface1, Interface2 {

    //1 -> class
    //2 -> child interface
    //3 -> parent interface

    public void method()
    {
        System.out.println(Client12.class);
    }

    public static void main(String[] args) {
        Client12 client12 = new Client12();

        client12.method();
    }
}

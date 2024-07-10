package dio.gof.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        SingletonEager eager = SingletonEager.getInstancia();
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();

        System.out.println(lazy);
        System.out.println(eager);
        System.out.println(holder);
    }
}

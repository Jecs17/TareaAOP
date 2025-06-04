public class Singlenton{
        private static Singlenton instance = new Singlenton();

    private Singlenton() {} // Constructor privado

    public static Singlenton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Única instancia en Singleton");
    }
}

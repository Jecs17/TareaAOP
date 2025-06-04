public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Obtener la única instancia de SingleObject
        Singlenton object = Singlenton.getInstance();

        // Usar su método
        object.showMessage();
    }
}

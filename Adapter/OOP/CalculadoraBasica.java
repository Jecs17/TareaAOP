public class CalculadoraBasica {
    private Calculadora calculadora;

    public CalculadoraBasica(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    public void mostrarRaizCuadrada(double numero){
        System.out.println("La raiz cuadrada de " + numero + " es: " + calculadora.calcularRaizCuadrada(numero));
    }

    public static void main(String[] args) {
        RaizAdapter adapter = new RaizAdapter(new CalculadoraPotencia());
        CalculadoraBasica calculadoraB = new CalculadoraBasica(adapter);

        calculadoraB.mostrarRaizCuadrada(25);
    }
}
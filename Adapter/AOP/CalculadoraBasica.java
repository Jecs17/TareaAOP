package Adapter.AOP;

public class CalculadoraBasica {
    private Calculadora calculadora;

    public CalculadoraBasica(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    public void mostrarRaizCuadrada(double numero){
        System.out.println("La raiz cuadrada de " + numero + " es: " + calculadora.calcularRaizCuadrada(numero));
    }

    public static void main(String[] args) {
        // Ya no necesitamos RaizAdapter aquí, solo una Calculadora "vacía"
        Calculadora calculadora = new Calculadora() {
            @Override
            public double calcularRaizCuadrada(double numero) {
                // Este método será interceptado por el aspecto
                return 0;
            }
        };

        CalculadoraBasica calculadoraB = new CalculadoraBasica(calculadora);
        calculadoraB.mostrarRaizCuadrada(25);
    }
}

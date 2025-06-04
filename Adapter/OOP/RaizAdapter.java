public class RaizAdapter implements Calculadora{
    private CalculadoraPotencia calculadoraP;

    public RaizAdapter(CalculadoraPotencia calculadoraP){
        this.calculadoraP = calculadoraP;
    }

    @Override
    public double calcularRaizCuadrada(double numero){
        return calculadoraP.calcularPotencia(numero, 0.5);
    }
}
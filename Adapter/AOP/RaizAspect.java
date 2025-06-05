package Adapter.AOP;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class RaizAspect {

    private CalculadoraPotencia calculadoraPotencia = new CalculadoraPotencia();

    @Around("execution(double Calculadora.calcularRaizCuadrada(double)) && args(numero)")
    public double calcularRaizConPotencia(ProceedingJoinPoint pjp, double numero) throws Throwable {
        // Reemplazamos la llamada con el cálculo de potencia
        return calculadoraPotencia.calcularPotencia(numero, 0.5);
    }
}



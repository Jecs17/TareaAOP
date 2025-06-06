package Singleton.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class SingletonAspect {
    private ConexionBaseDeDatos instancia;

    @Around("execution(Adapter.SingletonAOP.ConexionBaseDeDatos.new(..)) && args(cadenaConexion)")
    public Object interceptarConstructor(ProceedingJoinPoint pjp, String cadenaConexion) throws Throwable {
        if (instancia == null) {
            instancia = new ConexionBaseDeDatos(cadenaConexion);
        } else {
            System.out.println("Ya existe una instancia. Usando la existente.");
        }
        return instancia;
    }
}

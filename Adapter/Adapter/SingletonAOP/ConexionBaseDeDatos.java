package Adapter.SingletonAOP;

public class ConexionBaseDeDatos {
    private String cadenaConexion;

    public ConexionBaseDeDatos(String cadenaConexion) {
        this.cadenaConexion = cadenaConexion;
        System.out.println("Conectando a la base de datos con: " + cadenaConexion);
    }

    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando consulta: " + consulta);
    }
}


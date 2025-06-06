package Singleton.OOP;
public class ConexionBaseDeDatos{
    // Instancia única (Singleton)
    private static ConexionBaseDeDatos instancia;

    // Simulación de una cadena de conexión
    private String cadenaConexion;

    // Constructor privado para evitar instanciación externa
    private ConexionBaseDeDatos(String cadenaConexion) {
        this.cadenaConexion = cadenaConexion;
        System.out.println("Conectando a la base de datos con: " + cadenaConexion);
    }

    // Método estático para obtener la única instancia
    public static ConexionBaseDeDatos getInstancia(String cadenaConexion) {
        if (instancia == null) {
            instancia = new ConexionBaseDeDatos(cadenaConexion);
        } else {
            System.out.println("Ya existe una conexión, reutilizando la instancia.");
        }
        return instancia;
    }

    // Método de ejemplo para ejecutar una consulta
    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando consulta: " + consulta);
    }
}
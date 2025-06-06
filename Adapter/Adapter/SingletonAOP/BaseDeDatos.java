package Adapter.SingletonAOP;

public class BaseDeDatos {
    public static void main(String[] args) {
        ConexionBaseDeDatos db1 = new ConexionBaseDeDatos("jdbc:mysql://localhost:3306/mi_basedatos");
        db1.ejecutarConsulta("SELECT * FROM usuarios");

        ConexionBaseDeDatos db2 = new ConexionBaseDeDatos("otraCadenaDeConexion");
        db2.ejecutarConsulta("SELECT * FROM productos");

        System.out.println("¿db1 y db2 son la misma instancia? " + (db1 == db2));
    }
}

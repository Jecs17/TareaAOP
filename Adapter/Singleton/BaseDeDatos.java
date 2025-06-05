package Adapter.Singleton;
public class BaseDeDatos {
    public static void main(String[] args) {
        ConexionBaseDeDatos db1 = ConexionBaseDeDatos.getInstancia("jdbc:mysql://localhost:3306/mi_basedatos");
        db1.ejecutarConsulta("SELECT * FROM usuarios");

        ConexionBaseDeDatos db2 = ConexionBaseDeDatos.getInstancia("otraCadenaDeConexion");
        db2.ejecutarConsulta("SELECT * FROM productos");

        System.out.println(db1 == db2); // true: misma instancia
        }
}
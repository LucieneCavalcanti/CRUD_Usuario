package data;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexao {
    private Connection conexao;
    public Connection getConexao(){
        return conexao;
    }
    public Conexao() throws Exception{
        //String url="jdbc:sqlserver://PROFLAB04A\\MSSQLSERVER01:1433;databaseName=bdFatec;trustServerCertificate=true;encript=false";
        String url="jdbc:mysql://localhost:3306/bdFatec?zeroDateTimeBehavior=CONVERT_TO_NULL";
        //String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String driver="com.mysql.cj.jdbc.Driver";
        String usuario="root";//"aluno"; <-- SQL Server
        String senha="%Fatecrp!";//"dba"; <-- SQL Server
        Class.forName(driver);
        conexao = DriverManager.getConnection
        (url, usuario, senha);
    }
}

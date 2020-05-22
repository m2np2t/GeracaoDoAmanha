package Model;

/**
 *
 * @author pedro
 */

import java.sql.*;

public class Conexao {
    // método responsavel por estabelecer a conexão com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        // a linha abaixo chama o drive para conexao
        final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        
        // armazenando informações referente ao banco
        final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;databaseName=GeracaoDoAmanha;user=project;password=GeracaoDoAmanha@2020";
        
        // estabelecendo conexão com o banco
        try{
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(DATABASE_URL);
            return conexao;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}


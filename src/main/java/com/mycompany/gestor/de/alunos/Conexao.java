package com.mycompany.gestor.de.alunos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
     private static final String URL = "Jdbc:mysql://localhost:3306/gestor_de_alunos";
            
  private static final String USER = "root";
          
  private static final String PWD = "";
  
  
  
  public static Connection Ligacao() throws SQLException{
      
      try{
          
          Connection conn = DriverManager.getConnection(URL, USER, PWD);
          System.out.println("Conexão Estabelecida");
          return conn;
          
          
      }catch(SQLException e){
          System.out.println("Error Connection");
          e.printStackTrace();
      }
      return null;
              
      
  }
    
}

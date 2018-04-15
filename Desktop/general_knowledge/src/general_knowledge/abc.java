/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general_knowledge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NiA
 */
class abc{
    public abc()throws SQLException{
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/General_knowledge_quiz", "Isha", "Isha");
    System.out.println("Connection created");
    
}
}

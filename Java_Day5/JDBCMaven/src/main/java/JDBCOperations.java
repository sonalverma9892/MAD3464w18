/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author 726246
 */
public class JDBCOperations {
    static Connection conn;
    static PreparedStatement stmt;
    static ResultSet rs;
    static String USER = "root";
    static String PASS = "";
    
    public static void main(String [] args){
        connectDB();
        selectDB();
        
        insertDB();
        selectDB();
        
        updateDB();
        selectDB();
        
        deleteDB();
        selectDB();
        
        closeDB();
        
    }
    
    static void connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/MADWinter18", USER , PASS);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    static void insertDB(){
        try{
            stmt = conn.prepareStatement("insert into Person values (?,?,?,?)");
            stmt.setInt(1, 102); //1 specifies first parameter in query.
            stmt.setString(2, "Sonal");
            stmt.setString(3, "Verma");
            stmt.setInt(4, 12);
            
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");
        }catch(SQLException se){
            se.printStackTrace();
        }
        
    }
    
    static void selectDB(){
        try{
            stmt = conn.prepareStatement("SELECT * FROM Person");
//            stmt.execute();
            rs = stmt.executeQuery();
            
            while(rs.next()){
                System.out.println("ID : " + rs.getInt(1) + " FirstNAme : " + rs.getString("FirstName") + "LastName : " + rs.getString("LastName") + "Age : " + rs.getInt("Age"));
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    static void deleteDB(){
         try{
            stmt = conn.prepareStatement("DELETE FROM Person WHERE ID = ?");
            stmt.setInt(1, 102);
            
            int i = stmt.executeUpdate();
            System.out.println(i + " records deleted");
            
        }catch(SQLException se){
            se.printStackTrace();
        }
        
        
    }
    
    static void updateDB(){
         try{
            stmt = conn.prepareStatement("UPDATE Person SET FirstName = ?, LastName = ?, Age = ? WHERE ID = ?");
           
            stmt.setString(1, "Sonu");
            stmt.setString(2, "Macwan");
            stmt.setInt(3, 25);
            stmt.setInt(4, 102); //1 specifies first parameter in query.
            
            int i = stmt.executeUpdate();
            System.out.println(i + " records Updated");
            
        }catch(SQLException se){
            se.printStackTrace();
        }  
    }
    
     static void closeDB(){
            try{
                if (conn!= null){
                    conn.close();
                }
            }
            catch(SQLException e){
                e.printStackTrace();;
            }
        }
}

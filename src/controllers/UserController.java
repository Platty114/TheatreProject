package controllers;

import model.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Vector;

public class UserController {
   
    private DBController onlyInstance;

    public UserController(){
       this.onlyInstance = DBController.getConnection();
    }

    private HashMap<String, String> loginInfos = new HashMap<String, String>();

    private HashMap<String, User> userData = new HashMap<String, User>();

    //this map will be used for validating login info quickly. Use next function for more detailed user info.
    public void pullLoginInfoValidation(){
        String sql = "select * from userdb";
        PreparedStatement p = null;
        ResultSet rs = null;

        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();
            
            while (rs.next()){
                loginInfos.put(rs.getString("email"), rs.getString("password"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void pullUserInfo(){
        String sql = "select * from userdb";
        PreparedStatement p = null;
        ResultSet rs = null;

        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                // User tempUser = new User();
                // tempUser.setFirstName(rs.getString("Fname"));
                // tempUser.setLastName(rs.getString("Lname"));
                // tempUser.setEmail(rs.getString("email"));
                // //this doesn't work yet
                // tempUser.setPhone(rs.getString("phone"));
                
                // userData.put(tempUser.getEmail(), tempUser);
                String fName = rs.getString("Fname");
                String lName = rs.getString("Lname");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                userData.put(email, new User(fName, lName, email, phone));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void populateUsers(Vector<RegisteredUser> users){
        String sql = "select * from userdb";
        PreparedStatement p = null;
        ResultSet rs = null;

        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                String fName = rs.getString("Fname");
                String lName = rs.getString("Lname");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String password = rs.getString("password");
                users.add(new RegisteredUser(fName, lName, email, phone, password));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    //vector<string> of user emails for verifying if someone is a user
    //add users to data base based on 
    /*/
    PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("insert into product(productID,description,quantity,price,discount) values(?,?,?,?,?)");
           pstmt.setString(1, productId);
           pstmt.setString(1, desc);
           //same for all statement
           pstmt.executeUpdate();
           pstmt.close();

    */

}

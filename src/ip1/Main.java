
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ip1;


import java.sql.*;

/**
 *
 * @author SVM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

  try{
            Class.forName("java.sql.Driver");
            {Connection con = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
            Statement st= con.createStatement();
            String cd = "create database mukul;";
            st.executeUpdate(cd);
      }
  Connection c = DriverManager.getConnection("jdbc:mysql://localhost/mukul","root","");
            Statement s= c.createStatement();
           String u = "use mukul;";
            s.executeUpdate(u);
          
            
            //table password
            String ct = "create table k (UNAME varchar(10),pwd varchar(10),name varchar(10));";
            s.executeUpdate(ct);
            
            
            //table que
            String ctq = "create table que (Q varchar(50),A varchar(10));";
            s.executeUpdate(ctq);
            
            
            //table newcustomer
            String ctnc = "create table nc (sno integer(1) not null unique,name varchar(10) not null,phone integer(10) not null,address varchar(10),city varchar(10));";
            s.executeUpdate(ctnc);
                      
                      
            //table employees
            String ctempl =  "create table employees(ENO integer(10)not null unique ,EMPNAME varchar(10),JOB varchar(10),HIREDATE varchar(10),SALARY integer(10));";
            s.executeUpdate(ctempl);
            
            
            //table stocks
            String ctstks = "create table stock (PCODE integer(10)not null unique,PRODUCT varchar(10),UNITPRICE integer(10),QUANTITYADDED integer(10),STOCKAVAILABLE varchar(10));";
            s.executeUpdate(ctstks);
           
            
             //table sales
            String ctsal = "create table sales (SNO integer(10)not null unique,NAME varchar(10),SALES varchar(10),LOCID integer(10),CITY varchar(10));";
            s.executeUpdate(ctsal);
           
                      
             //table supplier
             String ctsup = "create table sup (SCODE integer(10)not null unique,PRODUCT varchar(10),SUPNAME varchar(10),QUANTITY integer(10),CITY varchar(10),PRICE integer(10));";
            s.executeUpdate(ctsup);
           
            
             //table wages
             String ctwag = "create table wages (ENAME varchar(10)not null unique,BANKNAME varchar(10),ACCOUNTNO integer(10),SALARY integer(10),CITY varchar(10));";
            s.executeUpdate(ctwag);
           
            
             //table food
             String ctf = "create table food (FCODE integer(10)not null unique,FOODNAME varchar(10),QTY integer(10),SUPPLIER varchar(10),PRICE integer(10));";
            s.executeUpdate(ctf);
           
            
            
            
            
            
             //table rate
            String ctr = "create table rate (name varchar(50),star varchar(10));";
            s.executeUpdate(ctr);
           
            
             //table bill
            String ctb = "create table bill (food varchar(10),price integer(10),qty integer(10));";
            s.executeUpdate(ctb);
           
            
            
  }    catch (Exception e){
        }
new database().setVisible(false);
   } }



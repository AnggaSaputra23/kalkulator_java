/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Asus
 */
public class CRUD {
    private Double angka1, angka2, hasil;
    private String operator;
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpsmt;
    private Statement CRUDstat;
    private ResultSet CRUDhasil;
    private String CRUDquery;
    
    public CRUD(){
        Koneksi connection = new Koneksi();
        CRUDkoneksi = connection.getKoneksi();
    }
    
    public void setAngka1(Double angka1){
        this.angka1 = angka1;
    }
    
    public Double getAngka1(){
        return angka1;
    }
    public void setAngka2(Double angka2){
        this.angka2 = angka2;
    }
    
    public Double getAngka2(){
        return angka2;
    }
    public void setHasil(Double hasil){
        this.hasil = hasil;
    }
    
    public Double getHasil(){
        return hasil;
    }
    
    public void setOperator(String operator){
        this.operator = operator;
    }
    
    public String getOperator(){
        return operator;
    }
    
    public ResultSet tampilData(){
        CRUDquery = "select * from kalku";
        
        try{
            CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return CRUDhasil;
    }
    
    public void simpanData(Double angka1, Double angka2, String operator, Double hasil){
        CRUDquery = "insert into kalku (angka1, angka2, operator, hasil) values(?, ?, ?, ?)";
        
        try{
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setDouble(1, angka1);
            CRUDpsmt.setDouble(2, angka2);
            CRUDpsmt.setString(3, operator);
            CRUDpsmt.setDouble(4, hasil);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
}

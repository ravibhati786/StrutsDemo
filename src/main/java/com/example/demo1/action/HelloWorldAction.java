package com.example.demo1.action;

import com.example.demo1.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import static java.util.jar.Pack200.Packer.ERROR;

public class HelloWorldAction {
    private String name;
    private ArrayList<Employee> records = new ArrayList<>();

    public ArrayList<Employee> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Employee> records) {
        this.records = records;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception{
        String ret = ERROR;
        Connection con = null;
        try{
            String URL = "jdbc:mysql://localhost/strutsDemo";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, "root", "");
            String sql = "SELECT * FROM Employee";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                Employee emp = new Employee();
                emp.setId(rs.getInt(1));
                emp.setName(rs.getString(2));
                emp.setEmail(rs.getString(3));
                emp.setPhone(rs.getString(4));
                records.add(emp);
            }
            con.close();
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "success";
    }
}

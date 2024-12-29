package myDataBase;

import java.sql.*;
import java.util.*;

public class practis {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3327/prctis","root","Anmol0001");
		
		// if we don't know about feild name 
//		String string="insert into emp values(?,?,?,?)";
//		PreparedStatement p=con.prepareStatement(string);
//		p.setInt(1, 1);
//		p.setString(2, "Mohan");
//		p.setString(3, "Sale");
//		p.setInt(4, 55000);
//		int i=p.executeUpdate();
//		System.out.println("Data inserted");
		
		// we know feild name
//		String string="insert into emp values(2,'Sohan','IT',70000)";
//		PreparedStatement p=con.prepareStatement(string);
//		int i=p.executeUpdate();
//		System.out.println("Data Inserted");
		// use statement for insert		
		Statement s=con.createStatement();
		String string="insert into emp values(3,'Rohan','costumer_support',35000)";
		s.executeUpdate(string);
		System.out.println("data inserted");
//		
//		// to insert continuesly
//		String string="insert into emp values(?,?,?,?)";
//		PreparedStatement p=con.prepareStatement(string);
//		Scanner sc=new Scanner(System.in);
//		while(true)
//		{
//			System.out.println("Enter Employee ID : ");
//			int eid=sc.nextInt();
//			System.out.println("Enter Employee Name: ");
//			String nm=sc.next();
//			System.out.println("Enter Department : ");
//			String dept=sc.next();
//			System.out.println("Enter Salary : ");
//			int sal=sc.nextInt();
//			
//			p.setInt(1, eid);
//			p.setString(2, nm);
//			p.setString(3, dept);
//			p.setInt(4, sal);
//			
//			System.out.println("Data inserted");
//			System.out.println();
//			int i=p.executeUpdate();
//			System.out.println("Do you want to Continue [yes/no]");
//			String opt=sc.next();
//			if(opt.equalsIgnoreCase("no"))
//			{
//				break;
//			}
//			
//		}
//
//			// see/get/retrive/view/select table
//		String string="select * from emp";
//		PreparedStatement p=con.prepareStatement(string);
//		ResultSet r=p.executeQuery();
//		while(r.next())
//		{
//			int id=r.getInt("eno");
//			String nm=r.getNString("enm");
//			String dpt=r.getNString("depart");
//			int sal=r.getInt("sal");
//			
//			System.out.println(id+" "+nm+" "+dpt+" "+sal);
//		}
//	
//		// update table
//		String string="update emp set enm='Arpit' where eno=5";
//		PreparedStatement p=con.prepareStatement(string);
//		int i=p.executeUpdate();
//		System.out.println("done");
//
//		// delete data
//		String string="delete from emp where eno=1";
//		PreparedStatement p=con.prepareStatement(string);
//		int i=p.executeUpdate();
//		System.out.println("done");
	}
}

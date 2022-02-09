<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<%

    //重用
    //1.四大金刚
     Class.forName("com.mysql.jdbc.Driver");
     String url = "jdbc:mysql://localhost:3306/emp";
    String user = "root";
    String pwd = "123456";
    //获取连接对象
    Connection conn = DriverManager.getConnection(url, user, pwd);


%>
<body>
    <%
 			//处理中文乱码
 			request.setCharacterEncoding("utf-8");
 			response.setCharacterEncoding("utf-8");

 			//接受参数

 			String name = request.getParameter("name");
 			String sal = request.getParameter("sal");
 			String comm = request.getParameter("comm");

 			PreparedStatement pstmt = conn.prepareStatement("insert into emp(name,sal,comm) values(?,?,?)");

 			pstmt.setObject(1, name);
 			pstmt.setObject(2, sal);
 			pstmt.setObject(3, comm);

 			pstmt.executeUpdate();

 			pstmt.close();
 			conn.close();


 			//页面跳转
 			response.sendRedirect("list.jsp");

 		 %>
</html>

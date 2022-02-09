
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
    //这种形式可以得到数组
    String id=request.getParameter("id");

    PreparedStatement pstmt = conn.prepareStatement("delete from emp where id =?");
    pstmt.setObject(1,id);
    pstmt.executeUpdate();
    pstmt.close();
    conn.close();

//页面跳转
    response.sendRedirect("list.jsp");

%>
</body>
</html>

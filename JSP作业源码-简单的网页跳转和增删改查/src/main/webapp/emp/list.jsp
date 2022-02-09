<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<table border="1" width="400" height="70" align="center">
    <tr>
        <td>员工编号</td>
        <td>员工姓名</td>
        <td>员工工资</td>
        <td>员工奖金</td>
        <td>删除</td>
    </tr>
    <%
        //加载驱动类
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/emp";
        String user = "root";
        String pwd = "123456";
        //获取连接对象
        Connection conn = DriverManager.getConnection(url, user, pwd);
        //获取预处理对象
        PreparedStatement pstmt=conn.prepareStatement("select * from emp");
        //执行后会产生一个结果
        ResultSet rs= pstmt.executeQuery();

        while (rs.next()) {
    %>
    <tr>
        <td><% out.print(rs.getObject(1));%></td>
        <td><% out.print(rs.getObject(2));%></td>
        <td><% out.print(rs.getObject(3));%></td>
        <td><% out.print(rs.getObject(4));%></td>
        <td><% out.print("&nbsp;&nbsp;<a href='javascript:void(0)' onclick='del("+rs.getObject(1)+")'>删除</a>");%></td>
    </tr>
    <%
        }




        //8.关闭链接
        rs.close();
        pstmt.close();
        conn.close();

    %>
</table>


<script>
    //var 声明一个变量del
    //function声明一个函数
    var del = function(id)
    {
        //弹窗有确认有返回。confirm 方法的返回值为 true 或 false。
        var flag = confirm("确定要删除么？");

        if(flag)
        {
            window.location = "delete.jsp?id="+id;
        }

    }
</script>
<body>


<hr />
<form action="add.jsp" method="post">
    员工姓名：<input type="text" name="name" /><br />
    员工工资: <input type="text" name="sal" /><br />
    员工奖金：<input type="text" name="comm" /><br />
    <input type="submit" value="提交">





</form>
</body>
</html>

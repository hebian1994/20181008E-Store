<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="java.sql.*" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>E-Stroe</title>
</head>
<body>
<%
    Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","123456");
    }catch(Exception ex){
        System.out.println("数据库连接失败");
    }
    st=conn.createStatement();
    rs=st.executeQuery("select picture,goodsName,originalPrice,introduce,id from tb_goods");
    while(rs.next()){
%>
<div align="center">
    <image src="<%=rs.getString("picture")%>" width="110" height="100"/>
</div>
<div align="center"><%=rs.getString("goodsName") %></div>
<div align="center">单价：<%=rs.getString("originalPrice")%>元</div>
<div align="center"><%=rs.getString("introduce")%></div>
<div align="center"><%=rs.getString("id") %></div>
<%
    }
    rs.close();
    st.close();
    conn.close();
%>
<br>
<h2 align="center">登录后才能购买</h2>
</body>
</html>
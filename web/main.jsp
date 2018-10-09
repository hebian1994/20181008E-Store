<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="ldj.service.impl.GoodsServiceImpl" %>
<%@ page import="ldj.pojo.Goods" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>E-Stroe</title>
</head>
<body>

<jsp:include page="frameTop.jsp" flush="true"></jsp:include>

<table width="100%" border="2" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td width="20%" border="2" align="center" cellpadding="0" cellspacing="0">
            <jsp:include page="frameLeft.jsp"></jsp:include>
        </td>
        <td width="80%" align="center" valign="top" bgcolor="#FFFFFF">
            <%
                GoodsServiceImpl goodsService=new GoodsServiceImpl();
                List<Goods> goodsList=goodsService.selectAllGoods();
                for (int i=0;i<goodsList.size();i++){
                    Goods goods=(Goods)goodsList.get(i);
            %>
            <table width="320" height="136" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#999999">
                <tr>
                    <td width="40%" height="80" rowspan="5" bgcolor="#FFFFFF">
                        <div align="center">
                            <image src="<%=goods.getPicture()%>" width="110" height="100"/>
                        </div>
                    </td>
                    <td width="58%" bgcolor="#FFFFFF">
                        <div align="center"><%=goods.getGoodsName() %></div>
                        <div align="center">单价：<%=goods.getCurrentPrice()%>元</div>
                        <div align="center"><%=goods.getIntroduce()%></div>
                        <div align="center"><%=goods.getId()%></div>
                        <div align="left">
                            登陆后才能购买
                        </div>
    </td>
</tr>
</table>
<%
    }
%>
        </td>
    </tr>
</table>

<jsp:include page="frameBottom.jsp" flush="true"></jsp:include>
</body>

</html>
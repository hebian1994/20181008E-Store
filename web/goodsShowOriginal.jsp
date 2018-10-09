<%@ page import="ldj.service.impl.GoodsServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="ldj.pojo.Goods" %><%--
  Created by IntelliJ IDEA.
  User: ldj
  Date: 2018/10/10
  Time: 3:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //新品展示
    GoodsServiceImpl goodsService=new GoodsServiceImpl();
    List<Goods> originalList=goodsService.selectGoodsDiscount("0");
    int pageNumber=originalList.size();//总的数据数目
    int maxPage=pageNumber;//最大页数
    int sn=2;//每页显示的个数
    if (pageNumber%sn==0){
        maxPage=pageNumber/sn;
    }else {
        maxPage=pageNumber/sn+1;
    }
    //http中需要提供显示哪一页
    String strNumber=request.getParameter("pageNum");
    int number=0;
    if (strNumber==null){
        number=0;//默认显示第0页
    }else {
        number=Integer.parseInt(strNumber);
    }
    int start=number*sn;//开始条数
    int over=number*sn+sn;//结束条数
    int count=pageNumber-over;//计算剩余条数
    if (count<=0){
        over=pageNumber;
    }
%>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <title>E-Store</title>
</head>
<body>
    <jsp:include page="frameTop.jsp" flush="true"></jsp:include>
    <table width="100%" border="2" align="center" cellpadding="0" cellspacing="0">
        <tr>
            <!--页面左侧-->
            <td width="20%" valign="top" bgcolor="aqua">
                <jsp:include page="frameLeft.jsp" flush="true"></jsp:include>
            </td>
            <!--页面右侧-->
            <td width="80%" align="center" valign="top" bgcolor="#FFFFFF">
                <%
                    for (int i=start;i<over;i++){
                        Goods originalGoods=originalList.get(i);
                    %>
                <table width="320" height="136" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#999999">
                    <tr>
                        <td width="40%" height="80" rowspan="5" bgcolor="#FFFFFF">
                            <div align="center">
                                <image src="<%=originalGoods.getPicture()%>" width="110" height="100"/>
                            </div>
                        </td>
                        <td width="58%" bgcolor="#FFFFFF">
                            <div align="center"><%=originalGoods.getGoodsName() %></div>
                            <div align="center">单价：<%=originalGoods.getCurrentPrice()%>元</div>
                            <div align="center"><%=originalGoods.getIntroduce()%></div>
                            <div align="center"><%=originalGoods.getId()%></div>
                            <div align="left">
                                登陆后才能购买
                            </div>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </table>
            </td>
        </tr>
            <br>
            <div align="center">
                <table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
                    <tr align="center">
                        <td width="13%">共有<%=maxPage%>页</td>
                        <td width="18%">共有<%=pageNumber%>商品</td>
                        <td width="26%">当前为第<%=number+1%>页</td>
                        <td width="15%">
                            <%if (number+1==1){%>上一页<%}else{%>
                            <a href="goodsShowOriginal.jsp?pageNum=<%=number-1%>">上一页</a>
                            <%}%>
                        </td>
                        <td width="14%"><%if (maxPage<=(number+1)){%>下一页<%}else {%>
                            <a href="goodsShowOriginal.jsp?pageNum=<%=number+1%>">下一页</a>
                        </td><%}%>
                    </tr>
                </table>
            </div>
    </table>

<jsp:include page="frameBottom.jsp" flush="true"></jsp:include>

</body>
</html>

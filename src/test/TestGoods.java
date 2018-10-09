import ldj.dao.GoodsDao;
import ldj.pojo.Goods;
import ldj.service.impl.GoodsServiceImpl;
import ldj.util.DBConnection.DBConnection;
import org.junit.Test;

import java.util.List;

public class TestGoods {
    @Test
    public void testdb(){
        DBConnection d=new DBConnection();
        d.getDataSource();
    }
    @Test
    public void TestGoodsDao(){
        GoodsDao g=new GoodsDao();
        g.selectGoods();
    }
    @Test
    public void TestGoodsService() throws Exception {
        GoodsServiceImpl g=new GoodsServiceImpl();
        List<Goods> l=g.selectAllGoods();
        System.out.println(l.get(0));
    }
    @Test
    public void selectGoodsDiscount(){
        GoodsDao g=new GoodsDao();
        System.out.println(g.selectGoodsDiscount("1"));
    }
    @Test
    public void selectGoodsDiscountService()throws Exception{
        GoodsServiceImpl g=new GoodsServiceImpl();
        System.out.println(g.selectGoodsDiscount("1"));
    }
}

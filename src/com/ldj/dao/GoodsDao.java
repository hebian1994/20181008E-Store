package ldj.dao;

import ldj.pojo.Goods;
import ldj.util.DBConnection.DBConnection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class GoodsDao {
    private static QueryRunner qr=new QueryRunner(DBConnection.getDataSource());
    //查询
    public List<Goods> selectGoods(){
        try{
            //拼写条件查询的SQL语句
            String sql = "SELECT * FROM tb_goods";
            //调用qr对象的方法query查询数据表,获取结果集
            return qr.query(sql, new BeanListHandler<>(Goods.class));
        }catch(SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("条件查询失败");
        }
    }
}

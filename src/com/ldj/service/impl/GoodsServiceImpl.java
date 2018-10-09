package ldj.service.impl;

import ldj.dao.GoodsDao;
import ldj.pojo.Goods;
import ldj.service.IGoodsService;

import java.util.List;

public class GoodsServiceImpl implements IGoodsService{
   private GoodsDao g=new GoodsDao();
    @Override
    public boolean insert(Goods vo) throws Exception {
        return false;
    }

    @Override
    public List<Goods> selectAllGoods() throws Exception {
        return g.selectGoods();
    }

    @Override
    public List<Goods> selectGoodsDiscount(String str) throws Exception {
        return g.selectGoodsDiscount(str);
    }

    @Override
    public boolean update(Goods vo) throws Exception {
        return false;
    }

    @Override
    public boolean delete(List<String> ids) throws Exception {
        return false;
    }
}

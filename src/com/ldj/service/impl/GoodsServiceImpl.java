package ldj.service.impl;

import ldj.dao.GoodsDao;
import ldj.pojo.Goods;
import ldj.service.IGoodsService;

import java.util.List;

public class GoodsServiceImpl implements IGoodsService{
    @Override
    public boolean insert(Goods vo) throws Exception {
        return false;
    }

    @Override
    public List<Goods> selectAllGoods() throws Exception {
        GoodsDao g=new GoodsDao();
        return g.selectGoods();
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

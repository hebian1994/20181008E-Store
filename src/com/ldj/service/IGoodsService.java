package ldj.service;

import ldj.pojo.Goods;

import java.util.List;

public interface IGoodsService {
    /**
     * 实现学生数据增加操作
     * @param vo 表示要执行数据增加的vo对象
     * @return 成功返回true,失败返回false
     * @throws Exception
     */
    public boolean insert(Goods vo)throws Exception;

    /**
     * 实现数据分页查询操作
     * @param currentPage 表示当前页
     * @param lineSize 表示每页显示记录数
     * @return
     * @throws Exception
     */
    public List<Goods> selectAllGoods()throws Exception;

    /**
     * 实现数据更新操作方法
     * @param vo 表示要执行更新操作的数据
     * @return 成功返回true,失败返回false
     * @throws Exception
     */
    public boolean update(Goods vo)throws Exception;

    /**
     * 实现数据批量删除操作
     * @param ids 表示要执行删除的操作的集合数据
     * @return
     * @throws Exception
     */
    public boolean delete(List<String> ids)throws Exception;
}

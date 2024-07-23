package org.example.DAO;

import org.example.pojo.Product;

import java.util.List;

/**
 * @author SHAO
 * @date 2024/7/23 下午7:58
 */
public interface ProductDAO {
    /** 插入一个商品信息
     * @param product 要插入的商品信息 其中主键无需提供
     */
    void insert(Product product);

    /** 根据主键删除商品信息
     * @param id 要删除的商品信息的 id
     */
    void delete(Integer id);

    /** 根据商品的ID修改商品的所有信息
     * @param product 提供要修改的商品 id 和 需要被修改的字段值
     */
    void update(Product product);


    /** 统计商品记录的总数
     * @return 记录总数 如果为0 说明没有数据
     */
    Integer count();

    /**
     * 获取所有商品信息
     * @return 所有商品对应的集合
     */
    List<Product> findAll();

    /** 根据id查找对应的商品信息
     * @param id 要获取的商品id
     * @return 对应的商品记录 如果对应的商品记录不存在 则返回null
     */
    Product findByID(Integer id);

    /**
     * 根据商品名称模糊查询商品
     * @param name 模糊查询关键字
     * @return 模糊查询的商品结果
     */
    List<Product> findByNameLike(String name);

    /**
     * 根据商品名称进行模糊分页的查询
     * @param name 模糊查询关键字
     * @param start limit 起始参数
     * @param limit 要分页截取的行数
     * @return 分页模糊查询的商品数据结果 若找不到 返回为 null
     */
    List<Product> findByNameLikeWithLimit(String name, int start, int limit);

    /**
     * 分页查询商品
     * @param start limit 起始查询
     * @param limit 要分页截取的行数
     * @return 分页查询的商品数据 如果没有数据 返回为 null
     */
    List<Product> findWithLimit(int start, int limit);



}

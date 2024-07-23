package org.example.DAO;

/**
 * @author SHAO
 * @date 2024/7/23 下午7:58
 */

import org.example.pojo.Categories;

import java.util.List;

/**
 * 商品类别 DAO 接口
 */
public interface CategoriesDAO {
    /**
     * 插入一个商品类别信息
     * @param category 要插入的商品类别信息 其中主键无需提供
     */
    void insert(Categories category);

    /**
     * 根据主键删除商品类别信息
     * @param id 要删除的商品类别信息的 id
     */
    void delete(Integer id);

    /**
     * 根据商品类别的 id 修改商品类别的所有信息
     * @param category 提供要修改的商品类别 id 和需要被修改的字段值
     */
    void update(Categories category);

    /**
     * 统计商品类别记录总数
     * @return 记录总数 如果为 0 说明没有数据
     */
    Integer count();

    /**
     * 根据 id 查找对应的商品类别信息
     * @param id 要获取的商品类别 id
     * @return id 对应的商品类别记录 如果对应的商品类别记录不存在 则返回 null
     */
    Categories findById(Integer id);

    /**
     * 获取所有商品类别信息
     * @return 所有商品类别对应的集合
     */
    List<Categories> findAll();

    /**
     * 根据商品类别名称模糊查询商品类别
     * @param name 模糊查询关键字
     * @return 模糊查询的商品类别结果
     */
    List<Categories> findByNameLike(String name);

    /**
     * 根据商品类别名称进行模糊分页的查询
     * @param name 模糊查询关键字
     * @param start limit 起始参数
     * @param limit 要分页截取的行数
     * @return 分页模糊查询的商品类别数据结果 若找不到 返回为 null
     */
    List<Categories> findByNameLikeWithLimit(String name, int start, int limit);

    /**
     * 分页查询商品类别
     * @param start limit 起始查询
     * @param limit 要分页截取的行数
     * @return 分页查询的商品类别数据 如果没有数据 返回为 null
     */
    List<Categories> findWithLimit(int start, int limit);
}
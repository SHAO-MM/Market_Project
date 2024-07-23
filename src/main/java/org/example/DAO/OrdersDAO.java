package org.example.DAO;

/**
 * @author SHAO
 * @date 2024/7/23 下午7:59
 */

import org.example.pojo.Orders;

import java.util.List;

/**
 * 订单 DAO 接口
 */
public interface OrdersDAO {
    /**
     * 插入一个订单信息
     * @param order 要插入的订单信息 其中主键无需提供
     */
    void insert(Orders order);

    /**
     * 根据主键删除订单信息
     * @param id 要删除的订单信息的 id
     */
    void delete(Integer id);

    /**
     * 根据订单的 id 修改订单的所有信息
     * @param order 提供要修改的订单 id 和需要被修改的字段值
     */
    void update(Orders order);

    /**
     * 统计订单记录总数
     * @return 记录总数 如果为 0 说明没有数据
     */
    Integer count();

    /**
     * 根据 id 查找对应的订单信息
     * @param id 要获取的订单 id
     * @return id 对应的订单记录 如果对应的订单记录不存在 则返回 null
     */
    Orders findById(Integer id);

    /**
     * 获取所有订单信息
     * @return 所有订单对应的集合
     */
    List<Orders> findAll();

    /**
     * 根据会员卡 id 模糊查询订单
     * @param cardId 模糊查询关键字
     * @return 模糊查询的订单结果
     */
    List<Orders> findByCardIdLike(Integer cardId);

    /**
     * 根据会员卡 id 进行模糊分页的查询
     * @param cardId 模糊查询关键字
     * @param start limit 起始参数
     * @param limit 要分页截取的行数
     * @return 分页模糊查询的订单数据结果 若找不到 返回为 null
     */
    List<Orders> findByCardIdLikeWithLimit(Integer cardId, int start, int limit);

    /**
     * 分页查询订单
     * @param start limit 起始查询
     * @param limit 要分页截取的行数
     * @return 分页查询的订单数据 如果没有数据 返回为 null
     */
    List<Orders> findWithLimit(int start, int limit);
}


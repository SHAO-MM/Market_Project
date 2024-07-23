package org.example.DAO;

/**
 * @author SHAO
 * @date 2024/7/23 下午8:00
 */

import org.example.pojo.OrderItems;

import java.util.List;

/**
 * 订单项 DAO 接口
 */
public interface OrderItemsDAO {
    /**
     * 插入一个订单项信息
     * @param orderItem 要插入的订单项信息 其中主键无需提供
     */
    void insert(OrderItems orderItem);

    /**
     * 根据主键删除订单项信息
     * @param id 要删除的订单项信息的 id
     */
    void delete(Integer id);

    /**
     * 根据订单项的 id 修改订单项的所有信息
     * @param orderItem 提供要修改的订单项 id 和需要被修改的字段值
     */
    void update(OrderItems orderItem);

    /**
     * 统计订单项记录总数
     * @return 记录总数 如果为 0 说明没有数据
     */
    Integer count();

    /**
     * 根据 id 查找对应的订单项信息
     * @param id 要获取的订单项 id
     * @return id 对应的订单项记录 如果对应的订单项记录不存在 则返回 null
     */
    OrderItems findById(Integer id);

    /**
     * 获取所有订单项信息
     * @return 所有订单项对应的集合
     */
    List<OrderItems> findAll();

    /**
     * 根据订单 id 模糊查询订单项
     * @param orderId 模糊查询关键字
     * @return 模糊查询的订单项结果
     */
    List<OrderItems> findByOrderIdLike(Integer orderId);

    /**
     * 根据订单 id 进行模糊分页的查询
     * @param orderId 模糊查询关键字
     * @param start limit 起始参数
     * @param limit 要分页截取的行数
     * @return 分页模糊查询的订单项数据结果 若找不到 返回为 null
     */
    List<OrderItems> findByOrderIdLikeWithLimit(Integer orderId, int start, int limit);

    /**
     * 分页查询订单项
     * @param start limit 起始查询
     * @param limit 要分页截取的行数
     * @return 分页查询的订单项数据 如果没有数据 返回为 null
     */
    List<OrderItems> findWithLimit(int start, int limit);
}
package org.example.DAO;

/**
 * @author SHAO
 * @date 2024/7/23 下午7:59
 */

import org.example.pojo.Members;

import java.util.List;

/**
 * 会员 DAO 接口
 */
public interface MembersDAO {
    /**
     * 插入一个会员信息
     * @param member 要插入的会员信息 其中主键无需提供
     */
    void insert(Members member);

    /**
     * 根据主键删除会员信息
     * @param id 要删除的会员信息的 id
     */
    void delete(Integer id);

    /**
     * 根据会员的 id 修改会员的所有信息
     * @param member 提供要修改的会员 id 和需要被修改的字段值
     */
    void update(Members member);

    /**
     * 统计会员记录总数
     * @return 记录总数 如果为 0 说明没有数据
     */
    Integer count();

    /**
     * 根据 id 查找对应的会员信息
     * @param id 要获取的会员 id
     * @return id 对应的会员记录 如果对应的会员记录不存在 则返回 null
     */
    Members findById(Integer id);

    /**
     * 获取所有会员信息
     * @return 所有会员对应的集合
     */
    List<Members> findAll();

    /**
     * 根据会员姓名模糊查询会员
     * @param name 模糊查询关键字
     * @return 模糊查询的会员结果
     */
    List<Members> findByNameLike(String name);

    /**
     * 根据会员姓名进行模糊分页的查询
     * @param name 模糊查询关键字
     * @param start limit 起始参数
     * @param limit 要分页截取的行数
     * @return 分页模糊查询的会员数据结果 若找不到 返回为 null
     */
    List<Members> findByNameLikeWithLimit(String name, int start, int limit);

    /**
     * 分页查询会员
     * @param start limit 起始查询
     * @param limit 要分页截取的行数
     * @return 分页查询的会员数据 如果没有数据 返回为 null
     */
    List<Members> findWithLimit(int start, int limit);
}

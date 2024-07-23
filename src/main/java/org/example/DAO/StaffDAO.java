package org.example.DAO;

/**
 * @author SHAO
 * @date 2024/7/23 下午7:57
 */

import org.example.pojo.Staff;

import java.util.List;

/**
 * 员工 DAO 接口
 */
public interface StaffDAO {
    /**
     * 插入一个员工信息
     * @param employee 要插入的员工信息 其中主键无需提供
     */
    void insert(Staff employee);

    /**
     * 根据主键删除员工信息
     * @param id 要删除的员工信息的 id
     */
    void delete(Integer id);

    /**
     * 根据员工的 id 修改员工的所有信息
     * @param staff 提供要修改的员工 id 和需要被修改的字段值
     */
    void update(Staff staff);

    /**
     * 统计员工记录总数
     * @return 记录总数 如果为 0 说明没有数据
     */
    Integer count();

    /**
     * 根据 id 查找对应的员工信息
     * @param id 要获取的员工 id
     * @return id 对应的员工记录 如果对应的员工记录不存在 则返回 null
     */
    Staff findById(Integer id);

    /**
     * 获取所有员工信息
     * @return 所有员工对应的集合
     */
    List<Staff> findAll();

    /**
     * 根据员工姓名模糊查询员工
     * @param name 模糊查询关键字
     * @return 模糊查询的员工结果
     */
    List<Staff> findByNameLike(String name);

    /**
     * 根据员工姓名进行模糊分页的查询
     * @param name 模糊查询关键字
     * @param start limit 起始参数
     * @param limit 要分页截取的行数
     * @return 分页模糊查询的员工数据结果 若找不到 返回为 null
     */
    List<Staff> findByNameLikeWithLimit(String name, int start, int limit);

    /**
     * 分页查询员工
     * @param start limit 起始查询
     * @param limit 要分页截取的行数
     * @return 分页查询的员工数据 如果没有数据 返回为 null
     */
    List<Staff> findWithLimit(int start, int limit);
}
package com.repair.dao;

import com.repair.pojo.RepairDept;

public interface RepairDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_RepairDept
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_RepairDept
     *
     * @mbggenerated
     */
    int insert(RepairDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_RepairDept
     *
     * @mbggenerated
     */
    int insertSelective(RepairDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_RepairDept
     *
     * @mbggenerated
     */
    RepairDept selectByPrimaryKey(Integer number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_RepairDept
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RepairDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_RepairDept
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RepairDept record);
}
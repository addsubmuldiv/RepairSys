package com.repair.dao;

import com.repair.pojo.SecondAddr;

public interface SecondAddrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_SecondAddr
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer secondNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_SecondAddr
     *
     * @mbggenerated
     */
    int insert(SecondAddr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_SecondAddr
     *
     * @mbggenerated
     */
    int insertSelective(SecondAddr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_SecondAddr
     *
     * @mbggenerated
     */
    SecondAddr selectByPrimaryKey(Integer secondNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_SecondAddr
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SecondAddr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_SecondAddr
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SecondAddr record);
}
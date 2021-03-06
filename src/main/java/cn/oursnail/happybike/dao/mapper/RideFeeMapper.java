package cn.oursnail.happybike.dao.mapper;

import cn.oursnail.happybike.entity.RideFee;

public interface RideFeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_fee
     *
     * @mbggenerated Thu Mar 15 14:09:42 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_fee
     *
     * @mbggenerated Thu Mar 15 14:09:42 CST 2018
     */
    int insert(RideFee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_fee
     *
     * @mbggenerated Thu Mar 15 14:09:42 CST 2018
     */
    int insertSelective(RideFee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_fee
     *
     * @mbggenerated Thu Mar 15 14:09:42 CST 2018
     */
    RideFee selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_fee
     *
     * @mbggenerated Thu Mar 15 14:09:42 CST 2018
     */
    int updateByPrimaryKeySelective(RideFee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_fee
     *
     * @mbggenerated Thu Mar 15 14:09:42 CST 2018
     */
    int updateByPrimaryKey(RideFee record);

    RideFee selectBikeTypeFee(Byte type);
}
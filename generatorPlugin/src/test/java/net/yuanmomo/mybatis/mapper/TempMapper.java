package net.yuanmomo.mybatis.mapper;

import java.util.List;
import net.yuanmomo.bean.Temp;
import net.yuanmomo.bean.TempParam;
import org.apache.ibatis.annotations.Param;

public interface TempMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    int countByExample(TempParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    int deleteByExample(TempParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    int insert(Temp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    int insertSelective(Temp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    List<Temp> selectByExample(TempParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    Temp selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Temp record, @Param("example") TempParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Temp record, @Param("example") TempParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Temp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Temp record);
}
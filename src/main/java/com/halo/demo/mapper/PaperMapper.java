package com.halo.demo.mapper;

import com.halo.demo.model.Paper;
import com.halo.demo.model.PaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PaperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    long countByExample(PaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    int deleteByExample(PaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    int deleteByPrimaryKey(Integer ppno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    int insert(Paper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    int insertSelective(Paper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    List<Paper> selectByExampleWithRowbounds(PaperExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    List<Paper> selectByExample(PaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    Paper selectByPrimaryKey(Integer ppno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    int updateByExampleSelective(@Param("record") Paper record, @Param("example") PaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    int updateByExample(@Param("record") Paper record, @Param("example") PaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    int updateByPrimaryKeySelective(Paper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    int updateByPrimaryKey(Paper record);
}
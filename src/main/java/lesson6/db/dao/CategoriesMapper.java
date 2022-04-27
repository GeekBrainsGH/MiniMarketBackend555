package lesson6.db.dao;


import java.util.List;

import lesson6.db.model.Categories;
import lesson6.db.model.CategoriesExample;
import org.apache.ibatis.annotations.Param;

public interface CategoriesMapper {
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table categories
//     *
//     * @mbg.generated Wed Apr 20 13:34:41 MSK 2022
//     */
    long countByExample(CategoriesExample example);

//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table categories
//     *
//     * @mbg.generated Wed Apr 20 13:34:41 MSK 2022
//     */
    int deleteByExample(CategoriesExample example);

//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table categories
//     *
//     * @mbg.generated Wed Apr 20 13:34:41 MSK 2022
//     */
    int deleteByPrimaryKey(Long id);

//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table categories
//     *
//     * @mbg.generated Wed Apr 20 13:34:41 MSK 2022
//     */
    int insert(Categories record);

//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table categories
//     *
//     * @mbg.generated Wed Apr 20 13:34:41 MSK 2022
//     */
    int insertSelective(Categories record);

//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table categories
//     *
//     * @mbg.generated Wed Apr 20 13:34:41 MSK 2022
//     */
    List<Categories> selectByExample(CategoriesExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table categories
//     *
//     * @mbg.generated Wed Apr 20 13:34:41 MSK 2022
//     */
    Categories selectByPrimaryKey(Long id);

//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table categories
//     *
//     * @mbg.generated Wed Apr 20 13:34:41 MSK 2022
//     */
    int updateByExampleSelective(@Param("record") Categories record, @Param("example") CategoriesExample example);

//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table categories
//     *
//     * @mbg.generated Wed Apr 20 13:34:41 MSK 2022
//     */
    int updateByExample(@Param("record") Categories record, @Param("example") CategoriesExample example);

//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table categories
//     *
//     * @mbg.generated Wed Apr 20 13:34:41 MSK 2022
//     */
    int updateByPrimaryKeySelective(Categories record);

//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table categories
//     *
//     * @mbg.generated Wed Apr 20 13:34:41 MSK 2022
//     */
    int updateByPrimaryKey(Categories record);
}
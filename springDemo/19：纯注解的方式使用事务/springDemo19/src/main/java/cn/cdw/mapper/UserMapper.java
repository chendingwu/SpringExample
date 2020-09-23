package cn.cdw.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author DW-CHEN
 * dao
 */
public interface UserMapper {
    @Update("UPDATE USER SET money=money-#{money} WHERE NAME=#{name}")
    public void outMoney(@Param("name") String name, @Param("money") Double money); //出钱

    @Update("UPDATE USER SET money=money+#{money} WHERE NAME=#{name}")
    public void inMoney(@Param("name") String name, @Param("money") Double money); //收钱

}

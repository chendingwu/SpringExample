package cn.cdw.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author DW-CHEN
 * dao
 */
public interface UserMapper {
    public void outMoney(@Param("name") String name,@Param("money") Double money); //出钱
    public void inMoney(@Param("name") String name,@Param("money") Double money); //收钱

}

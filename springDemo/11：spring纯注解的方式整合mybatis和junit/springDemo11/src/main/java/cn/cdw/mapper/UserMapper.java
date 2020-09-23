package cn.cdw.mapper;

import cn.cdw.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author DW-CHEN
 */
public interface UserMapper {
    @Select("select * from user")
    public List<User> selectAll();

    @Select("select * from user where id = #{id}")
    public User selectById(Integer id);

    @Insert("insert into user values(null,#{name},#{age})")
    public void insert(User user);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    public void update(User user);

    @Delete("delete from user where id=#{id}")
    public void delete(Integer id);


}

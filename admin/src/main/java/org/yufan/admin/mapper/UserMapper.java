package org.yufan.admin.mapper;

import org.apache.ibatis.annotations.*;
import org.yufan.core.bean.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {

//    @Insert("insert into user(name,address) values(#{name},#{address})")
//    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
//    public void insertUser(User user);
//
//    @Update("update user set name=#{name},address=#{address} where id=#{id}")
//    public void updateUser(User user);
//
//    @Delete("delete from user where id=#{id}")
//    public void deleteUserById(Integer id);
//
//    @Select("select id,name,address from user where id=#{id}")
//    @Results(value = {@Result(id=true,column="id",property = "id"),@Result(column="name",property = "name"),
//            @Result(column="address",property = "address")})
//    public User findUserById(Integer id);

}

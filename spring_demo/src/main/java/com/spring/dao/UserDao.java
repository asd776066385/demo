package com.spring.dao;

import com.spring.vo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    @Insert("insert into user_info(user_name,user_sex) values(#{name},#{sex})")
    void insert(User user);

    @Select("select * from user_info")
    @Results(id = "userMap", value = {
            @Result(column = "id", id = true, property = "id"),
            @Result(column = "user_name", property = "name"),
            @Result(column = "user_sex", property = "sex")})
    List<User> findAll();
}

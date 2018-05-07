package com.geekstyle.uc.dao.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.geekstyle.uc.model.user.User;

@Mapper
public interface UserDao {
	
	@Insert({"insert into user (nickname,email,mobile,password,gender,birthday,create_time) values (#{nickname},#{email},#{mobile},#{password},#{gender},#{birthday},#{createTime})"})
	@Options(useGeneratedKeys=true)
	public void insertUser(User user);
	
	@Select({"select id,nickname from user where id = #{id}"})
	public User getUserById(Integer id);
	
}
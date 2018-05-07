package com.geekstyle.uc.dao.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.geekstyle.uc.model.user.Credential;

@Mapper
public interface CredentialDao {
	
	@Insert({"insert into credential (user_id,username,password,type,create_time) values (#{userId},#{username},#{password},#{type},#{createTime}) "})
	@Options(useGeneratedKeys=true)
	public void insertCredential(Credential credential);
	
	@Select({"select user_id userId,username,password,type,create_time createTime from credential where username = #{username}"})
	public Credential getCredentialByUserName(String username);
	
	@Select({"select count(1) from credential where username = #{username} and type = #{type}"})
	public int isExist(Credential credential);
	
	@Select({"select user_id userId from credential where username = #{username}"})
	public Integer getUserId(String username);
	
	@Select({"update credential set password = #{password} where user_id = #{userId}"})
	public void updatePassword(Credential credential);
}
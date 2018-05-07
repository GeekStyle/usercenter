package com.geekstyle.uc.dao.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.geekstyle.uc.model.user.VerifyCode;

@Mapper
public interface VerifyCodeDao {

	@Insert({"insert into verify_code (code,username,create_time) values (#{code},#{username},#{createTime})"})
	public void insertVerifyCode(VerifyCode verifyCode);
	
	@Select({"select code,username,create_time createTime from verify_code where code = #{code} and username = #{username}"})
	public VerifyCode getVerifyCode(VerifyCode verifyCode);
	
}

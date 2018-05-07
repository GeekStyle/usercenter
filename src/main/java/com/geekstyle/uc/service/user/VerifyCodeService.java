package com.geekstyle.uc.service.user;

import com.geekstyle.uc.model.user.Credential;
import com.geekstyle.uc.model.user.VerifyCode;

public interface VerifyCodeService {
	
	public String sendVerifyCode(Credential credential);
	
	public VerifyCode getVerifyCode(VerifyCode verifyCode);
}

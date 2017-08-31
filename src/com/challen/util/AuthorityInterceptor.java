package com.challen.util;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.*;

public class AuthorityInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		
		ActionContext ctx = invocation.getInvocationContext();
		Map session = ctx.getSession();
		String username = (String)session.get("username");
		if(username!=null){
			System.out.println("������ͨ��");
			return invocation.invoke();
		}
		System.out.println("��¼����");
		ctx.put("tip","���ȵ�¼");
		return null;
	}

}

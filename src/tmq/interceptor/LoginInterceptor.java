package tmq.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;
//import tmq.action.*;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		Map session = ai.getInvocationContext().getSession();
		String username = (String)session.get("user");
		if(username!=null && username.length()>0){
			return ai.invoke();
		}else{
			ActionContext ac = ai.getInvocationContext();
			ac.put("popedom", "Äú»¹Ã»ÓÐµÇÂ¼£¬ÇëµÇÂ¼£¡");
			return Action.LOGIN;
		}
	}

}

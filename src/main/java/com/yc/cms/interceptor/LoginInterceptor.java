package com.yc.cms.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.yc.cms.action.blog.Index;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.InterceptorRef;

import java.util.Map;
public class LoginInterceptor extends AbstractInterceptor{

    private final static Logger log = LogManager.getFormatterLogger(LoginInterceptor.class);

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        //String  uid= (String)ActionContext.getContext().getSession().get("uid");
        //String uid = String.valueOf((int)ActionContext.getContext().getSession().get("uid"));
        Object session_uid = ActionContext.getContext().getSession().get("uid");
        log.debug("login_interceptor" + session_uid)
        ;
        if(session_uid == null){
            log.debug("login_interceptor error login");
            return "error_login";
        }else{
            log.debug("login_interceptor has login");
            //return ActionSupport.SUCCESS;
            return "";
        }


    }
}

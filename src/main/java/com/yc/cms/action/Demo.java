package com.yc.cms.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Demo extends ActionSupport implements SessionAware{

    Logger log = LogManager.getLogger(Demo.class);

    private Map<String,Object> session;

    @Override
    public String execute() throws Exception {

        //log.debug("SEssion:" + sess)

        session.put("uid",1);
        log.debug("uid-session:" + session.get("uid"));

        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }
}

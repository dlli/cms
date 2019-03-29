package com.yc.cms.action.blog;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.*;

@ParentPackage("blog")
public class Index extends ActionSupport {

    private final static Logger log = LogManager.getFormatterLogger(Index.class);

    @Override

    public String execute() throws Exception {
        log.debug("======blog/index======");
        log.warn("======blog/index======");
        log.info("======blog/index======");
        log.error("======blog/index======");
        System.out.println("blog-index");

        return SUCCESS;
    }
    @Action(value="index",results = {
            @Result(name="success",location="index-success.jsp")
    })
    public String blog(){
        log.debug("================index==============");
        return SUCCESS;
    }
}

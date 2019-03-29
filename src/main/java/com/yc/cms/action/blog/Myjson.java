package com.yc.cms.action.blog;

import com.opensymphony.xwork2.ActionSupport;
import com.yc.cms.bean.DemoBean;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.HashMap;
import java.util.Map;

@ParentPackage("json-default")
public class Myjson extends ActionSupport {

    private DemoBean bean = new DemoBean();



    private Map<String,Object> map;

    @Action(
            value="/blog/gg",
            results={
                    @Result(type="json",params={
                            "root","map"
                    })
            }
    )
    public String gg(){
        map = new HashMap<String,Object>();
        map.put("name",1);
        map.put("age",100);

        return SUCCESS;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public DemoBean getBean() {
        return bean;
    }
}

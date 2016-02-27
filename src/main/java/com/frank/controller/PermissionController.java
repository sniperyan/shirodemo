package com.frank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyan on 2016/2/27.
 */
@Controller
public class PermissionController {
    @RequestMapping(value="/create.html")
    public String create(){
        return "/permission/create";
    }@RequestMapping(value="/delete.html")
     public String delete(){
        return "/permission/delete";
    }@RequestMapping(value="/query.html")
     public String query(){
        return "/permission/query";
    }@RequestMapping(value="/update.html")
     public String update(){
        return "/permission/update";
    }

}

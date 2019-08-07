package com.hyt.controller;

import com.hyt.server.UserInfoServer;
import com.hyt.util.BaseVo;
import com.hyt.util.page.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoServer userInfoServer;

    @RequestMapping("/getAll")
    public ModelAndView getAll(ModelMap map, BaseVo vo, HttpServletResponse response, HttpServletRequest request) {
        Pagination pagination = userInfoServer.getAll(vo);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pagination",pagination);
        mv.setViewName("../back/index");
        return mv;
    }
}

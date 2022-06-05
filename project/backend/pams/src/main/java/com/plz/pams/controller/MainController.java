package com.plz.pams.controller;

import com.plz.pams.service.MainService;
import com.plz.pams.vo.MainVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/all")
    @ResponseBody
    public List<MainVO> selectList(){
        System.out.println("@@@@ CON @@@@");
        List<MainVO> resultList = new ArrayList<>();
        resultList = mainService.selectAll();
        return resultList;
    }
}

package com.daniel.controller;

import com.daniel.entity.Person;
import com.daniel.service.PersonService;
import com.daniel.utils.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.MyResult;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/per")
public class PersonController {
    @Resource
    private PersonService personService;

    @RequestMapping("/list")
    public MyResult list() {
        List<Person> personList = personService.list();
        if (!CollectionUtils.isEmpty(personList)) {
            return ResultUtil.success(personList);
        } else {
            return ResultUtil.error(100, "未找到");
        }
    }
}

package com.daniel.controller;

import com.daniel.entity.Category;
import com.daniel.service.CategoryService;
import com.daniel.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.daniel.vo.MyResult;

import java.util.List;

@RestController
@RequestMapping("/cate")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private RedisTemplate redisTemplate;

    /*
    @RequestMapping("/list")
    public MyResult list() throws JsonProcessingException {
        String jsonStr = (String) redisTemplate.opsForValue().get("categoryList");

        List<Category> categoryList = null;
        if (jsonStr == null) {
            categoryList = categoryService.list();
            //
            ObjectMapper objectMapper = new ObjectMapper();
            String str = objectMapper.writeValueAsString(categoryList);
            System.out.println(str);
            redisTemplate.opsForValue().set("categoryList", str);
        }else {
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<List<Category>> listTypeReference = new TypeReference<List<Category>>() {
            };
            categoryList = objectMapper.readValue(jsonStr, listTypeReference);
        }

        //
        if (!CollectionUtils.isEmpty(categoryList)) {
            return ResultUtil.success(categoryList);
        } else {
            return ResultUtil.error(100, "分类数据未找到");
        }
    }
    */

    @RequestMapping("/list")
    public MyResult list() {
        List<Category> categoryList = categoryService.list();
        if (!CollectionUtils.isEmpty(categoryList)) {
            return ResultUtil.success(categoryList);
        } else {
            return ResultUtil.error(100, "分类数据未找到");
        }
    }

    @RequestMapping("/clear")
    public void clearCache(){
        categoryService.clearCache();
    }
}

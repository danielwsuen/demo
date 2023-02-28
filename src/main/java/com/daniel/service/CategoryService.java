package com.daniel.service;

import com.daniel.entity.Category;
import com.daniel.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Cacheable(cacheNames = "user", keyGenerator = "keyGenerator")
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    //先根据key找缓存
    //key不存在直接查数据库, 再创建key
    //若key存在, 直接走缓存, 不会查数据库
    @Cacheable(value = "category", key = "'categoryList'")
    public List<Category> list() {
        return categoryMapper.selectAll();
    }

    @CacheEvict(value = "category", key = "'categoryList'")
    public void clearCache(){
        System.out.println("缓存已清空");
    }
}

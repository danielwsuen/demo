package com.daniel.service;

import com.daniel.entity.Person;
import com.daniel.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonService {
    @Resource
    private PersonMapper personMapper;

    public List<Person> list() {
        return personMapper.selectAll();
    }

}

package com.s3.Service.impl;

import com.s3.Service.PersonService;
import com.s3.mapper.PersonMapper;
import com.s3.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceimpl implements PersonService {
    //数据访问层对象
    @Autowired
    PersonMapper personMapper;
    @Override
    public List<Person> getAll() {
       return personMapper.getAll();
    }
}

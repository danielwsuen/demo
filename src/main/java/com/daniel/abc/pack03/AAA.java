package com.daniel.abc.pack03;

import com.daniel.entity.Student;
import org.springframework.beans.factory.FactoryBean;

public class AAA implements FactoryBean<Student> {
    @Override
    public Student getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}

class Main{
    public static void main(String[] args) {

    }
}

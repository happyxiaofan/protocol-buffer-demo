package com.rhwayfun.demo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description: PersonOuterClassTest
 * @author: ZhongCB
 * @date: 2016/08/09
 */
public class PersonMessageTest {

    @Test
    public void testMakeInstance(){
        PersonMessage.Person person = PersonMessage.Person.newBuilder().setId(1)
                .setEmail("rhwayfun@163.com")
                .setName("rhwayfun").build();
        assertEquals(person.getName(), "rhwayfun");
        assertEquals(person.getEmail(), "rhwayfun@qq.com");
    }
}
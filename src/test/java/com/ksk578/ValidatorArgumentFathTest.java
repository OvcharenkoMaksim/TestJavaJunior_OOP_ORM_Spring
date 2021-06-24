package com.ksk578;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ValidatorArgumentFathTest {

    ArrayList<String> list = new ArrayList<>();

    //подготовка тестового списка
    @Before
    public void getList () {
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("C");
        System.out.println(list);
    }

    //тестирование метода исключающего дубли из списка параметров отбора записей в БД
    @Test
    public void eliminationOfDuplicatesTest() {
        ValidatorArgumentFath validatorArgumentFath = new ValidatorArgumentFath();
        list = validatorArgumentFath.eliminationOfDuplicates(list);
        System.out.println(list);
        Assert.assertEquals(3,list.size());

    }
}
package com.ksk578;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ValidatorArgumentFathTest {

    ArrayList<String> list = new ArrayList<>();

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

    @Test
    public void eliminationOfDuplicates() {
        ValidatorArgumentFath validatorArgumentFath = new ValidatorArgumentFath();
        list = validatorArgumentFath.eliminationOfDuplicates(list);
        System.out.println(list);
        Assert.assertEquals(3,list.size());

    }
}
package org.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logic {
    final static Logger LOG = LoggerFactory.getLogger(Logic.class);

    private int[] nums = new int[5];;


    public void insertNumber(int i, int number) {
        LOG.info("a= " + i);
        LOG.info("b= " + number);
        nums[i]=number;
    }
}
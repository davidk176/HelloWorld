package org.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Das ist die Klasse mit unserer Business Logik.
 */
public class Logic {
    final static Logger LOG = LoggerFactory.getLogger(Logic.class);

    //random array
    private int[] nums = new int[5];

    //Methode 1: Nummer in Array einfügen
    public void insertNumber(int i, int number) {
        LOG.info("i= " + i);
        LOG.info("number= " + number);
        //ERROR: geht das gut?
        nums[i] = number;
    }

    //Methode 2: Prüfung auf Schaltjahr
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                //ERROR: Hier wurde etwas vergessen!
//                if (year % 400 == 0) {
//                    return true;
//                }
                return false;
            }
            return true;
        }
        return false;
    }
}

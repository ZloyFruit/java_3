package com.PeopleInfo.impl;

import com.PeopleInfo.model.PersonInfo;
import com.PeopleInfo.model.PersonInfo.Nationality;
import com.PeopleInfo.spi.InfoFinder;

public class AllInfo implements InfoFinder {
    public PersonInfo findInfo() {
        return new PersonInfo("Chugunov", "Semen", "Vitalievich", 21, "Saratov", Nationality.RUSSIAN, 195.2, 82.5);
    }
}

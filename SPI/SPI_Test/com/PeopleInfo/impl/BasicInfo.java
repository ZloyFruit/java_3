package com.PeopleInfo.impl;

import com.PeopleInfo.model.PersonInfo;
import com.PeopleInfo.model.PersonInfo.Nationality;
import com.PeopleInfo.spi.InfoFinder;

public class BasicInfo implements InfoFinder {
    public PersonInfo findInfo() {
        return new PersonInfo("???", "Alexander", "???", 19, "???", Nationality.NONE, -1, -1);
    }
}

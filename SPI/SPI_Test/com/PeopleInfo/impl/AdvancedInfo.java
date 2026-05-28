package com.PeopleInfo.impl;

import com.PeopleInfo.model.PersonInfo;
import com.PeopleInfo.model.PersonInfo.Nationality;
import com.PeopleInfo.spi.InfoFinder;

public class AdvancedInfo implements InfoFinder {
    public PersonInfo findInfo() {
        return new PersonInfo("Borisov", "Anatoliy", "Anatolievich", 33, "Bryansk", Nationality.UNDEFINED, -1, -1);
    }
}

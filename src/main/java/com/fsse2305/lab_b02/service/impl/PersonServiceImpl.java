package com.fsse2305.lab_b02.service.impl;

import com.fsse2305.lab_b02.data.CreatePersonData;
import com.fsse2305.lab_b02.data.CreatedPersonData;

public interface PersonServiceImpl {

    CreatedPersonData createPerson(CreatePersonData createPersonData);
}

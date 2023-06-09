package com.fsse2305.lab_b02.service.impl;

import com.fsse2305.lab_b02.data.*;
import com.fsse2305.lab_b02.data.entity.PersonEntity;

import java.util.List;

public interface PersonServiceImpl {

    CreatedPersonData createPerson(CreatePersonData createPersonData);

    List<GetAllPersonData> getPerson();

    UpdatedPersonData updatePerson(UpdatePersonData updatePersonData);

    DeletedPersonData deletePerson(DeletePersonData deletePersonData);
}

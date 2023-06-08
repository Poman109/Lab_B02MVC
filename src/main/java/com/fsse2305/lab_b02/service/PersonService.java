package com.fsse2305.lab_b02.service;

import com.fsse2305.lab_b02.data.CreatePersonData;
import com.fsse2305.lab_b02.data.CreatedPersonData;
import com.fsse2305.lab_b02.data.UpdatePersonData;
import com.fsse2305.lab_b02.data.UpdatedPersonData;
import com.fsse2305.lab_b02.data.entity.PersonEntity;
import com.fsse2305.lab_b02.service.impl.PersonServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService implements PersonServiceImpl {
    private static List<PersonEntity> personEntityList = new ArrayList<>();


    @Override
    public CreatedPersonData createPerson(CreatePersonData createPersonData){
        //Lv1
//        PersonEntity personEntity = new PersonEntity(createPersonData);
//        personEntity.setFirstName(createPersonData.getFirstName());
//        personEntity.setLastName(createPersonData.getLastName());
//        personEntity.setHkid(createPersonData.getHkid());

        //Lv2
        PersonEntity personEntity = new PersonEntity(createPersonData);

        personEntityList.add(personEntity);

//          Lv1
//        CreatedPersonData createdPersonData = new CreatedPersonData();
//        createdPersonData.setFirstName(personEntity.getFirstName());
//        createdPersonData.setLastName(personEntity.getLastName());
//        createdPersonData.setHkid(personEntity.getHkid());

        //Lv2
        CreatedPersonData createdPersonData = new CreatedPersonData(personEntity);

        return createdPersonData;

    }

    @Override
    public List<PersonEntity> getPerson(){
        return personEntityList;
    }


    public UpdatedPersonData updatePerson(UpdatePersonData updatePersonData){
//        for(int i=0; i<personEntityList.size();i++ )

        for(PersonEntity personEntity1 : personEntityList){
            if (!personEntity1.getHkid().equals(updatePersonData.getHkid())){
                continue;
            }
            personEntity1.setLastName(updatePersonData.getLastName());
            personEntity1.setFirstName(updatePersonData.getFirstName());

            UpdatedPersonData updatedPersonData = new UpdatedPersonData(personEntity1);


            return updatedPersonData;

        }
        throw new NotFoundPeopleException();

    }

}

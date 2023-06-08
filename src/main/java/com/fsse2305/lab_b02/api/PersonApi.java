package com.fsse2305.lab_b02.api;

import com.fsse2305.lab_b02.data.CreatePersonData;
import com.fsse2305.lab_b02.data.CreatedPersonData;
import com.fsse2305.lab_b02.data.dto.CreatePersonRequestDto;
import com.fsse2305.lab_b02.data.dto.CreatePersonResponseDto;
import com.fsse2305.lab_b02.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonApi {

    private final PersonService personService;

    @Autowired
    public PersonApi(PersonService personService){
        this.personService = personService;
    }

    @PostMapping("/person")
    public CreatePersonResponseDto createPerson(@RequestBody CreatePersonRequestDto createPersonRequestDto){
//        CreatePersonData createPersonData = new CreatePersonData();
//        createPersonData.setFirstName(createPersonRequestDto.getFirstName());
//        createPersonData.setLastName(createPersonRequestDto.getLastName());
//        createPersonData.setHkid(createPersonRequestDto.getHkid());

        //LV2
        CreatePersonData createPersonData = new CreatePersonData(createPersonRequestDto);

        CreatedPersonData createdPersonData =  personService.createPerson(createPersonData);

//        Lv1
//        CreatePersonResponseDto createPersonResponseDto = new CreatePersonResponseDto();
//        createPersonResponseDto.setFirstName(createdPersonData.getFirstName());
//        createPersonResponseDto.setLastName(createdPersonData.getLastName());
//        createPersonResponseDto.setHkid(createdPersonData.getHkid());

        CreatePersonResponseDto createPersonResponseDto = new CreatePersonResponseDto(createdPersonData);


        return createPersonResponseDto;

    }



}

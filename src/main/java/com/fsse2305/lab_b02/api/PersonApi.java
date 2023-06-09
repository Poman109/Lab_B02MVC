package com.fsse2305.lab_b02.api;

import com.fsse2305.lab_b02.data.*;
import com.fsse2305.lab_b02.data.dto.*;
import com.fsse2305.lab_b02.data.entity.PersonEntity;
import com.fsse2305.lab_b02.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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

    @GetMapping("/person")
    public List<GetAllPersonResponseDto> getPerson(){

       List<GetAllPersonData> getAllPersonDataDatalist = personService.getPerson();
       List<GetAllPersonResponseDto> getAllPersonResponseDtoList = new ArrayList<>();
       for (GetAllPersonData getAllPersonData : getAllPersonDataDatalist){
          GetAllPersonResponseDto getAllPersonResponseDto = new GetAllPersonResponseDto(getAllPersonData);
          getAllPersonResponseDtoList.add(getAllPersonResponseDto);
       }
       return getAllPersonResponseDtoList;
    }

    @PutMapping("/person")
    public UpdatePersonResponseDto updatePerson(@RequestBody UpdatePersonRequestDto updatePersonRequestDto){
        UpdatePersonData updatePersonData = new UpdatePersonData(updatePersonRequestDto);
        UpdatedPersonData updatedPersonData = personService.updatePerson(updatePersonData);

        UpdatePersonResponseDto updatePersonResponseDto = new UpdatePersonResponseDto(updatedPersonData);


        return updatePersonResponseDto;

    }

    @DeleteMapping("/person")
    public DeletePersonResponseDto deletePerson(@RequestBody DeletePersonRequestDto deletePersonRequestDto){
        DeletePersonData deletePersonData = new DeletePersonData(deletePersonRequestDto);
        DeletedPersonData deletedPersonData = personService.deletePerson(deletePersonData);

        DeletePersonResponseDto deletePersonResponseDto = new DeletePersonResponseDto(deletedPersonData);
        return deletePersonResponseDto;

    }

    @GetMapping("/person/{last_name}")
    public List<GetPersonLastNameResponseDto> getPersonByLastName(@PathVariable String last_name){
        GetPersonByLastNameData getPersonByLastNameData = new GetPersonByLastNameData(last_name);
        List<GotPersonByLastNameData> gotPersonByLastNameDataArray = personService.getPersonByLastname(getPersonByLastNameData);

        List<GetPersonLastNameResponseDto> getPersonLastNameResponseDtoList = new ArrayList<>();
        for(GotPersonByLastNameData gotPersonByLastNameData: gotPersonByLastNameDataArray) {
            GetPersonLastNameResponseDto getPersonLastNameResponseDto = new GetPersonLastNameResponseDto(gotPersonByLastNameData);
            getPersonLastNameResponseDtoList.add(getPersonLastNameResponseDto);
        }

        return getPersonLastNameResponseDtoList;


    }









}

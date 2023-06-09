package com.fsse2305.lab_b02.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fsse2305.lab_b02.data.dto.GetPersonLastNameRequestDto;

public class GetPersonByLastNameData {

    private String lastName;

    public GetPersonByLastNameData(String lastName){
        this.lastName = lastName;
    }



    public String getLastName() {
        return lastName;
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}

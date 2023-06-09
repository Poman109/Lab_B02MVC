package com.fsse2305.lab_b02.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fsse2305.lab_b02.data.GotPersonByLastNameData;

public class GetPersonLastNameRequestDto {
    @JsonProperty("last_name")
    private String lastName;

    public GetPersonLastNameRequestDto(String lastName){
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

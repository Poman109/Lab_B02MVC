package com.fsse2305.lab_b02.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fsse2305.lab_b02.data.GotPersonByLastNameData;
import com.fsse2305.lab_b02.data.entity.PersonEntity;

public class GetPersonLastNameResponseDto {
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("hkid_number")
    private String hkid;

    public GetPersonLastNameResponseDto(GotPersonByLastNameData data){
        this.lastName = data.getLastName();
        this.firstName = data.getFirstName();
        this.hkid = data.getHkid();
    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getHkid() {
        return hkid;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHkid(String hkid) {
        this.hkid = hkid;
    }

}

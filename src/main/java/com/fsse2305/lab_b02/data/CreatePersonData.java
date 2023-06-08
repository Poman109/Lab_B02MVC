package com.fsse2305.lab_b02.data;

import com.fsse2305.lab_b02.data.dto.CreatePersonRequestDto;
import com.fsse2305.lab_b02.data.dto.CreatePersonResponseDto;

public class CreatePersonData {
    private String lastName;
    private String firstName;
    private String hkid;

    public CreatePersonData(CreatePersonRequestDto dto){
        this.lastName = dto.getLastName();
        this.firstName = dto.getFirstName();
        this.hkid = dto.getHkid();
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

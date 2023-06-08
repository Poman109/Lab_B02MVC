package com.fsse2305.lab_b02.data;

import com.fsse2305.lab_b02.data.dto.UpdatePersonRequestDto;
import com.fsse2305.lab_b02.data.dto.UpdatePersonResponseDto;

public class UpdatePersonData {
    private String lastName;
    private String firstName;
    private String hkid;

    public UpdatePersonData(UpdatePersonRequestDto updatePersonRequestDto){
        this.lastName = updatePersonRequestDto.getLastName();
        this.firstName = updatePersonRequestDto.getFirstName();
        this.hkid = updatePersonRequestDto.getHkid();

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

package com.fsse2305.lab_b02.data;

import com.fsse2305.lab_b02.data.dto.CreatePersonResponseDto;
import com.fsse2305.lab_b02.data.entity.PersonEntity;

public class CreatedPersonData {
    private String lastName;
    private String firstName;
    private String hkid;

 public CreatedPersonData(PersonEntity entity){
     this.lastName = entity.getLastName();
     this.firstName = entity.getFirstName();
     this.hkid = entity.getHkid();

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

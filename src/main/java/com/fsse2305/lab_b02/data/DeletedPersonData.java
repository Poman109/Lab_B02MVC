package com.fsse2305.lab_b02.data;

import com.fsse2305.lab_b02.data.entity.PersonEntity;

public class DeletedPersonData {
    private String lastName;
    private String firstName;
    private String hkid;

    public DeletedPersonData(PersonEntity personEntity){
        this.lastName = personEntity.getLastName();
        this.firstName = personEntity.getFirstName();
        this.hkid = personEntity.getHkid();
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

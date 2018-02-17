package hackcewit2018;

import java.util.Date;
import javafx.scene.image.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsli
 */
public class ClientProfile {

    private String name;
    private Address address;
    
    private Date dateOfBirth;
    private Gender gender;
    private String ssn;
    
    private Image image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    public ClientProfile(String name, String address, String city, State state, int zip, Date dateOfBirth, Gender gender, String ssn, Image image) {
        this.name = name;
        this.address = new Address(address, city, state, zip);
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.ssn = ssn;
        this.image = image;
    }
    
}

class Address {
    private String address;
    private String city;
    private State state;
    private int zip;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    
    public Address(String address, String city, State state, int zip) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    @Override
    public String toString() {
        return this.address + "\n" + this.city + ", " + this.state + " " + this.zip;
    }
}

enum Gender {
    M,
    F,
    T // Trans
}

enum State {
    AL, 
    AK,
    AZ,
    AR,
    CA,
    CO,
    CT,
    DE,
    FL,
    GA,
    HI,
    ID,
    IL,
    IN,
    IA,
    KS,
    KY,
    LA,
    ME,
    MD,
    MA,
    MI,
    MN,
    MS,
    MO,
    MT,
    NE,
    NV,
    NH,
    NJ,
    NM,
    NY,
    NC,
    ND,
    OH,
    OK,
    OR,
    PA,
    RI,
    SC,
    SD,
    TN,
    TX,
    UT,
    VT,
    VA,
    WA,
    WV,
    WI,
    WY,
    // Special areas
    DC
}

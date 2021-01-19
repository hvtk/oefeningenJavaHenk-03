package LeisureActivity;

import java.util.ArrayList;
import java.util.List;

public class ClubMembersInfo {
    private String firstname;
    private String lastname;
    private String residence;
    private String country;
    private String age;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getResidence() {
        return residence;
    }

    public String getCountry() {
        return country;
    }

    public String getAge() {
        return age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ClubMembersInfo(String firstname, String lastname, String residence, String country, String age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.residence = residence;
        this.country = country;
        this.age = age;
    }
}

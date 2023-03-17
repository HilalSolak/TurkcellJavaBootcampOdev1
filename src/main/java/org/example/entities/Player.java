package org.example.entities;

public class Player {
    private int id;
    private String identityNumber;
    private String firstName;
    private String lastName;
    private String nickname;
    private String birthday;

    public Player() {
    }

    public Player(int id, String identityNumber, String firstName, String lastName, String birthday, String nickname) {
        this.id = id;
        this.identityNumber = identityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}

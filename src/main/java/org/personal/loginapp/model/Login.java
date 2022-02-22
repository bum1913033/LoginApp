package org.personal.loginapp.model;

public class Login {
    private int id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    public Login(){

    }
    public Login(int id , String userName, String password , String firstName , String lastName){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() { return id;}
    public void setId(int id) {this.id = id;}

    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public String getFirstName() {return this.firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}


    @Override
    public String toString(){
        return "Login{" +
                "id" + id
                +", userName='" + userName + '\''
                +", password='"+ password + '\''
                +", firstName='"+ firstName + '\''
                +", lastName='"+ lastName+ '\''
                +'}';
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini;

/**
 *
 * @author rashmsam
 */
public class Quote {

	
        private Integer term;
        private Float sumAssured;
        private String userName;
	private String firstName;
	private String lastName;
	private Integer age;
	//private Date dob;
	private Character smokerFlag;
	private String state;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public Character getSmokerFlag() {
        return smokerFlag;
    }

    public void setSmokerFlag(Character smokerFlag) {
        this.smokerFlag = smokerFlag;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public Float getSumAssured() {
        return sumAssured;
    }

    public void setSumAssured(Float sumAssured) {
        this.sumAssured = sumAssured;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
        
     @Override
     public String toString(){    
         return  this.firstName +"| " + this.lastName +"|" + this.age + "|"+ this.sumAssured;
     }
        
}

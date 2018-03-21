package com.ttn.linksharing
//
/*
    Email should be unique, email type, not null, not blank
    Password should be not null, not blank and minimum 5 charactes
    FirstName,LastName shoule not be null and not blank
    Photo, Admin and Active field can be null
    Write test cases for validating user (including username and email uniqueness)

*/

class User {

    String email
    String userName
    String password
    String firstName
    String lastName
    byte photo
    boolean admin
    boolean active
    Date dateCreated
    Date lastUpdated

    static constraints = {
        email(unique: true,email: true,blank: false,nullable: false)
        password(blank: false,nullable: false,size: 5..15)
        firstName(blank: false,nullable: false)
        lastName(blank: false,nullable: false)
        photo(nullable:true)
        admin(nullable:true)

    }
}

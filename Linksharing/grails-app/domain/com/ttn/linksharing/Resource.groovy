package com.ttn.linksharing

/*
Add Resource abstract domain as parent class
and 2 child classes Document Resource domain and Link Resource domain
*/
/*
Resource should have createdBy, description and topic*/
abstract class Resource {
    String description
    User createdBy
    Topic topic
    Date dateCreated
    Date lastCreated



}

package com.ttn.linksharing

//Description of resource should be of text type
abstract class Resource {
    String description
    Date dateCreated
    Date lastUpdated
    static hasMany = [createdBy:User, topics:Topic]
    static constraints = {
        description(type:'text')
    }
}

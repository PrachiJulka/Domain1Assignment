package com.ttn.linksharing

abstract class Resource {
    String description
    Date dateCreated
    Date lastUpdated
    static hasMany = [createdBy:User, topics:Topic]
    static constraints = {

    }
}

package com.ttn.linksharing

/*
Add subscription domain and seriousness enum.Add following constaints:

topic Topic
user User
dateCreated
seriousness=Enum:serious,verSerious,Casual

User,topic, seriousness should not be null
User should not be able to subscribe to topic multiple times
Write test cases for validating subscription domain
*/


class Subscription {

    Date dateCreated
    Seriousness seriousness
    static belongsTo = [ user : User,topic:Topic]


    static constraints = {
        user(blank: false, nullable: false, unique: 'user')
        topic(nullable: false,blank: false, unique: 'user')
        seriousness(nullable: false, blank:false)
    }
}

package com.ttn.linksharing

import grails.test.hibernate.HibernateSpec


class TopicSpec extends HibernateSpec{
    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
        false == false
    }
    def "Topic name should be unique per user"() {
        setup:
        String email = "prachijulka@tothenew.com"
        String password = 'p1231'
        User user = new User(email: email,userName:"prachiJ",password:password, firstName: "Prachi", lastName: "Julka",admin:false,active:true)

        when:
        Topic topic = new Topic()
        topic.createdBy = user
        topic.name = "topic"

        topic.visibility = Visibility.PRIVATE
        user.addToTopics(topic)
        user.save(flush:true)

        Topic topic1 = new Topic() 
        topic1.name = "topic"
        topic1.createdBy = user
        topic1.visibility = Visibility.PUBLIC
        user.addToTopics(topic1)
        user.validate()

        then:
       user.errors.hasErrors()==true
    }


 /*   def "Topic name should not be null or blank"(){
        setup:

        String email = "prachijulka@tothenew.com"
        String password = 'p1231'
        User user = new User(email: email,userName:"prachiJ",password:password, firstName: "Prachi", lastName: "Julka",admin:false,active:true)

        when:
        Topic topic = new Topic(name:"sd",visibility: Visibility.PUBLIC,createdBy: user)
        user.addToTopics(topic)
        user.save()
//
        then:
       // println("ok")
       user.errors.hasErrors() == true
*//*
       when:
        Topic topic1 = new Topic(name: null,createdBy: user,visibility: Visibility.PUBLIC)
        user.addToTopics(topic1)
        user.save()

        then:
        user.errors.hasErrors() == true
*//*


    }*/

}
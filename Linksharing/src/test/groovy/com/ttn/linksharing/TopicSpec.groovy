package com.ttn.linksharing

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TopicSpec extends Specification implements DomainUnitTest<Topic> {

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
        String email="prachi@gmail.com"
        User user =new User(email: email,userName:"prachiJ",password:"p12345", firstName: "Prachi", lastName: "Julka",admin:false,active:true)

        when:
        Topic topic=new Topic(name: "topic",createdBy:user,Visibility:Visibility.PRIVATE )
        user.addToTopics(topic)
       // user.save(flush:true)
       /* then:
        user.count() == 1

        when:
       */
        Topic topic1=new Topic(name: "topic",createdBy:user,Visibility:Visibility.PUBLIC )
        user.addToTopics(topic1)

        topic1.validate()
        user.save(flush:true)


        then:
        List<Topic> t1 = Topic.findAllByName("topic");
        Topic.count() == 1
        topic1.errors.hasErrors()==true
        topic1.errors.allErrors.size() == 1


    }
}

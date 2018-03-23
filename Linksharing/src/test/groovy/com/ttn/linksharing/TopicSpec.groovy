package com.ttn.linksharing

import grails.test.hibernate.HibernateSpec
import grails.testing.gorm.DomainUnitTest
import org.springframework.boot.test.mock.mockito.MockBean
import spock.lang.Specification

class TopicSpec extends Specification implements DomainUnitTest<Topic> {

    def "Topic name should be unique per user"() {
        setup:
        String email = "prachijulka@tothenew.com"
        String password = 'p1231'
        User user = new User(email: email,userName:"prachiJ",password:password, firstName: "Prachi", lastName: "Julka",admin:false,active:true)

        when:
        Topic topic = new Topic()
        topic.createdBy = user
        topic.name = "topic"
        topic.metaClass.getCreatedBy ={
            user
        }
        topic.visibility = Visibility.PRIVATE
        topic.save()

        Topic topic1 = new Topic() 
        topic1.name = "topic"
        topic1.createdBy = user
        topic1.visibility = Visibility.PUBLIC
        topic1.save()

        then:
        topic1.errors.hasErrors()
    }


    def "Topic name should not be null or blank"(){
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
/*
       when:
        Topic topic1 = new Topic(name: null,createdBy: user,visibility: Visibility.PUBLIC)
        user.addToTopics(topic1)
        user.save()

        then:
        user.errors.hasErrors() == true
*/


    }

}
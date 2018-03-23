package com.ttn.linksharing

class BootStrap {

    def init = { servletContext ->
        User user=new User()
        user.setFirstName("Prachi")
        user.setLastName("Julka")
        user.email="prachijulka31@gmail.com"
        user.password="123jn"
        user.userName="abc"
        user.lastUpdated
        user.dateCreated

        Topic topic = new Topic(name:"sd",password:"asdasd",visibility: Visibility.PUBLIC)
        user.addToTopics(topic)


      /*  Topic topic=new Topic()
        topic.user=user
        topic.name="topic"
        topic.visibility=Visibility.PRIVATE
*/
       /* Topic topic1=new Topic()*/
       /* topic1.name="topic"*/
       /* topic1.user=user*/
       /* topic1.visibility=Visibility.PUBLIC*/
       /* user.addToTopic(topic)*/
/*
*/

       /* Topic topic3=new Topic()*/
       /* topic3.user=user*/
       /* topic3.name="topic"*/
       /* topic3.visibility=Visibility.PRIVATE*/
/*
*/


      /*  user.addToTopic(topic)
      */ /* user.addToTopic(topic1)*/
        user.validate()
        println(user.errors.allErrors)
        println user.save()
    }
    def destroy = {
    }
}

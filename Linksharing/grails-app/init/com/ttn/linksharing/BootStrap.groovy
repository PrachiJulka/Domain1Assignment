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
         user.save()
    }
    def destroy = {
    }
}

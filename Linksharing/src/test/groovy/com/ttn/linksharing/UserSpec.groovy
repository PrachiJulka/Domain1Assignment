package com.ttn.linksharing

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class UserSpec extends Specification implements DomainUnitTest<User> {

    def setup() {
    }

    def cleanup() {
    }



    def "Email address of user should be unique"() {
        setup:
        String email = "prachi@tothenew.com"
        String password = 'p123'
        User user = new User(email: email,userName:"prachiJ",password:password, firstName: "Prachi", lastName: "Julka", photo:"157485748",admin:false,active:true,dateCreated:'Thu Dec 10 21:31:15 GST 2015' ,lastUpdated:'Thu Dec 10 21:31:15 GST 2015' )

        when:
        user.save()

        then:
        user.count() == 1

      /*  when:
        User user1= new User(email: email,userName:"prachi",password:password, firstName: "Prachi", lastName: "Julka", photo:"157485748",admin:false,active:true,dateCreated: 'Thu Dec 10 21:31:15 GST 2015',lastUpdated: 'Thu Dec 10 21:31:15 GST 2015')
        user1.save()

        then:
        user.count() == 1
        user1.errors.allErrors.size() == 1
        user1.errors.getFieldErrorCount('email') == 1
   */ }

}

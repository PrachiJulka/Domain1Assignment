package com.ttn.linksharing

class IndexController {

    def index() {
        log.info 'from log info'
        //log.warn 'from log warn'
        log.println("hi")
        log.trace('Hello')



    }
}

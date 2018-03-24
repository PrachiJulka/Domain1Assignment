package com.ttn.linksharing
//Link Resource should have valid url
class LinkResource extends Resource {

    String url

    static hasMany = [subordinates: Resource]
    static constraints = {
        url(url: true)
    }
}

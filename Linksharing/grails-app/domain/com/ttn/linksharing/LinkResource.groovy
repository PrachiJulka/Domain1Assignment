package com.ttn.linksharing

class LinkResource extends Resource {

    static hasMany = [subordinates: Resource]

}

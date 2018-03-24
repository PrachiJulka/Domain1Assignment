package com.ttn.linksharing

class DocumentResource extends Resource {

    static hasMany = [subordinates: Resource]
    static constraints = {
    }
}

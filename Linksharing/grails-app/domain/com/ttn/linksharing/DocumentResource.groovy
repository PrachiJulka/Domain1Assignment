package com.ttn.linksharing
//Document resource should have filepath
class DocumentResource extends Resource {

    String filePath

    static hasMany = [subordinates: Resource]
    static constraints = {
    }
}

package net.xioh.qprise.accountElement


class Element {
    //TODO: revisar las relaciones
    Boolean isActive
    String name
    String description
    String valueFormat
    String elementType
    Boolean isBalancing
    Boolean isNaturalAccount

    static hasMany = [elementValues:ElementValue]

    static constraints = {
    }
}


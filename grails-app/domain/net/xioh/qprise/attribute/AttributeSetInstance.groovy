package net.xioh.qprise.attribute

class AttributeSetInstance {

    Boolean isActive
    AttributeSet attributeSet//foranea
    String serNo
    String lot
    Date guaranteeDate
    String description
    //TODO: revisar nombre "lot" ya existe
    //Lot lot//foranea
    Boolean isLocked
    String lockDescription

    static constraints = {
    }
}

package net.xioh.qprise.attribute

class AttributeSet {

    Boolean isActive
    String name
    String description
    Boolean isSerNo
    //SerNoCtl serNoCtl//foranea
    Boolean isLot
    //LotCtl lotCtl//foranea
    Boolean isGuaranteeDate
    Double guaranteeDays//tipo de dato decimal 10.0
    Boolean isLockable

    static constraints = {
    }
}

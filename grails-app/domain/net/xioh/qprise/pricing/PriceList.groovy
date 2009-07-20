package net.xioh.qprise.pricing

import net.xioh.qprise.currency.*

class PriceList {

    Boolean isActive
    String name
    String description
    PriceList basePriceList//foranea
    Boolean isTaxIncluded
    Boolean isSOPriseList
    Boolean isDefault
    Currency currency//foranea
    Boolean enforcePriceLimit

    static constraints = {
    }
}

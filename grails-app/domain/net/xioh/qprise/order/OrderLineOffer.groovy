package net.xioh.qprise.order

import net.xioh.qprise.pricing.*

class OrderLineOffer {

    Boolean isActive
    OrderLine orderLine//foranea
    Double line
    Offer offer//foranea
    BigDecimal priceOffer//moneda
    BigDecimal amtOffer//TODO: revisar tipo dato

    static constraints = {
    }
}


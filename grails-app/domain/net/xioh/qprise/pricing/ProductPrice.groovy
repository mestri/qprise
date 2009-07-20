package net.xioh.qprise.pricing

import net.xioh.qprise.product.*

class ProductPrice {

    PriceListVersion priceListVersion//foranea
    Product product//foranea
    Boolean isActive
    BigDecimal priceList
    BigDecimal priceStandard//TODO: se combio el nombre priceStd
    BigDecimal priceLimit

    static constraints = {
    }
}

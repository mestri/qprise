package net.xioh.qprise.pricing

class PriceListVersion {

    Boolean isActive
    String name
    String description
    PriceList priceList//foranea
    DiscountSchema discountSchema//foranea
    Date validFrom
    Boolean procCreate
    PriceListVersion priceListVersionBase//foranea
    Boolean priceListVersionGenerate

    static constraints = {
    }
}

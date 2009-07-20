package net.xioh.qprise.warehouse

import net.xioh.qprise.location.*

class Freight {

    Boolean isActive
    Shipper shipper
    FreightCategory freightCategory
    Date validFrom
    Country country
    Country toCountry
    Region region
    Region toRegion
    Currency currency
    BigDecimal freightAmt = 0
    String freightUnit
    Boolean isPrice
    String lineRound
    BigDecimal qtyFrom
    BigDecimal qtyTo
    String totalRound

    static constraints = {
    }
}

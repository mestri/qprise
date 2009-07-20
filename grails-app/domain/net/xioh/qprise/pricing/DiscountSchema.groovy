package net.xioh.qprise.pricing

class DiscountSchema {

    Boolean isActive
    String name
    String description
    Date validFrom
    String discountType
    String script//revidsar tipo dato nvarchar 2000
    Double flatDiscount
    Boolean isQuantityBased
    String cumulativeLevel
    Boolean processing

    static constraints = {
    }
}

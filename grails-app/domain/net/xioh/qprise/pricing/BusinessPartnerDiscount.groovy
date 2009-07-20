package net.xioh.qprise.pricing

import net.xioh.qprise.businessPartner.*

class BusinessPartnerDiscount {

    Boolean isActive
    BusinessPartner businessPartner//foranea
    Discount discount//foranea
    Double line
    Boolean isCascade
    Boolean isCustomer
    Boolean isVendor

    static constraints = {
    }
}

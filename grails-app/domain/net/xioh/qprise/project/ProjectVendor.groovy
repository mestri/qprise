package net.xioh.qprise.project

import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.pricing.*

class ProjectVendor {

    //Integer projectVendorId;
    Boolean isActive
    Project project//foranea
    BusinessPartner businessPartner//foranea
    String note
    String priceListVersionId
    //InCoTerms inCoTerms//foranea
    String inCoTermsDescription
    PriceList priceList//foranea
    Boolean generateOrder

    static constraints = {
    }
}

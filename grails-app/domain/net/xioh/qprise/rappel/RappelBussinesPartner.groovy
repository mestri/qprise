package net.xioh.qprise.rappel
import net.xioh.qprise.businessPartner.*

class RappelBussinesPartner {

    Boolean isActive
    Rappel rappel//foranea
    BusinessPartner businessPartner//foranea
    Boolean isSOTrx
    Date validFrom
    Date validTo
    Double seqNo//decimal 10.0
    Boolean generateInvoice

    static constraints = {
    }
}

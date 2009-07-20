package net.xioh.qprise.tax.payment
import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.currency.*
import net.xioh.qprise.payment.management.*

class TaxPayment {

    Boolean isActive
    Date dateFrom
    Date dateTo
    Boolean generatePayment
    Boolean processing
    String processed
    Settlement settlement//foranea
    String journalId//TODO: revisar nombre GL_JOURNAL_ID
    String name
    Boolean createFrom
    //AcctSchema acctSchema//foranea
    Currency currency//foranea
    BusinessPartner businessPartner//foranea


    static constraints = {
    }
}

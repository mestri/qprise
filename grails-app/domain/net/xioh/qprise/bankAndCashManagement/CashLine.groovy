package net.xioh.qprise.bankAndCashManagement

import net.xioh.qprise.currency.*
import net.xioh.qprise.order.*
import net.xioh.qprise.payment.management.*

class CashLine {

    //Integer cashLineId;
    Boolean isActive
    Cash cash//foranea
    Double line
    String description
    String cashType
    Charge charge//foranea
    Currency currency//foranea
    BigDecimal amount//moneda
    BigDecimal discountAmt//moneda
    BigDecimal writeOffAmt//moneda
    Boolean isGenerated
    //TODO: revisar nombre clase (order)
    Orders orders//foranea
    DebtPayment debtPayment//foranea
    GLItem gLItem//foranea
    Boolean payInAdvance

    static constraints = {
    }
}

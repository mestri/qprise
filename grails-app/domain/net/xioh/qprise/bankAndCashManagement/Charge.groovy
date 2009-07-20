package net.xioh.qprise.bankAndCashManagement

import net.xioh.qprise.tax.*

class Charge {

    //Integer chargeId;
    Boolean isActive
    String name
    String description
    BigDecimal chargeAmt//moneda
    Boolean isSameTax
    Boolean isSameCurrency
    TaxCategory taxCategory//foranea
    Boolean isTaxIncluded

    static constraints = {
    }
}

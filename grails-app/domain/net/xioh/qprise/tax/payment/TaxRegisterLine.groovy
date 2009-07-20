package net.xioh.qprise.tax.payment

import net.xioh.qprise.tax.*
import net.xioh.qprise.invoice.*

class TaxRegisterLine {

    Boolean isActive
    TaxRegisterLine taxRegisterLine//revisar: no es foranea
    TaxRegister taxRegister//foranea
    InvoiceTax invoiceTax//foranea
    String documentNo
    Tax tax//foranea
    Double taxBaseAmt//TODO: revisar tipo dato decimal 10.0 moneda?
    Double taxAmt//moneda?
    Double totalAmt//moneda?
    Double taxUndAmt//moneda?
    Date invoiceDate
    Double exemptAmt//moneda?
    Double noVatAmt//moneda?
    String name

    static constraints = {
    }
}

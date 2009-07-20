package net.xioh.qprise.tax.payment

import net.xioh.qprise.payment.management.*

class TaxRegisterType {

    Boolean isActive
    String registerName
    String reportName
    String description
    Sequence sequence//foranea
    String help
    GLItem gLItem//foranea
    Boolean isSOTrx

    static constraints = {
    }
}

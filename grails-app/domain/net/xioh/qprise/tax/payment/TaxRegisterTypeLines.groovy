package net.xioh.qprise.tax.payment

import net.xioh.qprise.documentType.*
import net.xioh.qprise.tax.*

class TaxRegisterTypeLines {

    Boolean isActive
    TaxRegisterType taxRegisterType//foranea
    Tax tax//foranea
    DocumentType documentType//foranea


    static constraints = {
    }
}

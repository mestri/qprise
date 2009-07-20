package net.xioh.qprise.bankAndCashManagement

import net.xioh.qprise.location.*
import net.xioh.qprise.businessPartner.*

class Bank {

    //Integer bankId;
    Boolean isActive
    String name
    String routingNo
    Location location//foranea tabla: Location
    String swiftCode
    Boolean isOwnBank
    String codeBank
    String codeBranch
    Boolean digitControl
    String ineNumber
    BusinessPartner businessPartner//foranea tabla: BPartner
    Country country//foranea tabla: Country

    static constraints = {
    }
}

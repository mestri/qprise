package net.xioh.qprise.payment.management

import net.xioh.qprise.bankAndCashManagement.*

class Remittance {

    //Integer remittanceId
    Boolean isActive
    String name
    Boolean createFrom
    BankAccount bankAccount//foranea
    DPManagement dPManagement//foranea
    RemittanceType remittanceType//foranea
    Settlement settlement//foranea
    Date dateTrx
    String documentNo
    Date dueDate
    Boolean getFile
    String processed
    Boolean processing

    static constraints = {
    }
}

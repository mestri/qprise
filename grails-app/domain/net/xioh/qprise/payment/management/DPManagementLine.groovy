package net.xioh.qprise.payment.management

class DPManagementLine {

    //Integer dPManagementLineId
    Boolean isActive
    DPManagement dPManagement//foranea
    String statusFrom
    String statusTo
    DebtPayment debtPayment//foranea
    Double line

    static constraints = {
    }
}

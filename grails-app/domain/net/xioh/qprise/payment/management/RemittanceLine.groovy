package net.xioh.qprise.payment.management

class RemittanceLine {

    //Integer remittanceLineId
    Boolean isActive
    Remittance remittance//foranea
    Double line
    DebtPayment debtPayment//foranea
    DebtPayment debtPaymentCancelled//foranea
    Boolean returned

    static constraints = {
    }
}

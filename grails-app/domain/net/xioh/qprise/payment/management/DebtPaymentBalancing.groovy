package net.xioh.qprise.payment.management

class DebtPaymentBalancing {

    //Integer debtPaymentBalancingId
    Boolean isActive
    DebtPayment debtPayment//foranea
    Double amountDebit
    Double amountCredit
    GLItem gLItem//foranea

    static constraints = {
    }
}

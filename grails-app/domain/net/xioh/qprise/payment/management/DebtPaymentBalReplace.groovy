package net.xioh.qprise.payment.management

class DebtPaymentBalReplace {

    //Integer debtPaymentBalReplaceId
    Boolean isActive
    DebtPayment debtPayment//foranea
    Double amountDebit
    Double amountCredit
    GLItem gLItem//foranea
    Boolean replacing

    static constraints = {
    }
}

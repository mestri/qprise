package net.xioh.qprise.payment.management

class RemittanceType {

    //Integer remittanceTypeId
    Boolean isActive
    String name
    Boolean consolidate
    String statusTo
    String paymentRuleConsolidated
    String statusReturned
    Boolean isReceipt

    static constraints = {
    }
}

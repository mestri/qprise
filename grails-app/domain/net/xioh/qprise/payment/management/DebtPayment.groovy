package net.xioh.qprise.payment.management

import net.xioh.qprise.invoice.*
import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.currency.*
import net.xioh.qprise.bankAndCashManagement.*
import net.xioh.qprise.order.*
import net.xioh.qprise.project.*

class DebtPayment {

    //Integer debtPaymentId
    Boolean isActive
    Boolean isReceipt
    Settlement settlementCancel//foranea tabla Settlement
    Settlement settlementGenerate//foranea tabla Settlement
    String description
    Invoice invoice//foranea
    BusinessPartner businessPartner//foranea
    Currency currency//foranea
    CashLine cashLine//foranea
    BankAccount bankAccount//foranea
    CashBook cashBook//foranea
    String paymentRule
    Boolean isPaid
    Double amount
    Double writeOffAmt
    Date datePlanned
    Boolean isManual
    Boolean isValid
    BankStatementLine bankStatementLine//foranea
    Boolean chargeSettlementCancel
    Boolean cancelProcessed
    Boolean generateProcessed
    String gLItemAmt
    Boolean isDirectPosting
    GLItem gLItem//foranea
    Orders orders//foranea
    Project project//foranea
    Boolean isAutomaticGenerated
    String status
    String statusInitial
    //Withholding withholding//foranea
    Double withholdingAmount

    static constraints = {
    }
}

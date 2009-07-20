package net.xioh.qprise.bankAndCashManagement

import net.xioh.qprise.currency.*
import net.xioh.qprise.payment.management.*

class BankStatementLine {

    //Integer bankStatementLineId;
    Boolean isActive;
    BankStatement bankStatement;//foranea
    Double line;
    String description;
    Date valutaDate;
    Date dateAcct;
    Currency currency;//foranea
    BigDecimal trxAmt;//moneda
    BigDecimal stmtAmt;//moneda
    Charge change;//foranea
    BigDecimal chargeAmt;//moneda
    String memo;
    String referenceNo;
    DebtPayment debtPayment;//foranea
    BigDecimal convertChargeAmt;//moneda
    Boolean debtPaymentCreate;
    DPManagement dPManagement;//foranea
    GLItem gLItemId;

    static constraints = {
    }
}

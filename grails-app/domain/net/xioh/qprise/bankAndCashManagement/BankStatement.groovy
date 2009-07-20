package net.xioh.qprise.bankAndCashManagement

class BankStatement {

    //Integer bankStatementId;
    Boolean isActive
    BankAccount bankAccount//foranea
    String name
    String description
    Boolean isManual
    Date statementDate
    BigDecimal beginningBalance//moneda
    BigDecimal endingBalance//moneda
    BigDecimal statementDifference//moneda
    Boolean createdFrom
    Boolean processing
    String processed
    String posted

    static constraints = {
    }
}

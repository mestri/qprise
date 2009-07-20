package net.xioh.qprise.bankAndCashManagement

import net.xioh.qprise.currency.*

class BankAccount {

    //Integer bankAccountId;
    Boolean isActive;
    Bank bank//foranea tabla: Bank
    Currency currency//foranea tabla: Currency
    String bankAccountType
    String accountNo
    Double currentBalance
    BigDecimal creditLimit//moneda
    Boolean isDefault
    String codeAccount
    Boolean digitControl
    String iBan//TODO:revisar nombre...
    String genericAccount
    Boolean showGeneric
    Boolean showSpanish
    Boolean showIBan//TODO: revisar nombre...
    String displayedAccount

    static constraints = {
    }
}

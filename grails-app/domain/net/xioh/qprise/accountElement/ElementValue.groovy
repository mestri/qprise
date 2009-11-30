package net.xioh.qprise.accountElement
import net.xioh.qprise.bankAndCashManagement.*
import net.xioh.qprise.currency.*

class ElementValue {
    //TODO: revisar las relaciones
    Boolean isActive
    String value
    String name
    String description
    String AccountType
    String accountSign
    Boolean isDocControlled
    //Element element
    Boolean isSumary
    Date validFrom
    Date validTo
    Boolean postBudget
    Boolean postEncumbrance
    Boolean postStatistical
    Boolean isBankAccount
    //BankAccount bankAccount
    Boolean isForeignCurrency
    //Currency currency
    String showElement
    String showValueCond
    String elementLevel

    static belongsTo = [element:Element, bankAccount:BankAccount, currency:Currency]
    static hasMany = [elementValueOperators:ElementValueOperator, elementValueTranslations:ElementValueTranslation]

    static constraints = {
    }
}


package net.xioh.qprise.accountElement
import net.xioh.qprise.bankAndCashManagement.*

class ElementValueOperand {
    //TODO: revisar las relaciones
    Boolean isActive
    String sign
    //ElementValue elementValue
    //TODO: cual es la cuenta natural?
    //BsnkAccount bankAccount
    Double seqNo

    static belongsTo = [elementValue:ElementValue]

    static constraints = {
    }
}


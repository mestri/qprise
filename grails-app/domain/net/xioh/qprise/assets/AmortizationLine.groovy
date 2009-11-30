package net.xioh.qprise.assets
import net.xioh.qprise.currency.*

class AmortizationLine {
    //TODO: revisar relaciones
    //Amortization amortization
    String line
    BigDecimal amortizationPercentage
    Double amortizationAmt
    //Asset asset
    //Currency currency

    static belongsTo = [amortization:Amortization, asset:Asset, currency:Currency]

    static constraints = {
    }
}


package net.xioh.qprise.unitOfMeasure

class Uom {

    Boolean isActive
    String x12De355//revisar nombre y tipo dato char 2
    String uomSymbol
    String name
    String description
    Double stdPrecision//revisar tipo dato moneda?
    Double costingPrecision
    Boolean isDefault
    Boolean breakDown

    static constraints = {
    }
}

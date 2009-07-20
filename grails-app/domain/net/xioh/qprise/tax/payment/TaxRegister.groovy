package net.xioh.qprise.tax.payment

class TaxRegister {

    Boolean isActive
    Double lastregaccumamt//TODO: revisar nombre y tipo dato decimal 10.0
    TaxPayment taxPayment//foranea
    Double taxTotalAmt//revisar tipo dato moneda?
    String name
    TaxRegisterType taxRegisterType//foranea
    Double pageNo


    static constraints = {
    }
}

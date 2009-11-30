package net.xioh.qprise.order

import net.xioh.qprise.tax.*

class OrderTax {

    Orders orders//foranea
    Tax tax//foranea
    Boolean isActive
    Double taxBaseAmt//revisar tipo dato moneda?
    Double taxAmt//revisar tipo dato moneda?
    Double line

    static constraints = {
    }
}


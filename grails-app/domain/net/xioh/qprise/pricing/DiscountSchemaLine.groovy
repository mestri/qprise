package net.xioh.qprise.pricing

import net.xioh.qprise.product.*
import net.xioh.qprise.businessPartner.*

class DiscountSchemaLine {

    Boolean isActive
    DiscountSchema discountSchema//forana
    Double seqNo//revisar tipo dato y nombre
    ProductCategory productCategory//foranea
    BusinessPartner businessPartner//foranea
    Product product//foranea
    String conversionRateType
    Date conversionDate
    String listBase
    Double listAddAmt//TODO: revisar tipo dato (moneda?) y nombre
    Double listDiscount
    String listRounding
    Double listMinAmt//revisar (moneda?)
    Double listMaxAmt//revisar (moneda?)
    Double listFixed//revisar (moneda?)
    String stdBase//revisar nombre sugerencia: standardBase
    Double stdAddAmt
    Double stdDiscount
    String stdRounding
    Double stdMinAmt
    Double stdMaxAmt
    Double stdFixed
    String limitBase
    Double limitAddAmt
    Double limitDiscount
    String limitRounding
    Double limitMinAmt
    Double limitMaxAmt
    Double limitFixed

    static constraints = {
    }
}

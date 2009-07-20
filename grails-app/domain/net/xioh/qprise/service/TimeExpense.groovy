package net.xioh.qprise.service

import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.pricing.*
import net.xioh.qprise.warehouse.*

class TimeExpense {

    //Integer timeExpenceId;
    Boolean isActive
    String documentNo
    BusinessPartner businessPartner//foranea
    Date dateReport
    String description
    Boolean processing
    String processed
    PriceList priceList//foranea
    Warehouse warehouse//foranea

    static constraints = {
    }
}

package net.xioh.qprise.service

import net.xioh.qprise.unitOfMeasure.*
import net.xioh.qprise.product.*
import net.xioh.qprise.tax.*

class ExpenseType {

    //Integer expenseTypeId;
    Boolean isActive
    String value
    String name
    String description
    Boolean isInvoiced
    Uom uom//foranea
    ProductCategory productCategory//foranea
    TaxCategory taxCategory//foranea


    static constraints = {
    }
}

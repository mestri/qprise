package net.xioh.qprise.product

import net.xioh.qprise.tax.*
import net.xioh.qprise.unitOfMeasure.*
import net.xioh.qprise.attribute.*
import net.xioh.qprise.warehouse.*
import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.manufacturingProcessPlan.*
import net.xioh.qprise.mrp.*
import net.xioh.qprise.resource.*
import net.xioh.qprise.service.*

class Product {

    Boolean isActive
    String value
    String name
    String description
    String documentNote
    String help
    String UPC
    String SKU
    Uom uom
    //User salesRep
    Boolean isSummary
    Boolean isStocked
    Boolean isPurchased
    Boolean isSold
    Boolean isBom
    Boolean isInvoicePrintDetails
    Boolean isPickListPrintDetails
    Boolean isVerified
    ProductCategory productCategory
    String classification
    Double volume
    Double weight
    Double shelfWidth
    Double shelfHeight
    Double shelfDepth
    TaxCategory taxCategory
    Resource resource
    Boolean discontinued
    Date discontinuedBy
    Boolean processing
    ExpenseType expenseType
    String productType
    String imageUrl
    String descriptionUrl
    Double guaranteeDays
    String versionNo
    AttributeSet attributeSet
    AttributeSetInstance attributeSetInstance
    String downloadUrl
    FreightCategory freightCategory
    Locator locator
    // TODO Revisar Image
    //Image image
    BusinessPartner businessPartner
    Boolean isPricePrinted
    String name2
    String costType
    BigDecimal costSid
    //Double stockMinxx
    Boolean enforceAttribute
    ProcessPlan processPlan
    Boolean production
    Double capacity
    Planner planner
    PlanningMethod planningMethod
    Long qtyMax
    Long qtyMin
    Long qtyStd
    Boolean qtyType
    Long stockMin
    

    static constraints = {
    }
}

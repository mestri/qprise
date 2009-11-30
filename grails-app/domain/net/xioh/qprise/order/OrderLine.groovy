package net.xioh.qprise.order

import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.product.*
import net.xioh.qprise.warehouse.*
import net.xioh.qprise.unitOfMeasure.*
import net.xioh.qprise.bankAndCashManagement.*
import net.xioh.qprise.tax.*
import net.xioh.qprise.resource.*
import net.xioh.qprise.attribute.*
import net.xioh.qprise.pricing.*

class OrderLine {

    Boolean isActive
    Orders orders//foranea
    Double line
    BusinessPartner businessPartner//foranea
    BusinessPartnerLocation businessPartnerLocation//foranea
    Date dateOrdered
    Date datePromised
    Date dateDelivered
    Date dateInvoiced
    String description
    Product product//foranea
    Warehouse warehouse//foranea
    Boolean directShip
    Uom uom//foranea
    Double qtyOrdered
    Double qtyReserved
    Double qtyDelivered
    Double qryInvoiced
    Shipper shipper//foranea
    Currency currency//foranea
    BigDecimal priceList//TODO: revisar tipo de dato
    BigDecimal priceActual
    BigDecimal priceLimit
    BigDecimal lineNetAmt
    Double discount
    Double freightAmt
    Charge charge//foranea
    Double chargeAmt
    Tax tax//foranea
    ResourceAssignment resourceAssignment//foranea
    OrderLine referenceOrderLine//foranea a si mismo
    AttributeSetInstance attributeSetInstance//foranea
    Boolean isDescription
    Double quantityOrder
    ProductUom productUom//foranea
    Offer offer//foranea
    BigDecimal priceStandard

    static constraints = {
    }
}


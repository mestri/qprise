package net.xioh.qprise.order

import net.xioh.qprise.documentType.*
import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.paymentTerm.*
import net.xioh.qprise.bankAndCashManagement.*
import net.xioh.qprise.warehouse.*
import net.xioh.qprise.pricing.*
import net.xioh.qprise.activityCampaignChannel.*
import net.xioh.qprise.project.*

class Orders {

    Boolean isActive
    Boolean isSOTrx
    String documentNo
    String docStatus
    String docAction
    Boolean processing
    Boolean processed
    DocumentType documentType//foranea
    DocumentType docTypeTarget//foranea documentType
    String description
    Boolean isDelivered
    Boolean isInvoiced
    Boolean isPrinted
    Boolean isSelected
    AdUser salesRep//foranea AD_USER
    Date dateOrdered
    Date datePromised
    Date datePrinted
    Date dateAcct
    BusinessPartner businessPartner//foranea
    BusinessPartnerLocation billTo//foranea BPARTNER_LOCATION
    BusinessPartnerLocation businessPartnerLocation//foranea
    String purchaseOrderReference//se cambio de nombre poreference
    Boolean isDiscountPrinted
    Currency currency//foranea
    String paymentRule
    PaymentTerm paymentTerm//foranea
    String invoiceRule
    String deliveryRule
    String freightCostRule
    Double freightAmt//revisar tipo dato (moneda?)
    String deliveryViaRule
    Shipper shipper//foranea
    Charge charge//foranea
    Double changeAmt//revisar tipo dato (moneda?)
    String priorityRule
    Double totalLines//revisar tipo dato (moneda?)
    Double grandTotal
    Warehouse warehouse//foranea
    PriceList priceList//foranea
    Boolean isTaxIncluded
    Campaign campaign//foranea
    Project project//foranea
    Activity activity//foranea
    String posted
    AdUser adUser//foranea
    Boolean copyFrom
    BusinessPartner dropShipBPartner//foranea BPARTNER
    BusinessPartnerLocation dropShipLocation//foranea BPARTNER_LOCATION
    AdUser dropShipUser//foranea aduser
    Boolean isSelfService
    String orgTrxId//TODO: foranea de AD_ORG
    String user1Id
    String user2Id
    String deliveryNotes
    Incoterms incoterms//foranea
    String incotermsDescription
    Boolean generateTemplate
    BusinessPartnerLocation deliveryLocation//foranea BPARTNER_LOCATION
    Boolean copyFromPO

    static constraints = {
    }
}


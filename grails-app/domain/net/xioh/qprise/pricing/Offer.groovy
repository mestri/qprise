package net.xioh.qprise.pricing

class Offer {

    Boolean isActive
    String name
    Double priority
    Double AddAmt
    Double discount
    Double fixed//TODO: revisar tipo dato (moneda)
    Date dateFrom
    Date dateTo
    String bPartnerSelection//podria ser: businessPartnerSelection
    String bPGroupSelection
    String  productSelection
    String prodCatSelection
    String description
    String priceListSelection
    Double qtyFrom
    Double qtyTo

    static constraints = {
    }
}

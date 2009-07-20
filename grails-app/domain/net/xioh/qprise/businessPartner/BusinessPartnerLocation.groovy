package net.xioh.qprise.businessPartner

class BusinessPartnerLocation {

	Boolean isActive = true
	String name
	Boolean isBillTo = true
	Boolean isShipTo = true
	Boolean isPayFrom = true
	Boolean isRemitTo = true
	String phone
	String phone2
	String fax
	// SalesRegion
	BusinessPartner businessPartner
	// Location
	Boolean isTaxLocation = false
	String upc

	static belongsTo = [BusinessPartner]

    static constraints = {
    }
}

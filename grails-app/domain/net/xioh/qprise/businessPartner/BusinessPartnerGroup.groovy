package net.xioh.qprise.businessPartner

class BusinessPartnerGroup {

	Boolean isActive = true
	String name
	String description
	Boolean isDefault = false

	static hasMany = [partners : BusinessPartner]

    static constraints = {
    }
}

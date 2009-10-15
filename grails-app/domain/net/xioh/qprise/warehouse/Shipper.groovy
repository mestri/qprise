package net.xioh.qprise.warehouse

import net.xioh.qprise.businessPartner.*

class Shipper {

	Boolean isActive
	String name
	String description
	//BusinessPartner businessPartner

        static belongsTo = [BusinessPartner]
        static hasMany = [freigths: Freight]

    static constraints = {
    }
}

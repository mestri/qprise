package net.xioh.qprise.warehouse

import net.xioh.qprise.businessPartner.*

class WarehouseShipper {

	Boolean isActive
	//Warehouse warehouse
	//BusinessPartner businessPartner
	Integer seqNo

        static belongsTo = [Warehouse, BusinessPartner]

    static constraints = {
    }
}

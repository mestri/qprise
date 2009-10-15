package net.xioh.qprise.warehouse

class Locator {

	Boolean isActive
        String value
	//Warehouse warehouse
	Integer priorityNo
	Boolean isDefault
	String x
	String y
	String z

        static belongsTo = [Warehouse]

    static constraints = {
    }
}

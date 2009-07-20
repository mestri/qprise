package net.xioh.qprise.warehouse

import net.xioh.qprise.location.*

/**
 *
 * @author onix
 */
class Warehouse {
	Boolean isActive
    String value
	String name
	String description
	Location location
	String separatorChar
	Boolean isShipper
	String shipperCode
	Integer fromDocumentNo
	Integer toDocumentNo

    static constraints = {
    }
}


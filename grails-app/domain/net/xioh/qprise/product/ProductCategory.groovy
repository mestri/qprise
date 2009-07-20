package net.xioh.qprise.product

import net.xioh.qprise.assets.*

class ProductCategory {
	
	Boolean isActive
	String value
	String name
	String description
	Boolean isDefault
	Float plannedMargin
	AssetGroup assetGroup

    static constraints = {
    }
}

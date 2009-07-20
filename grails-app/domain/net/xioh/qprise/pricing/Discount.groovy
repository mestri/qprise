package net.xioh.qprise.pricing

import net.xioh.qprise.product.*

class Discount {

    Boolean isActive
    String name
    String description
    Double discount
    Product product//foranea

    static constraints = {
    }
}

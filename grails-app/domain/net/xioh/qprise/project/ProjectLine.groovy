package net.xioh.qprise.project

import net.xioh.qprise.product.*
import net.xioh.qprise.order.*
import net.xioh.qprise.tax.*

class ProjectLine {

    //Integer projectLineId;
    Boolean isActive
    Project project//foranea
    Double line
    String description
    Double plannedQty
    Double plannedPrice
    Double plannedAmt
    Double plannedMarginAmt
    Double committedAmt
    Product product//foranea
    ProductCategory productCategory//foranea
    Double invoicedAmt
    Double invoicedQty
    Double committedQty
    ProjectIssue projectIssue//foranea
    Orders orders//foranea
    Orders orderPO//foranea
    Boolean isPrinted
    Boolean processed
    Boolean doPrising
    Double plannedPOPrice
    Tax tax//foranea
    String productDescription
    String productName
    String productValue

    static constraints = {
    }
}

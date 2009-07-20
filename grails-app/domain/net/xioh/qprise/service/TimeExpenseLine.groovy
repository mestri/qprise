package net.xioh.qprise.service

import net.xioh.qprise.product.*
import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.project.*
import net.xioh.qprise.activityCampaignChannel.*
import net.xioh.qprise.order.*
import net.xioh.qprise.invoice.*
import net.xioh.qprise.unitOfMeasure.*

class TimeExpenseLine {

    //Integer timeExpenseLineId;
    Boolean isActive
    TimeExpense timeExpense//foranea
    Double line
    Boolean isTimeReport
    Date dateExpense
    Product product//foranea
    Double qty
    Double expenseAmt
    Currency currency//foranea
    Double convertedAmt
    //ResourceAssignment resourceAssignment//foranea
    String description
    String note
    Boolean isInvoiced
    BusinessPartner businessPartner//foranea
    Project project//foranea
    Activity activity//foranea
    Campaign campaign//foranea
    InvoiceLine invoiceLine//foranea
    Double invoicePrice
    Uom uom//foranea
    OrderLine orderLine//foranea
    ProjectPhase projectPhase//foranea
    ProjectTask projectTask//foranea
    TimeType timeType//foranea

    static constraints = {
    }
}

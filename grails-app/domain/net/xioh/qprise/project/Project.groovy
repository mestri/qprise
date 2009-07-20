package net.xioh.qprise.project

import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.warehouse.*
import net.xioh.qprise.payment.term.*
import net.xioh.qprise.pricing.*
import net.xioh.qprise.activityCampaignChannel.*
import net.xioh.qprise.location.*

class Project {

    //Integer projectId;
    Boolean isActive
    String value
    String name
    String description
    String note
    Boolean isSummary
    AdUser adUser//foranea revisar nombre campo
    BusinessPartner businessPartner//foranea
    BusinessPartnerLocation businessPartnerLocation//foranea
    String pOReference
    PaymentTerm paymentTerm//foranea
    Currency currency//foranea
    Boolean createTempPriceList
    PriceListVersion priceListVersion//foranea
    Campaign campaign//foranea
    Boolean isCommitment
    Double plannedAmt
    Double plannedQty
    Double plannedMarginAmt
    Double committedAmt
    Date dateContract
    Date dateFinish
    Boolean generateTo
    Boolean processed
    AdUser salesRep//foranea
    Boolean copyFrom
    ProjectType projectType//foranea
    Double committedQty
    Double invoicedAmt
    Double invoicedQty
    Double projectBalanceAmt
    Phase phase//foranea
    ProjectPhase projectPhase//foranea
    Boolean isCommitCeiling
    Warehouse warehouse//foranea
    String projectCategory
    Boolean processing
    String publicPrivate
    String projectStatus
    String projectKind
    String billToId
    //String projectPhase
    Boolean generateOrder
    String chargeProjectStatus
    Location location//foranea
    PriceList priceList//foranea
    String paymentRule
    Boolean invoiceToProject
    Double plannedPOAmt
    Date lastPlannedProposalDate
    Double documentCopies
    String accountNo
    Double expExpences
    Double expMargin
    Double expReinvoicing
    BusinessPartner responsible//foranea
    Double servCost
    Double servMargin
    Double servRevenue
    Boolean setProjectType
    Date startDate

    static constraints = {
    }
}

package net.xioh.qprise.project

import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.payment.term.*

class ProjectProposal {

    //Integer projectProposalId;
    Boolean isActive
    Project project//foranea
    BusinessPartner businessPartner//foranea
    Date dateSed
    BusinessPartnerLocation businessPartnerLocation//foranea
    AdUser adUser//foranea
    Boolean copyFrom//TODO: revisar tipo de dato
    String headerNote
    String footNote
    Boolean isSOTrx
    PaymentTerm paymentTerm//foranea
    String paymentRule
    Boolean projectWon

    static constraints = {
    }
}

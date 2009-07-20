package net.xioh.qprise.payment.management

import net.xioh.qprise.documentType.*
import net.xioh.qprise.project.*
import net.xioh.qprise.activityCampaignChannel.*
import net.xioh.qprise.currency.*

class Settlement {

    //Integer settlementId
    Boolean isActive
    String documentNo
    Date dateTrx
    DocumentType documentType//foranea
    Boolean processing
    String processed
    String posted
    Project project//foranea
    Campaign campaign//foranea
    Activity activity//foranea
    String user1Id
    String userId
    Boolean createFrom
    Currency currency//foranea
    Double canceledNotChargeAmt
    Double generatedAmt
    Double chargeAmt
    String description
    Boolean createFile
    Date dateAcct
    String settlementType
    Boolean settlementOpen
    Boolean copyFrom
    Boolean isGenerated
    Boolean isTemplate

    static constraints = {
    }
}

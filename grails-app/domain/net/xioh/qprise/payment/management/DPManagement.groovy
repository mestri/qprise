package net.xioh.qprise.payment.management

import net.xioh.qprise.documentType.*
import net.xioh.qprise.project.*
import net.xioh.qprise.activityCampaignChannel.*
import net.xioh.qprise.currency.*

class DPManagement {

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
    String user2Id
    Boolean createFrom
    String description
    Date dateAcct
    Currency currency//foranea

    static constraints = {
    }
}

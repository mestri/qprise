package net.xioh.qprise.bankAndCashManagement

import net.xioh.qprise.project.*
import net.xioh.qprise.activityCampaignChannel.*

class Cash {

    //Integer cashId;
    Boolean isActive
    CashBook cashBook//foranea
    String name
    String description
    Date statementDate
    Date dateAcct
    BigDecimal beginningBalance//moneda
    BigDecimal endingBalance//moneda
    BigDecimal statementDifference//moneda
    Boolean processing
    String processed
    String posted
    String adOrgTrxId//TODO: revisar nombre... foranea relacion con ad_org
    Project projectId//foranea
    Campaign campaign//foranea
    Activity activity//foranea
    String user1Id
    String user2Id

    static constraints = {
    }
}

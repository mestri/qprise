package net.xioh.qprise.assets

import net.xioh.qprise.currency.*
import net.xioh.qprise.project.*
import net.xioh.qprise.activityCampaignChannel.*

class Amortization {
    //TODO: revisar las relaciones
    Boolean isActive
    String name
    String description
    Date startDate
    Date endDate
    Boolean processing
    String processed
    String posted
    Project project
    Campaign campaign
    Activity activity
    String user1Id
    String user2Id
    Date dateAcct
    Currency curerncy
    Double totalAmortization

    static hasMany = [amortizationLines:AmortizationLine]
    static constraints = {
    }
}


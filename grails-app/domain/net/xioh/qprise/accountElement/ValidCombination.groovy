package net.xioh.qprise.accountElement
import net.xioh.qprise.product.*
import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.location.*
import net.xioh.qprise.project.*
import net.xioh.qprise.activityCampaignChannel.*



class ValidCombination {

    //TODO: revisar las relaciones
    Boolean isActive
    String alias
    String combination
    String description
    Boolean isFullyQualified
    //Account account
    Product product
    BusinessPartner businessPartner
    Location locFrom
    Location locTo
    Region salesRegion
    Project project
    Campaign campaign
    Activity activity
    String user1Id
    String user2Id

    static constraints = {

    }
}


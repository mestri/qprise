package net.xioh.qprise.activityCampaignChannel

class Campaign {

    Boolean isActive
    String value
    String name
    String description
    Channel channel//foranea
    Date startDate
    Date endDate
    BigDecimal cost//moneda

    static constraints = {
    }
}

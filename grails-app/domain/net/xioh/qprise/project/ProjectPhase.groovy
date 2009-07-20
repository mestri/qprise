package net.xioh.qprise.project

import net.xioh.qprise.order.*
import net.xioh.qprise.product.*

class ProjectPhase {

    Project project//foranea
    Boolean isActive
    String description
    Date startDate
    Date endDate
    Boolean isComplete
    Product product//foranea
    Double priceActual
    Boolean generateOrder
    Orders orders//foranea
    Phase phase//foranea
    Integer projectPhaseId
    String help
    String name
    Double qty
    Double seqNo
    Double committedAmt
    Boolean isCommitCeiling
    Date dateContract

    static constraints = {
    }
}

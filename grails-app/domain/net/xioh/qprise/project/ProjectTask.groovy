package net.xioh.qprise.project

import net.xioh.qprise.product.*

class ProjectTask {

    //Integer projectTaskId;
    Task task//foranea
    Boolean isActive
    Double seqNo
    String name
    String description
    String help
    Product product//foranea
    ProjectPhase projectPhase//foranea
    Double qty
    Date startDate
    Date endDate
    Boolean isComplete
    Double priceActual
    Double committedAmt
    Boolean isCommitCeiling
    Date dateContract

    static constraints = {
    }
}

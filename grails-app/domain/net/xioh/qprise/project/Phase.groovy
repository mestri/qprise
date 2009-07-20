package net.xioh.qprise.project

import net.xioh.qprise.product.*

class Phase {

    //Integer phaseId;
    Boolean isActive
    Double seqNo
    String name
    String description
    String help
    ProjectType projectType//foranea
    Double standardQty
    Product product//foranea
    Double stdDuration

    static constraints = {
    }
}

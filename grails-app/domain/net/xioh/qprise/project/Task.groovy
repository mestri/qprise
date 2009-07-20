package net.xioh.qprise.project

import net.xioh.qprise.product.*

class Task {

    //Integer taskId;
    Boolean isActive
    Double seqNo
    String name
    String description
    String help
    Phase phase//foranea
    Product product//foranea
    Double standardQty
    Double stdDuration

    static constraints = {
    }
}

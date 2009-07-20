package net.xioh.qprise.project

import net.xioh.qprise.product.*

class ProjectProposalLine {

    //Integer projectProposalLine;
    Boolean isActive
    ProjectProposal projectProposal//foranea
    Double lineNo
    Product product//foranea
    Double qty
    Double price
    String description
    String productDescription
    String productName
    String productValue

    static constraints = {
    }
}

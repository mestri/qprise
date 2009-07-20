package net.xioh.qprise.documentType

class DocumentType {

    Boolean isActive
    String name
    String printName
    String description
    String docBaseType
    Boolean isSOTrx
    String docSubTypeSO
    DocumentType docTypeShipment//foranea
    DocumentType docTypeInvoice//foranea
    Boolean isDocNoControlled
    //TODO: revisar nombre
    Sequence docNoSequence//foranea
    //TODO: revisar nombre GL_CATEGORY_ID
    //Category category//foranea
    String documentNote
    Boolean isDefault
    Double documentCopies//dato original decimal 10.0
    //TODO: revisar nombre AD_TABLE_ID
    //Table table//foranea
    Boolean orgFiltered
    DocumentType docTypeReversed//foranea

    static constraints = {
    }
}

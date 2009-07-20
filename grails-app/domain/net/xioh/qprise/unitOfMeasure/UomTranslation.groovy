package net.xioh.qprise.unitOfMeasure

import net.xioh.qprise.translations.*

class UomTranslation {

    Uom uomId//foranea
    //TODO: revisar nombre AD_LANGUAGE
    Language language//foranea
    Boolean isActive
    String uomSymbol
    String name
    String description
    Boolean isTranslated

    static constraints = {
    }
}

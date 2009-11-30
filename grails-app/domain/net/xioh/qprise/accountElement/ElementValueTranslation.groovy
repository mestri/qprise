package net.xioh.qprise.accountElement
import net.xioh.qprise.translations.*

class ElementValueTranslation {
    //TODO: revisar las relaciones
    //Language language
    //ElementValue elementValue
    Boolean isActive
    String name
    String description
    Boolean isTranslated

    static belongsTo = [language:Language, elementValue:ElementValue]

    static constraints = {
    }
}


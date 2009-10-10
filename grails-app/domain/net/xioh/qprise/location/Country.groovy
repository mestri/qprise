package net.xioh.qprise.location

import net.xioh.qprise.translations.*

class Country {

    //TODO: se apunta a si mismo
    Country country//foranea
    Boolean isActive
    String name
    String description
    String countryCode//revisar tipo de dato char 2
    Boolean hasRegion
    String regionName
    String expressionPhone
    String displaySequence
    String expressionpostal
    Boolean hasPostalAdd
    String expressionpostalAdd
    Boolean isDefault
    Language language//foranea
    Currency currency//foranea
    Double IBanNoDigits//revisar tipo dato
    String IBanCountry

    String nada

    static constraints = {
    }
}

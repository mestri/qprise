package net.xioh.qprise.location

class Location {

    Boolean isActive
    String address1
    String address2
    String city
    String postal
    String postalAdd
    Country country//foranea
    Region region//foranea
    //TODO: revisar nombre ya existe city
    //City city//foranea
    String regionName

    static constraints = {

    }

    static mapping = {
        version false
    }

}

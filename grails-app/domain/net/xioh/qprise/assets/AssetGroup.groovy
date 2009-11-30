package net.xioh.qprise.assets

class AssetGroup {
    //TODO: revisar relaciones
    Boolean isActive
    String name
    String description
    String help
    Boolean isOwned
    Boolean isDeprecated

    static hasMany = [assets:Asset]

    static constraints = {
    }
}


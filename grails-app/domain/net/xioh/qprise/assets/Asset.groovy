package net.xioh.qprise.assets
import net.xioh.qprise.product.*
import net.xioh.qprise.warehouse.*
import net.xioh.qprise.businessPartner.*
import net.xioh.qprise.location.*
import net.xioh.qprise.currency.*

class Asset {

    Boolean isActive
    String value
    String name
    String description
    String help
    //AssetGroup assetGroup
    Product product
    String serNo
    String lot
    String versionNo
    Date guaranteeDate
    Date assetServiceDate
    Boolean isOwned
    Date assetDepreciationDate
    Integer useLifeYears
    Integer useLifeMonths
    Integer lifeUseUnits
    Integer useUnits
    Boolean isDisposed
    Date assetDisposalDate
    Boolean isInPossesion
    String locationComment
    Locator locator
    BusinessPartner businessPartner
    Location businessPartnerLocation
    Location location
    String processing
    Boolean isDepreciated
    Boolean isFullyDepreciated
    //User addUserId
    Date amortizationStartDate
    Date amortizationEndDate
    Double anualAmortizationPercentage
    Double assetValueAmt
    Currency currency
    Date dateCancelled
    Date datePurchased
    AttributeSetInstance attributeSetInstance
    Double residualAssetValueAmt
    Double acctValueAmt
    String amortizationType
    Double amortizationValueAmt
    String assetSchedule
    String documentNo
    Boolean processed
    Double profit
    Integer qty
    String amortizationCalcType
    String depreciatedPlan
    Double depreciatedPreviousAmt
    Double depreciatedValue


    static belongs = [assetGroup:AssetGroup]

    static constraints = {
    }
}


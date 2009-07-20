package net.xioh.qprise.businessPartner

class BusinessPartner {
	Boolean isActive = true
	String name
	String name2
	String description
	Boolean isSummary = false
	BusinessPartnerGroup group
	Boolean isoTime = false
	Boolean isProspect = true
	Boolean isVendor = false
	Boolean isCustomer = true
	Boolean isEmployee = false
	Boolean isSalesRep = false
	String referenceNo
	String url
	//ADLAnguage ???
	String taxId
	Boolean isTaxExempt = false
	// TODO: Terminar
	//InvoiceSchedule invoiceSchedule
	String rating
	Integer salesVolume
	Integer numberEmployees
	String naics
	Date firstSale
	BigDecimal acqusictionCost = 0
	BigDecimal potencialLifeTimeValue = 0
	BigDecimal actualLifeTimeValue = 0
	Integer shareOfCustomer
	String paymentRule
	BigDecimal soCreditLimit = 0
	BigDecimal soCreditUsed = 0
	// TODO: Terminar esto
	// PaymentTerm paymentTerm
	// PriceList priceList
	String soDescription
	String poReference
	String paymentRulePo
	// POPriceList
	// POPaymentTerm
	Integer documentCopies
	// Gretting
	String invoiceRule
	String deliveryRule
	String deliveryVLaRule
	//SalesRep
	// BussinesPartner parent
	String soCreditStatus = 'O'
	// ForcedOrg
	Boolean showPriceInOrder = true
	String invoiceGrouping
	Integer fixMonthDay
	Integer fixMonthDay2
	Integer fixMonthDay3
	Boolean isWorker = false
	String upc
	// SalaryCategory
	String invoicePrintFormat
	Integer lastDays
	// POBankAccount
	// POTaxCategory
	String fiscalCode
	String isoFiscalCode

	static belongsTo = [BusinessPartnerGroup]
	static hasMany = [locations : BusinessPartnerLocation]

    static constraints = {
    }
}
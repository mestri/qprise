package net.xioh.qprise.businessPartner

import net.xioh.qprise.location.*

class BusinessPartnerBankAccount {
	
	Boolean isActive
	BusinessPartner businessPartner
	String bankAccountType
	String routingNo
	String accountNo
	String creditCardType
	String creditCardNumber
	Double creditCardExpMM
	Double creditCardExpYY
	String aName
	String aStreet
	String aCity
	String aState
	String aZip
	String aIdentDL
	String aEmail
	String aIdentSSN
	String aAvsZip
	String aCountry
	// AdUser adUser
	String bankName
	String IBAN
	Boolean showAccountNo
	Boolean showIBAN
	String displayedAccount
	Country counbtr

    static constraints = {
    }
}

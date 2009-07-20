package net.xioh.qprise.currency

import grails.converters.*

class CurrencyController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    static allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        params.max = Math.min( params.max ? params.max.toInteger() : 10,  100)
        [ currencyInstanceList: Currency.list( params ), currencyInstanceTotal: Currency.count() ]
    }

	def currencyDetail = {
		render(template:"currencyDetail", model:[currency:Currency.get(params.id)])
	}

	def myDataTableJSON = {
		def currencys = Currency.list(params)
		def currencysList = currencys.collect {
			[
				id: it.id,
				description: it.description,
				dataUrl: g.createLink(action: 'show', id: it.id)
			]
		}
		
		def data = [
			totalRecords: Currency.count(),
			results: currencysList
		]
		
		
		render data as JSON
	}



	def dataTableJSON = {
		def currencys = Currency.list(params)
		def list = []
		currencys.each {
			list << [
				id: it.id,
				description: it.description,
				dataUrl: g.createLink(action: 'show')
			]
		}
		
		def data = [
			totalRecords: Currency.count(),
			results: currencys
		]
		
		
		render data as JSON
	}

    def show = {
        def currencyInstance = Currency.get( params.id )

        if(!currencyInstance) {
            flash.message = "Currency not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ currencyInstance : currencyInstance ] }
    }

    def delete = {
        def currencyInstance = Currency.get( params.id )
        if(currencyInstance) {
            try {
                currencyInstance.delete(flush:true)
                flash.message = "Currency ${params.id} deleted"
                redirect(action:list)
            }
            catch(org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "Currency ${params.id} could not be deleted"
                redirect(action:show,id:params.id)
            }
        }
        else {
            flash.message = "Currency not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def currencyInstance = Currency.get( params.id )

        if(!currencyInstance) {
            flash.message = "Currency not found with id ${params.id}"
            redirect(action:list)
        }
        else {
            return [ currencyInstance : currencyInstance ]
        }
    }

    def update = {
        def currencyInstance = Currency.get( params.id )
        if(currencyInstance) {
            if(params.version) {
                def version = params.version.toLong()
                if(currencyInstance.version > version) {
                    
                    currencyInstance.errors.rejectValue("version", "currency.optimistic.locking.failure", "Another user has updated this Currency while you were editing.")
                    render(view:'edit',model:[currencyInstance:currencyInstance])
                    return
                }
            }
            currencyInstance.properties = params
            if(!currencyInstance.hasErrors() && currencyInstance.save()) {
                flash.message = "Currency ${params.id} updated"
                redirect(action:show,id:currencyInstance.id)
            }
            else {
                render(view:'edit',model:[currencyInstance:currencyInstance])
            }
        }
        else {
            flash.message = "Currency not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def create = {
        def currencyInstance = new Currency()
        currencyInstance.properties = params
        return ['currencyInstance':currencyInstance]
    }

    def save = {
        def currencyInstance = new Currency(params)
        if(!currencyInstance.hasErrors() && currencyInstance.save()) {
            flash.message = "Currency ${currencyInstance.id} created"
            redirect(action:show,id:currencyInstance.id)
        }
        else {
            render(view:'create',model:[currencyInstance:currencyInstance])
        }
    }
}
